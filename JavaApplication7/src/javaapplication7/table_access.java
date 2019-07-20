/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.io.*;
import java.util.*;
import java.text.*;
import java.sql.*;
import java.net.*;

public class table_access {
    
}

class prod_info implements Serializable{
     public String prod_id;
     public String prod_name;
     public String owner_name;
     public String type;
     public String description;
     public String qty_left;
     public String qty_ini;
     public String price;
}

class retailer_info implements Serializable{
     public String retailer_id;
     public String username;
     public String name;
     public String mobile_no;
     public String email_id;
     public String password;
     public String shop_address;
     public String gender;
     public String age;
     public String shopname;
}

class trans_info implements Serializable{
     public String customer_name;
     public String trans_id;
     public String product_name;
     public String quantity;
     public String total_cost;
     public String type;
     public String description;
     public String status;
}

class user_info implements Serializable{
     public String customer_id;
     public String username;
     public String name;
     public String mobile_no;
     public String email_id;
     public String password;
     public String address;
     public String gender;
     public String age;
}