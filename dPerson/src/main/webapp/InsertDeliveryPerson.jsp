<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

</head>
<body>
	
	<h2>Delivery Person Details</h2>
		<form action="DeliverypInsertServlet" method="post">
	
        	<label>ID : </label>
        	<input type="text" name="dpId" required /><br/>

        	<label>Name : </label>
        	<input type="text" name="name" required /><br/>

        	<label>Phone : </label>
        	<input type="text" name="phone" required /><br/>

        	<label>Email : </label>
        	<input type="email" name="email" required /><br/>

        	<label>Location : </label>
        	<input type="text" name="location" /><br/>

        	<label>Assigned Orders : </label>
        	<input type="text" name="assignedOrders" /><br/>

        	<label>Payment Status : </label>
        	<select name="paymentStatus">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Paid">Paid</option>
            	
        	</select><br/>

        	<label>Order Status : </label>
        	<select name="orderStatus">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Delivered">Delivered</option>
            	
        	</select><br/>

        	<button type="submit">Submit</button>
        
    	</form>


</body>
</html>