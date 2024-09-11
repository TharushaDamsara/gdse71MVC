/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ijse.ProjectMVC2;

import edu.ijse.ProjectMVC2.db.DBConnection;
import java.sql.SQLException;

/**
 *
 * @author tharusha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("hello");
        DBConnection.getInstance().getConnection();
    }
    
}
