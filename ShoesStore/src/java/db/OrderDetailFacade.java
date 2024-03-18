/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Trieu
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDetailFacade {

    public void create(int orderId, int productId, int quantity, double price, double discount) throws SQLException {
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO Order_Detail (OrderId, ProductId, Quantity, Price, Discount) VALUES (?, ?, ?, ?, ?)");
        stm.setInt(1, orderId);
        stm.setInt(2, productId);
        stm.setInt(3, quantity);
        stm.setDouble(4, price);
        stm.setDouble(5, discount);
        int count = stm.executeUpdate();
        con.close();
    }
}
