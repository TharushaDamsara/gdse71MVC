/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.ProjectMVC2.model;

import edu.ijse.ProjectMVC2.db.DBConnection;
import edu.ijse.ProjectMVC2.dto.ItemDto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tharusha
 */
public class ItemModel {

    public String save(ItemDto dto) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Item VALUES (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, dto.getItemCode());
        preparedStatement.setString(2, dto.getDescription());
        preparedStatement.setString(3, dto.getPackSize());
        preparedStatement.setDouble(4, dto.getUnitPrice());
        preparedStatement.setInt(5, dto.getQoh());

        int resp = preparedStatement.executeUpdate();
        return resp > 0 ? "aded sucsessfuly" : "faild";
    }

    public String update(ItemDto dto) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Item SET Description=?,PackSize =?,UnitPrice =?,QtyOnHand=? WHERE ItemCode=(?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(5, dto.getItemCode());
        preparedStatement.setString(1, dto.getDescription());
        preparedStatement.setString(2, dto.getPackSize());
        preparedStatement.setDouble(3, dto.getUnitPrice());
        preparedStatement.setInt(4, dto.getQoh());

        int resp = preparedStatement.executeUpdate();
        return resp > 0 ? "Updated sucsessfuly" : "faild";
    }

    public String delete(ItemDto dto) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Item WHERE ItemCode = (?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, dto.getItemCode());
        int resp = preparedStatement.executeUpdate();
        return resp > 0 ? "deleted sucsessfuly" : "faild";
    }

    public ItemDto search(ItemDto dto) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item WHERE ItemCode = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, dto.getItemCode());
        ResultSet resp = preparedStatement.executeQuery();
        while (resp.next()) {
            ItemDto dtos = new ItemDto();
            dtos.setItemCode(resp.getString(1));
            dtos.setDescription(resp.getString(2));
            dtos.setPackSize(resp.getString(3));
            dtos.setUnitPrice(resp.getDouble(4));
            dtos.setQoh(resp.getInt(5));

            return dtos;
        }
        return null;
    }
     public List<ItemDto> getAllCustomer() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Item";
        PreparedStatement statement = connection.prepareStatement(sql);

        List<ItemDto> itemDtos = new ArrayList<>();

        ResultSet rst = statement.executeQuery();
        while (rst.next()) {
            ItemDto dto = new ItemDto(rst.getString(1),
                    rst.getString(2), rst.getString(3),
                    rst.getDouble(4), rst.getInt(5)
                   );
            itemDtos.add(dto);
        }
        return itemDtos;
    }
}
