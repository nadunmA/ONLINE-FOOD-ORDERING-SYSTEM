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



@WebServlet("/DeliveryPersonDeleteServlet")
public class DeliveryPersonDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dpId = request.getParameter("dpId");
		
		
		boolean isTrue;
		 
		isTrue = DeliveryController.deletedData(dpId);
		
		if(isTrue == true) {
			
			String alterMessage = "Data Delete Successful";
			//response.getWriter().println("<script>alert('"+alterMessage+"');"+"window.location.href='DeliveryPGetAllServlet';</script>");
			response.getWriter().println("<script> alert('"+alterMessage+"'); window.location.href='DeliveryPGetAllServlet';</script>");
			
		}else {
			
			List<dPersonModel> deleteDetails = DeliveryController.getDpId(dpId);
			request.setAttribute("deleteDetails", deleteDetails);
			
			RequestDispatcher dispacher = request.getRequestDispatcher("delete.jsp");
			dispacher.forward(request, response);
		}
		
	}

}
