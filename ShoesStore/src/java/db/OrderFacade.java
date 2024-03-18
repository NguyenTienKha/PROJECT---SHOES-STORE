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
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderFacade {

    public int create(int customerId) throws SQLException {
        int orderId = -1;
        Connection con = DBContext.getConnection();
        PreparedStatement stm = con.prepareStatement("INSERT INTO [Order] (CustomerId, Date, Status) VALUES (?, GETDATE(), 'New')", PreparedStatement.RETURN_GENERATED_KEYS);
        stm.setInt(1, customerId);
        int count = stm.executeUpdate();
        if (count > 0) {
            ResultSet rs = stm.getGeneratedKeys();
            if (rs.next()) {
                orderId = rs.getInt(1);
            }
        }
        con.close();
        return orderId;
    }
}
