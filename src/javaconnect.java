/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NELSON
 */

import java.sql.*;
import javax.swing.*;
public class javaconnect {
   PreparedStatement pst=null;
   Connection con=null;
   ResultSet rst=null;
    
    public static Connection getCon(){
    
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nelson","root","");
    return con;
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;
    }
    
    
    }
    
    
    
}
