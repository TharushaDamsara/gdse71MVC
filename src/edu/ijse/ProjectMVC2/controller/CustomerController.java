/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.controller;

import edu.ijse.ProjectMVC2.dto.CustomerDto;
import edu.ijse.ProjectMVC2.model.CustomerModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharusha
 */


public class CustomerController {
    public String add(CustomerDto dto) throws ClassNotFoundException, SQLException{
    CustomerModel model = new CustomerModel();
   String resp = model.add(dto);
        return resp;
    
    }
     public String delete(CustomerDto dto) throws ClassNotFoundException, SQLException{
    CustomerModel model = new CustomerModel();
   String resp = model.delete(dto);
        return resp;
}
     public String update(CustomerDto dto) throws ClassNotFoundException, SQLException{
    CustomerModel model = new CustomerModel();
   String resp = model.update(dto);
        return resp; 
    }
 public CustomerDto search(CustomerDto dto) throws ClassNotFoundException, SQLException{
    CustomerModel model = new CustomerModel();
   CustomerDto resp = model.search(dto);
        return resp; 
    }
 public List<CustomerDto> getAllCustomer() throws Exception {
  CustomerModel model = new CustomerModel();
     return model.getAllCustomer();
 
 }
}