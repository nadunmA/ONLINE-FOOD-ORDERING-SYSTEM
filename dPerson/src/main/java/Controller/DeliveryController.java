package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.dPersonModel;
import Model.dbConnect;




public class DeliveryController {
	
	//connect db
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//insert data
	public static boolean insertData(String dpId, String name, String phone, String email, String location, String assignedOrders,
	        String paymentStatus, String orderStatus) {

	    boolean isSuccess = false;

	    try {
	        con = dbConnect.getConnection();

	        String sql = "INSERT INTO deliveryPerson (dpId, name, phone, email, location, assignedOrders, paymentStatus, orderStatus) " +
	                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	        java.sql.PreparedStatement stmt = con.prepareStatement(sql);

	        stmt.setString(1, dpId);
	        stmt.setString(2, name);
	        stmt.setString(3, phone);
	        stmt.setString(4, email);
	        stmt.setString(5, location);
	        stmt.setString(6, assignedOrders);
	        stmt.setString(7, paymentStatus);
	        stmt.setString(8, orderStatus);

	        int rs = stmt.executeUpdate();

	        if (rs > 0) {
	            isSuccess = true;
	        }

	        stmt.close();
	        con.close();

	    } catch (Exception e) {
	        System.out.println("Insert failed:");
	        e.printStackTrace();  
	    }

	    return isSuccess;
	}

	
	
	

}
