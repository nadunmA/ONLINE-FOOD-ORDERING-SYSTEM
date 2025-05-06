package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

	        int rs = stmt.executeUpdate(); //sql use brackets

	        if (rs > 0) {
	            isSuccess = true;
	            
	        }else {
	        	
	        	isSuccess = false;
	        	
	        }

	        stmt.close();
	        con.close();

	    } catch (Exception e) {
	        System.out.println("Insert failed:");
	        e.printStackTrace();  
	    }

	    return isSuccess;
	}

	
	public static List<dPersonModel> getDpId (String dPId) {
		
		
		ArrayList <dPersonModel> deliveryPerson = new ArrayList();
		
		try {
			
			//db connection
			con = dbConnect.getConnection();
			stmt = con.createStatement();
			
			
			
			String sql = "SELECT * FROM deliveryPerson WHERE dpId '"+dPId+"'";
			
					
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				
				String dpId = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String location = rs.getString(5);
				String assignedOrders = rs.getString(6);
				String paymentStatus = rs.getString(7);
				String orderStatus = rs.getString(8);
				
				
				
				dPersonModel pm = new dPersonModel (dpId, name, phone, email, location, assignedOrders, paymentStatus, orderStatus);
				deliveryPerson.add(pm);
				
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return deliveryPerson;
		
	}
	
	
	//Get All Data
	public static List<dPersonModel> getAllDp () {
		
		ArrayList <dPersonModel> deliveryPersons = new ArrayList();
		
		
		try {
			
			//db connection
			con = dbConnect.getConnection();
			stmt = con.createStatement();
			
			
			
			String sql = "SELECT * FROM deliveryPerson";
			
					
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				
				String dpId = rs.getString(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String location = rs.getString(5);
				String assignedOrders = rs.getString(6);
				String paymentStatus = rs.getString(7);
				String orderStatus = rs.getString(8);
				
				
				
				dPersonModel pm = new dPersonModel (dpId, name, phone, email, location, assignedOrders, paymentStatus, orderStatus);
				deliveryPersons.add(pm);
				
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return deliveryPersons;
		
	}
	
	//Update Data
	public static boolean updateData(String dpId, String name, String phone, String email, String location, String assignedOrders, String paymentStatus, String orderStatus) {
		
		 boolean isSuccess = false;
		
		try {
			
			//db connection
			con = dbConnect.getConnection();
			stmt = con.createStatement();
			
			//SQL query
			String sql = "UPDATE deliveryPerson SET name = ?, phone = ?, email = ?, location = ?, " +
		             "assignedOrders = ?, paymentStatus = ?, orderStatus = ? WHERE dpId = ?";

			java.sql.PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, name);
			stmt.setString(2, phone);
			stmt.setString(3, email);
			stmt.setString(4, location);
			stmt.setString(5, assignedOrders);
			stmt.setString(6, paymentStatus);
			stmt.setString(7, orderStatus);
			stmt.setString(8, dpId);

			
			int rs = stmt.executeUpdate();

	        if (rs > 0) {
	            isSuccess = true;
	            
	        }else {
	        	
	        	isSuccess = false;
	        	
	        }

	        stmt.close();
	        con.close();
	        
			
			
		}catch (Exception e){
			
			e.printStackTrace();
			
			
		}
		return isSuccess;
		
		
		
	}
	
	//Delete Data
	public static boolean deletedData(String dPId) {
	    boolean isSuccess = false;

	    try {
	        Connection con = dbConnect.getConnection(); 
	        String sql = "DELETE FROM deliveryPerson WHERE dpId = ?";
	        PreparedStatement pstmt = con.prepareStatement(sql);

	        pstmt.setString(1, dPId);
	        int rs = pstmt.executeUpdate();

	        if (rs > 0) {
	            isSuccess = true;
	        }

	        pstmt.close();
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return isSuccess;
	}


}
