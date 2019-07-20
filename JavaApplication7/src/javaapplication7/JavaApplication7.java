package javaapplication7;

import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication7 
{
    
    public static void main(String[] args) throws ClassNotFoundException , SQLException , IOException 
    {
        ServerSocket ss=null;
        try
        {
            ss=new ServerSocket(sym_const.port);
        }
        catch(Exception e)
        {
            System.out.println(" excption caught "+e);
        }
        
        while(true)
        {
            Socket s=null;
            try
            {
                s=ss.accept();
                System.out.println("connected");
                DataInputStream dis=new DataInputStream(s.getInputStream());
                DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream ois=new ObjectInputStream(s.getInputStream());

                Thread t=new ClientHandler(s,dis,dos,ois,oos);
                t.start();
            }
            catch(Exception e)
            {
                s.close();
                System.out.println("exception caught is "+e);
            }
        }
    }
    
}

class ClientHandler extends Thread
{
     final DataInputStream dis;
     final DataOutputStream dos;
     final ObjectInputStream ois;
     final ObjectOutputStream oos;
     final Socket s;
     Connection connection;
     String url;
    
    public ClientHandler(Socket s,DataInputStream dis,DataOutputStream dos,ObjectInputStream ois,ObjectOutputStream oos){
        this.s=s;
        this.dis=dis;
        this.dos=dos;
        this.ois=ois;
        this.oos=oos;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println("exception caught is "+e);
        }
        url = "jdbc:mysql://localhost:3306/sacred_bazaar_new";
        try{
        connection = DriverManager.getConnection(url, "root", "gaurav");
        }
        catch(SQLException e){
            System.out.println("exception caught is "+e);
        }
    }

    public void run(){
        String received="";
        while(true){
             // System.out.println("debug-");
              try{
              received=dis.readUTF();
              }
              catch(IOException e){
                  continue;
                //  System.out.println("exception caught is "+e);
              }
             // System.out.println("received- "+received);
              if(received.equals("break")==true)
                break;
             
              String find_table=received.substring(0,1);
              String type=received.substring(1,2);
              received=received.substring(2,received.length());
              PreparedStatement preStat=null;
            try {
                 preStat = connection.prepareStatement(received);
            } catch (SQLException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(type+" "+find_table+" "+received);
            
              if(type.equals("0"))
                try {
                    preStat.executeUpdate();
                  try {
                      dos.writeUTF("1");
                  } catch (IOException ex) {
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              } catch (SQLException ex) {
                  try {
                      dos.writeUTF("0");
                  } catch (IOException ex1) {
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex1);
                  }
                  Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  System.out.println("exception caught is hello\n");
              }

              else if(type.equals("1")){
                  System.out.println("here");
              ResultSet rs2=null;
                  try {
                      rs2 = preStat.executeQuery();
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello2\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              int size =0;
              if (rs2 != null) 
               {
                  try {
                      rs2.last();    // moves cursor to the last row
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello3\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  try {
                      size = rs2.getRow(); // get row id 
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello4\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
               }
                  try {
                      rs2.close();
                  } catch (SQLException ex) {
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              ResultSet rs1=null;
                  try {
                      rs1 = preStat.executeQuery();
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello1\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              
               String query_size=""+size;
                  try {
                      dos.writeUTF(query_size);
                  } catch (IOException ex) {
                      System.out.println("exception caught is hello5\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }

              if(find_table.equals("1")){

                  try {
                      //     prod_info table
                      
                      while(rs1.next()) {
                          prod_info obj1=new prod_info();
                          obj1.prod_id=rs1.getString("prod_id");
                          obj1.prod_name=rs1.getString("prod_name");
                          obj1.owner_name=rs1.getString("owner_name");
                          obj1.type=rs1.getString("type");
                          obj1.description=rs1.getString("description");
                          obj1.qty_left=rs1.getString("qty_left");
                          obj1.qty_ini=rs1.getString("qty_ini");
                          obj1.price=rs1.getString("price");
                          try {
                              oos.writeObject(obj1);
                              oos.flush();
                          } catch (IOException ex) {
                              System.out.println("exception caught is hello6\n");
                              Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello7\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              else if(find_table.equals("2")){

                  try {
                      //      retailer_table info
                      
                      while(rs1.next()) {
                          retailer_info obj1=new retailer_info();
                          obj1.retailer_id=rs1.getString("retailer_id");
                          obj1.username=rs1.getString("username");
                          obj1.name=rs1.getString("name");
                          obj1.mobile_no=rs1.getString("mobile_no");
                          obj1.email_id=rs1.getString("email_id");
                          obj1.password=rs1.getString("password");
                          obj1.shop_address=rs1.getString("shop_address");
                          obj1.gender=rs1.getString("gender");
                          obj1.age=rs1.getString("age");
                          obj1.shopname=rs1.getString("shopname");
                          try {
                              oos.writeObject(obj1);
                              oos.flush();
                          } catch (IOException ex) {
                              System.out.println("exception caught is hello8\n");
                              Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello9\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              else if(find_table.equals("3")){

                  try {
                      //      trans_table info
                      
                      while(rs1.next()) {
                          trans_info obj1=new trans_info();
                          obj1.customer_name=rs1.getString("cutomer_name");
                          obj1.trans_id=rs1.getString("trans_id");
                          obj1.product_name=rs1.getString("product_name");
                          obj1.quantity=rs1.getString("quantity");
                          obj1.total_cost=rs1.getString("total cost");
                          obj1.type=rs1.getString("type");
                          obj1.description=rs1.getString("description");
                          obj1.status=rs1.getString("status");
                          try {
                              oos.writeObject(obj1);
                              oos.flush();
                          } catch (IOException ex) {
                              System.out.println("exception caught is hello10\n");
                              Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello11\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
              else if(find_table.equals("4")){
                System.out.println("size is "+size);
                  try {
                      //      user_info table
                      user_info obj1=new user_info();
                      if(rs1==null)
                          System.out.println("rs1 is null");
                      while(rs1.next()){
                          
                          obj1.customer_id=rs1.getString("customer_id");
                          obj1.username=rs1.getString("username");
                          obj1.name=rs1.getString("name");
                          obj1.mobile_no=rs1.getString("mobile_no");
                          obj1.email_id=rs1.getString("email_id");
                          obj1.password=rs1.getString("password");
                          obj1.address=rs1.getString("address");
                          obj1.gender=rs1.getString("gender");
                          obj1.age=rs1.getString("age");
                          try {
                              oos.writeObject(obj1);
                          } catch (IOException ex) {
                              System.out.println("exception caught is hello12\n");
                              Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                          }
                      }
                      rs1.close();
                  } catch (SQLException ex) {
                      System.out.println("exception caught is hello13\n");
                      Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
                  }


              } }
        }
         try {
             dis.close();
         } catch (IOException ex) {
             Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             dos.close();
         } catch (IOException ex) {
             Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             oos.close();
         } catch (IOException ex) {
             Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             ois.close();
         } catch (IOException ex) {
             Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
