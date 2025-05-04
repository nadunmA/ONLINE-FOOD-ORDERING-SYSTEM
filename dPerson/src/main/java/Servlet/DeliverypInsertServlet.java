package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.DeliveryController;


@WebServlet("/DeliverypInsertServlet")
public class DeliverypInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String dpId = request.getParameter("dpId");
		 String name = request.getParameter("name");
		 String phone = request.getParameter("phone");
		 String email = request.getParameter("email");
		 String location = request.getParameter("location");
		 String assignedOrders = request.getParameter("assignedOrders");
		 String paymentStatus = request.getParameter("paymentStatus");
		 String orderStatus = request.getParameter("orderStatus");
		 //String createdAt = request.getParameter("createdAt");
		 //String updatedAt = request.getParameter("updatedAt");
		 
		
		 boolean isTrue;
		 
		 isTrue = DeliveryController.insertData(dpId, name, phone, email, location, assignedOrders, paymentStatus, orderStatus);
		 
		 if(isTrue == true) {
			 
			 String alterMessage = "Data Insert Successful";
			 response.getWriter().println("<script> alert('"+alterMessage+"'); window.location.href='done.jsp'</script>");
			 
		 }else {
			 
			 RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			 //RequestDispatcher dis2 = request.getRequestDispatcher("index.jsp");

			 dis2.forward(request, response);
			 
		 }
		
	}

}
