package Server_Side;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author descifrado
 */

public class ClientHandler implements Runnable
{
    private final Socket client;
    private DataInputStream dis;
    private DataOutputStream dos;
    private String user_name;
    private Connection con;
    private static Statement stmt;
    
    //CONSTRUCTOR
    ClientHandler(Socket client) 
    {
        this.client=client;
        try
        {
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/MAR_JAVA","root","modi");
            stmt=con.createStatement();
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    
    //MAIN WORKING START FROM HERE
    @Override
    public void run() 
    {
        try
        {
            // OPENING STREAMS WITH THE CLIENT SOCKET
            dis=new DataInputStream(client.getInputStream());
            dos=new DataOutputStream(client.getOutputStream());
            user_name=dis.readUTF();
            
            
            
            // FOR A NEW CUSTOMER SIGN UP
            if(user_name.equals("New Customer"))
            {
                System.out.println("Connected To a new Customer Signup Initiated");
                boolean done=addCustomer();
                if(done)
                {
                    dos.writeUTF("ho_gya");
                    System.out.println("New Customer Successfully Added");
                }
                else
                {
                    dos.writeUTF("nhi hua");
                }
            }
            
            
            //FOR AN EXISTING CUSTOMER LOG IN
            else
            {
                String pass=dis.readUTF(); //password entered by user
                String actual_pass=getPassword(); //password fetched from database
                if(actual_pass.equals(pass))
                {
                    dos.writeUTF("Valid"); 
                    System.out.println("Connection Successfully made");
                    updateLoginStatus(1);
                }
                else
                {
                    dos.writeUTF("Invalid");
                }
            }
            
            
            // After Log in Customer will send request and Server will send response
            while(client.isClosed()==false) // Connection Closes on log_out
            {
                String request=dis.readUTF();
                System.out.println(request);
                String response=getResponse(request);
                System.out.println(response);
                dos.writeUTF(response);
            }
            
        }
        catch (IOException ex) 
        {
            System.out.println("Error IO "+ex.getMessage());
        } 
    }
    
    
    
    
    
    // This Will Take request sent to server and generate response to be sent by server
    private String getResponse(String request) 
    {
        String response="";
        
        //Specialised Request Needed to be handled separately
        
        // Specialised request 1
        if(request.equals("Offers For Customer"))
        {
            String query="select OFFER_CODE,OFFER_DESC,OFFER_VALIDITY from CUSTOMERS where USER_NAME='"+(user_name)+"';";
            try 
            {
                ResultSet rs=stmt.executeQuery(query);
                rs.next();
                String oc=rs.getString("OFFER_CODE");
                String od=rs.getString("OFFER_DESC");
                String ov=rs.getString("OFFER_VALIDITY");
                response=oc+'~'+od+'~'+ov;
            }
            catch (SQLException ex) 
            {
                response="error";
                System.out.println(ex.getMessage());
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Specialised request 2
        else if(request.equals("Products With Offers"))
        {
            String query="select *from Inventory where offer_code!='';";
            ResultSet rs;
            try 
            {
                rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    String pi=rs.getString("PROD_ID");
                    String oc=rs.getString("OFFER_CODE");
                    String od=rs.getString("OFFER_DESC");
                    String ov=rs.getString("OFFER_VALIDITY");
                    String respon=pi+'~'+oc+'~'+od+'~'+ov;
                    response+=respon+'`';
                }
            }
            catch (SQLException ex) 
            {
                response="error";
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);               
            }           
        }
        
        
        else if(request.equals("Log_out"))
        {
            updateLoginStatus(0);
            response="done";             
        }
        
        
        
        else if(request.equals("All ProductsP") || request.equals("All ProductsM") || request.equals("All ProductsC"))
        {
            response=getProductList(request);            
        }
        
        else if(request.equals("UpdateCust"))
        {
            String newDetails="";
            try 
            {
                newDetails = dis.readUTF();
            }
            catch (IOException ex) 
            {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
            response=updateCustomerDetails(newDetails);
        }
        
        
        else if(request.equals("MyCart"))
        {
            response=getCartDetails();
        }
        
        
        
        
        else if(request.equals("AddCart"))
        {
            response=addToCart();
        }
        
        else if(request.equals("MyOrder"))
        {
            response=getOrders();
        }
        
        else if(request.equals("getOfferCode"))
        {
            response=getOfferCode();
        }
        
        else if(request.substring(0,2).equals("DC"))
        {
            response=deleteFromCart(request.substring(2));
        }
        
        else if(request.substring(0,4).equals("PDet"))
        {
            response=getProductDetails(request.substring(4));
        }
        
        
        else if(request.substring(0,4).equals("CDet"))
        {
            System.out.println("Request Successful"+request.substring(4));
            response=getCustomerDetails(request.substring(4));
        }
        
        else if(request.equals("addTransaction"))
        {
            response=addTransaction();
        }
        
        
        
        return response;       
    }
    
    
    
    
    // Below Methods Are Used To help getResponse()
    
    //To get a customer's offer
    private String getOfferCode()
    {
        String response="";
        String query="select OFFER_CODE,OFFER_DESC,OFFER_VALIDITY from Customers where USER_NAME='"+(user_name)+"';";
        try 
        {
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String oc=rs.getString("OFFER_CODE");
            String od=rs.getString("OFFER_DESC");
            String ov=rs.getString("OFFER_VALIDITY");
            response=oc+'`'+od+'`'+ov;
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return response;
    }
    
    
    
    //To Add A Transaction
    private String addTransaction()
    {
        String response="";
        
        String ti="";
        String fn="";
        String ln="";
        String fulln="";
        String amt="";
        Double r=Math.random();
        r=r*1000;
        int id;
        id=(int)Math.floor(r);
        ti="ODR"+Integer.toString(id)+"TR";
        String query1="select FIRST_NAME ,LAST_NAME from CUSTOMERS where USER_NAME='"+(user_name)+"';";
        String query2="select SUM(PRICE*QUANT) from CART where USER_NAME='"+(user_name)+"' and STATUS='N';";
        try 
        {
            ResultSet rs=stmt.executeQuery(query1);
            rs.next();
            fn=rs.getString("FIRST_NAME");
            ln=rs.getString("LAST_NAME");
            fulln=fn+ln;
            rs.close();
            ResultSet sr=stmt.executeQuery(query2);
            sr.next();
            amt=sr.getString("SUM(PRICE*QUANT)");
            sr.close();
            
            String query="insert into TRANSACTION values('"+(ti)+"','"+(user_name)+"','"+(fulln)+"',CURDATE(),'"+(amt)+"');";
            stmt.executeUpdate(query);
            dos.writeUTF(ti);
            response="done";
            
            String qU="update CART set STATUS='O' where USER_NAME='"+(user_name)+"';";
            stmt.executeUpdate(qU);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return response;
    }
    
    
    
    //To get All The Previous Order From  
    private String getOrders()
    {
        String response="";
        try
        {
            String query="select * from CART where USER_NAME='"+(user_name)+"' and STATUS='O';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String res="";
                String pi=rs.getString("PROD_ID");
                String pn=rs.getString("PROD_NAME");
                String pr=rs.getString("PRICE");
                String q=rs.getString("QUANT");
                String da=rs.getString("DATE_ADDED");
                res=pi+'`'+pn+'`'+pr+'`'+q+'`'+da+'@';
                response +=res;
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null,ex);
        }
        return response;
    }
    
    
    //To Add To The Cart
    private String addToCart()
    {
        String pi="",pn="",pr="",q="";
        try 
        {
            pi=dis.readUTF();
            pn=dis.readUTF();
            pr=dis.readUTF();
            q=dis.readUTF();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }        
        String response="";
        String Query="select EXISTS(select * from CART where USER_NAME='"+(user_name)+"' and PROD_ID='"+(pi)+"' and STATUS='N');";
        
        try
        {
            ResultSet sr=stmt.executeQuery(Query);
            sr.next();
            String ans=sr.getString("EXISTS(select * from CART where USER_NAME='"+(user_name)+"' and PROD_ID='"+(pi)+"' and STATUS='N')");
            sr.close();
            if(ans.equals("1"))
            {
                String query="update CART set QUANT=QUANT+'"+(q)+"' where USER_NAME='"+(user_name)+"' and PROD_ID='"+(pi)+"' and STATUS='N';";
                stmt.executeUpdate(query);
            }
            else
            {
                String query="insert into cart values('"+(user_name)+"','"+(pi)+"','"+(pn)+"','"+(pr)+"','"+(q)+"',curdate(),'N');";
                stmt.executeUpdate(query);      
            }
            String upd="update INVENTORY set QUANTITY=QUANTITY-'"+(q)+"' where PROD_ID='"+(pi)+"';";
            stmt.executeUpdate(upd);
            response="done";
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    
    
    // To delete a particular product from cart
    private String deleteFromCart(String pi)
    {
        String response="",q="";
        try 
        {
            q=dis.readUTF();
        }
        catch (IOException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            String query="delete from CART where PROD_ID='"+(pi)+"' and STATUS='N';";
            stmt.executeUpdate(query);
            String que="update INVENTORY set QUANTITY=QUANTITY+'"+(q)+"' where PROD_ID='"+(pi)+"';";
            stmt.executeUpdate(que);
            response="done";
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    
    
    
    //To Get The Cart Details Of This Customer
    private String getCartDetails()
    {
        String response="",pi="",pr="";
        try
        {            
            String query="select * from CART where USER_NAME='"+(user_name)+"' and STATUS='N';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String res="";
                pi=rs.getString("PROD_ID");
                String pn=rs.getString("PROD_NAME");
                String q=rs.getString("QUANT");
                pr=rs.getString("PRICE");
                String da=rs.getString("DATE_ADDED");
                res=pi+'`'+pn+'`'+pr+'`'+q+'`'+da+'@';
                response+=res;
            }            
        }
        catch (SQLException ex) 
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return response;
    }
    
    
    
    
    //To update The Details Of A particular Customer
    private String updateCustomerDetails(String newDetails)
    {
        String conf="";
        try 
        {            
            String data[]=newDetails.split("`");
            String query="Update CUSTOMERS set FIRST_NAME='"+(data[0])+"',LAST_NAME='"+(data[1])+"',GENDER='"+(data[2])+"',AGE='"+(data[3])+"',CONTACT_NUMBER='"+(data[4])+"',EMAIL_ID='"+(data[5])+"',PASSWORD='"+(data[6])+"' where USER_NAME='"+(user_name)+"';";
            stmt.executeUpdate(query);
            conf="yes";
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conf;
    }
    
    
    
    // To get Password from database of a customer attempting to log in
    private String getPassword()
    {
        try
        {
            String q1="Select PASSWORD From CUSTOMERS where USER_NAME='"+(user_name)+"';";
            ResultSet rs=stmt.executeQuery(q1);
            rs.next();
            String actual_pass=rs.getString("PASSWORD");
            rs.close();
            return actual_pass;            
        }
        catch(Exception e)
        {
            System.out.println("Server ERROR "+e.getMessage());
            return "error";
        }        
    }
    
    
    
        
    // New User Sign UP
    private boolean addCustomer() throws IOException
    {
        System.out.println("Recieving details");
        String details=dis.readUTF();
        try
        {
            String data[];
            data=details.split("~");
            String q1="insert into CUSTOMERS values('"+(data[0])+"','"+(data[1])+"','"+(data[2])+"','"+(data[3])+"','"+(data[4])+"','"+(data[5])+"','"+(data[6])+"','"+(data[7])+"',CURDATE(),'','',null,'N')";
            stmt.executeUpdate(q1);
            return true;
        }
        catch(Exception e)
        {
            System.out.println("Server Error"+e.getMessage());
            return false;
        }
    }
    
    
    
    
    // If a user is logged in his status is Y(1) otherwise N(0)
    private void updateLoginStatus(int status)
    {
        try
        {
            char ch='Y';
            if(status==1)
                ch='Y';
            if(status==0)
                ch='N';
            String q1="update CUSTOMERS set LOG='"+(ch)+"' where USER_NAME='"+(user_name)+"';";
            stmt.executeUpdate(q1);
        }
        catch(Exception ex) 
        {
            System.out.println("SERVER ERROR: "+ex.getMessage());
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
        
    
    
    
    // To give A Sorted list of products
    private static String getProductList(String sortby)
    {
        String Sby="PRODUCT_NAME";
        if(sortby.endsWith("P"))
        {
            Sby="PRODUCT_NAME";
        }
        if(sortby.endsWith("C"))
        {
            Sby="CATEGORY";
        }
        if(sortby.endsWith("M"))
        {
            Sby="PRICE";
        }
        String response="";
        try
        {
            String query="select * from INVENTORY order by "+(Sby)+";";
            System.out.println(query);
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String pi=rs.getString("PROD_ID");
                String pn=rs.getString("PRODUCT_NAME");     
                String bn=rs.getString("BRAND_NAME");
                String c=rs.getString("CATEGORY");
                String p=rs.getString("PRICE");
                String pd=rs.getString("PROD_DESC");
                String md=rs.getString("MANUF_DATE");
                String ed=rs.getString("EXP_DATE");
                String mdet=rs.getString("MANUF_DETAILS");
                String q=rs.getString("QUANTITY");
                String oc=rs.getString("OFFER_CODE");
                String od=rs.getString("OFFER_DESC");
                String ov=rs.getString("OFFER_VALIDITY");
                String res=pi+'`'+pn+'`'+bn+'`'+c+'`'+p+'`'+pd+'`'+md+'`'+ed+'`'+mdet+'`'+q+'`'+oc+'`'+od+'`'+ov+'@';
                response+=res;
            }
            System.out.println(response);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return response;
    }
    
    
    
    
    // To get All The details Of a particular Product
    public static String getProductDetails(String Prod_id)
    {
        String prod_details="h";
        
        try
        {
            String query="select * from Inventory where prod_id='"+(Prod_id)+"';";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String pi=rs.getString("PROD_ID");
            String pn=rs.getString("PRODUCT_NAME");     
            String bn=rs.getString("BRAND_NAME");
            String c=rs.getString("CATEGORY");
            String p=rs.getString("PRICE");
            String pd=rs.getString("PROD_DESC");
            String md=rs.getString("MANUF_DATE");
            String ed=rs.getString("EXP_DATE");
            String mdet=rs.getString("MANUF_DETAILS");
            String q=rs.getString("QUANTITY");
            String oc=rs.getString("OFFER_CODE");
            String od=rs.getString("OFFER_DESC");
            String ov=rs.getString("OFFER_VALIDITY");
            prod_details=pi+'`'+pn+'`'+bn+'`'+c+'`'+p+'`'+pd+'`'+md+'`'+ed+'`'+mdet+'`'+q+'`'+oc+'`'+od+'`'+ov;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return prod_details;
    }
    
    
    // To get Details Of A customer
    public static String getCustomerDetails(String user_name)
    {
        String cust_det="ko";
        try 
        {            
            String query="select * from CUSTOMERS where USER_NAME='"+(user_name)+"';";
            ResultSet rs=stmt.executeQuery(query);
            rs.next();
            String fn=rs.getString("FIRST_NAME");
            String ln=rs.getString("LAST_NAME");
            String g=rs.getString("GENDER");
            String a=rs.getString("Age");
            String cn=rs.getString("CONTACT_NUMBER");
            String eid=rs.getString("EMAIL_ID");
            String pass=rs.getString("PASSWORD");
            String dj=rs.getString("DATE_JOINED");
            String oc=rs.getString("OFFER_CODE");
            String od=rs.getString("OFFER_DESC");
            String ov=rs.getString("OFFER_VALIDITY");
            cust_det=fn+'`'+ln+'`'+g+'`'+a+'`'+cn+'`'+eid+'`'+pass+'`'+dj+'`'+oc+'`'+od+'`'+ov;
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex.getMessage());
            Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(cust_det);
        return cust_det;
    }
    
}




