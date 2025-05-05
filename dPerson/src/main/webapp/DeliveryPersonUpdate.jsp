<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<%
	
	 String dpId = request.getParameter("dpId");
	 String name = request.getParameter("name");
	 String phone = request.getParameter("phone");
	 String email = request.getParameter("email");
	 String location = request.getParameter("location");
	 String assignedOrders = request.getParameter("assignedOrders");
	 String paymentStatus = request.getParameter("paymentStatus");
	 String orderStatus = request.getParameter("orderStatus");
	
	
	%>
	
	<form action="DeliveryPersonUpdateServelt" method="post">
	
        	<label>ID : </label>
        	<input type="text" name="dpId" value="<%=dpId%>" readonly /><br/>

        	<label>Name : </label>
        	<input type="text" name="name" value="<%=name%>" required /><br/>

        	<label>Phone : </label>
        	<input type="text" name="phone" value="<%=phone%>" required /><br/>

        	<label>Email : </label>
        	<input type="email" name="email" value="<%=email%>" required /><br/>

        	<label>Location : </label>
        	<input type="text" name="location" value="<%=location%>" /><br/>

        	<label>Assigned Orders : </label>
        	<input type="text" name="assignedOrders" value="<%=assignedOrders%>" /><br/>

        	<label>Payment Status : </label>
        	<select name="paymentStatus" value="<%=paymentStatus%>">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Paid">Paid</option>
            	
        	</select><br/>

        	<label>Order Status : </label>
        	<select name="orderStatus" value="<%=orderStatus%>">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Delivered">Delivered</option>
            	
        	</select><br/>

        	<button type="submit">Submit</button>
        
    	</form>

</body>
</html>