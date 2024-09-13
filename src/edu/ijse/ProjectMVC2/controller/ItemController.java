/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.controller;

import edu.ijse.ProjectMVC2.dto.ItemDto;
import edu.ijse.ProjectMVC2.model.ItemModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author tharusha
 */
public class ItemController {
    ItemModel model ;
    public ItemController() {
        model = new ItemModel();
    }
    
    public String save(ItemDto dto) throws SQLException, ClassNotFoundException{
        String resp = model.save(dto);
        return resp ;
    }
   public String update(ItemDto dto) throws ClassNotFoundException, SQLException{
       String resp = model.update(dto);
       return resp;
   }
   public String delete(ItemDto dto) throws ClassNotFoundException, SQLException{
       String resp = model.delete(dto);
       return resp;
   }
   public ItemDto search(ItemDto dto) throws ClassNotFoundException, SQLException{
       ItemDto resp = model.search(dto);
       return resp;
    }
    public List<ItemDto> getAllItem() throws Exception {
     return model.getAllCustomer();
 }
}
