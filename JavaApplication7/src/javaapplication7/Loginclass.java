package javaapplication7;

import java.io.*; 
import java.net.*; 
public class Loginclass {
    
   javaapplication7.user_info User=null;
   javaapplication7.retailer_info Retailer=null;
   public static String CurrentUser="";
   public static String CurrentRetailer="";
    public Loginclass(){
        
     
    }
    public int Reply(String stmt,int i,int t) throws ClassNotFoundException 
    {       
        int ans=0;
            try            { 
                Login.out.writeUTF(stmt);
                
                ans = Integer.parseInt(Login.inn.readUTF());
                System.out.println(ans);
                if(ans==1)
                {if(t==1)
                {
                if(i==0){
                User=(javaapplication7.user_info)Login.input.readObject();
                System.out.println(""+User.username);
                Loginclass.CurrentUser=User.username;
                }
                else
                {  
                    
                    try{
                    Retailer=(javaapplication7.retailer_info)Login.input.readObject();}
                    catch(Exception e){
                       
                    }
                    System.out.println(""+Retailer.username);
                 Loginclass.CurrentRetailer=Retailer.username;
                }}
            } 
              
       
            }
            catch(IOException e) 
            { 
                System.out.println(e); 
            } 
            
     return ans;
    }

    

    
}