/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.db;
import java.sql.*;
/**
 *
 * @author tharusha
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    DriverManager.getConnection("jdbc:mysql://localhost:3306/SuperMarket","root","Ijse@1234");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if (dBConnection==null) {
            dBConnection=new DBConnection();
        }
    
        return dBConnection;
    }
    public Connection getConnection(){
    
        return connection;
    
    }
}
