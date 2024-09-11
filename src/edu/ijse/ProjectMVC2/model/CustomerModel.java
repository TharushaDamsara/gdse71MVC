/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.model;

import edu.ijse.ProjectMVC2.db.DBConnection;
import edu.ijse.ProjectMVC2.dto.CustomerDto;
import java.sql.*;

public class CustomerModel {

    public String add(CustomerDto dto) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO customer VALUES =(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, dto.getId());
        preparedStatement.setString(2, dto.getTitle());
        preparedStatement.setString(3, dto.getName());
        preparedStatement.setString(4, dto.getDob());
        preparedStatement.setDouble(5, dto.getSalary());
        preparedStatement.setString(6, dto.getAddress());
        preparedStatement.setString(7, dto.getCity());
        preparedStatement.setString(8, dto.getProvince());
        preparedStatement.setString(1, dto.getPostalCode());

       int resp = preparedStatement.executeUpdate();
        return resp>0?"aded sucsessfuly":"faild";
    }


  public String update(CustomerDto dto) throws ClassNotFoundException, SQLException {


        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE customer SET CustTitle =?,CustName =?,DOB =?,salary=?,CustAddress=?,City=?,Province=?,PostalCode=? WHERE CustID=(?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(9, dto.getId());
        preparedStatement.setString(1, dto.getTitle());
        preparedStatement.setString(2, dto.getName());
        preparedStatement.setString(3, dto.getDob());
        preparedStatement.setDouble(4, dto.getSalary());
        preparedStatement.setString(5, dto.getAddress());
        preparedStatement.setString(6, dto.getCity());
        preparedStatement.setString(7, dto.getProvince());
        preparedStatement.setString(8, dto.getPostalCode());

       int resp = preparedStatement.executeUpdate();
        return resp>0?"aded sucsessfuly":"faild";
    }

public String delete(CustomerDto dto) throws ClassNotFoundException, SQLException {


        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM customer WHERE CustID=(?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, dto.getId());
       int resp = preparedStatement.executeUpdate();
        return resp>0?"aded sucsessfuly":"faild";
    }

public CustomerDto search(CustomerDto dto) throws ClassNotFoundException, SQLException{
    Connection connection = DBConnection.getInstance().getConnection();
    String sql ="SELECT * FROM customer WHERE CustID = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(sql);
    preparedStatement.setString(1, dto.getId());
 
 
return null;
}
}