/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nethmi.assignment;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author roy
 */
public class DBConnect {
    
    private static Connection con;
    public static Connection getConnection() {
        if (con==null) {  
            
          try {
           String url = new String();
           String user = new String();
           String password = new String();
           url = "jdbc:mysql://localhost:3306/schoolsystem";
           user = "root";
           password = "Charitha";
           
           DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
           con = DriverManager.getConnection(url,user,password);
              //System.out.println("Connection Successfuly");
               //JOptionPane.showMessageDialog(null,"Connection Successfuly");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Connection Failed" +e);
                   // System.out.println("Error:"+e.getMessage());
                }       
        }
        return con;
    }
}
    
