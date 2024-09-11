/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.controller;

import edu.ijse.ProjectMVC2.dto.CustomerDto;
import edu.ijse.ProjectMVC2.model.CustomerModel;
import java.sql.SQLException;

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
}
