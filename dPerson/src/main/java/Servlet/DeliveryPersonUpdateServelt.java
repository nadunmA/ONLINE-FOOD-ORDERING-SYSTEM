package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.DeliveryController;
import Model.dPersonModel;


@WebServlet("/DeliveryPersonUpdateServelt")
public class DeliveryPersonUpdateServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doPost(request, response); //cahnge
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String dpId = request.getParameter("dpId");
		 String name = request.getParameter("name");
		 String phone = request.getParameter("phone");
		 String email = request.getParameter("email");
		 String location = request.getParameter("location");
		 String assignedOrders = request.getParameter("assignedOrders");
		 String paymentStatus = request.getParameter("paymentStatus");
		 String orderStatus = request.getParameter("orderStatus");
		 
		 boolean isTrue;
		 
		 isTrue = DeliveryController.updateData(dpId, name, phone, email, location, assignedOrders, paymentStatus, orderStatus);

		
		
		if(isTrue == true) {
			 
			 List<dPersonModel> updateDpDetails = DeliveryController.getDpId(dpId);
			 request.setAttribute("updateDpDetails", updateDpDetails);
			 
			 String alterMessage = "Data Update Successful";
			 response.getWriter().println("<script> alert('"+alterMessage+"'); window.location.href='DeliveryPGetAllServlet'</script>");
			 
			 
		 }else {
			 
			 RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			 dis2.forward(request, response);
			 
		 }
		
	}

}
