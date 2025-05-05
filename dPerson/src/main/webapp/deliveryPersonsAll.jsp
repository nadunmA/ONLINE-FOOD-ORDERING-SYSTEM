<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

<table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Location</th>
            <th>Assigned Orders</th>
            <th>Payment Status</th>
            <th>Order Status</th>
        </tr>

		<c:forEach var="deliveryPersons" items="${deliveryPersonsAll}">        
  
        <tr>
            <td>${deliveryPersons.dpId}</td>
            <td>${deliveryPersons.name}</td>
            <td>${deliveryPersons.phone}</td>
            <td>${deliveryPersons.email}</td>
            <td>${deliveryPersons.location}</td>
            <td>${deliveryPersons.assignedOrders}</td>
            <td>${deliveryPersons.paymentStatus}</td>
            <td>${deliveryPersons.orderStatus}</td>
		</tr>
		</c:forEach>
    </table>

</body>
</html>

