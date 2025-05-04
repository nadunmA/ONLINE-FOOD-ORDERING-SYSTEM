package Controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;




public class DeliveryController {
	
	//connect db
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//insert data
	private static boolean insertData(String dpId, String name, String phone, String email, String location, String assignedOrders,
			String paymentStatus, String orderStatus, String createdAt, String updatedAt) {
		
		
		boolean isSuccess = false;
		
		try {
			//db connection call
			con = Model.dbConnect.getConnection();
			stmt = con.createStatement();
			
			//sql query
			String sql = "INSERT INTO delivery_person (name, phone, email, location, assignedOrders, paymentStatus, orderStatus) " +
		             "VALUES ('" + name + "', '" + phone + "', '" + email + "', '" + location + "', '" +
		             assignedOrders + "', '" + paymentStatus + "', '" + orderStatus + "')";

			
		}catch{
			
		}
		
		
	}
	

}
