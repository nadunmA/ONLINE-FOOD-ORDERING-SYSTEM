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
			//db connection call
			con = Model.dbConnect.getConnection();
			stmt = con.createStatement();
			
			//sql query
			String sql = "INSERT INTO deliveryPerson (name, phone, email, location, assignedOrders, paymentStatus, orderStatus) " +
		             "VALUES ('" + name + "', '" + phone + "', '" + email + "', '" + location + "', '" +
		             assignedOrders + "', '" + paymentStatus + "', '" + orderStatus + "')";

			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				
				isSuccess = true;
				
			
			}else {
				
				isSuccess = false;
				
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return isSuccess;
		
		
	}
	
	public static List<dPersonModel> getBydpId (String dpId) {
		
		
		ArrayList <dPersonModel> dPersonModel = new ArrayList<>();
		
		try {
			
			//DBconnection
			con=dbConnect.getConnection();
			stmt=con.createStatement();
			
			String sql = "SELECT * FROM deliveryPerson WHERE dpId '"+convertedID+"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String dpId = rs.getString(1);
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		return dPersonModel;
		
	}
	

}
