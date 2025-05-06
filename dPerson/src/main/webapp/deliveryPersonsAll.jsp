<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>

<body class="bg-black text-white relative overflow-hidden">

    <video autoplay muted loop playsinline
    class="fixed top-0 left-0 w-full h-full object-cover z-[-1]">
    <source src="Images/sg.mp4" type="video/mp4">
  </video>

    
<div class="container mx-auto p-8">

    <h1 class="text-3xl font-bold mb-6 text-center">Delivery Person Records</h1>

<table class="w-full border-collapse border bg-greay-600 bg-black bg-opacity-60">
    <thead>
        <tr>
            <th class="border border-gray-600 p-3">ID</th>
            <th class="border border-gray-600 p-3">Name</th>
            <th class="border border-gray-600 p-3">Phone</th>
            <th class="border border-gray-600 p-3">Email</th>
            <th class="border border-gray-600 p-3">Location</th>
            <th class="border border-gray-600 p-3">Assigned Orders</th>
            <th class="border border-gray-600 p-3">Payment Status</th>
            <th class="border border-gray-600 p-3">Order Status</th>
            <th class="border border-gray-600 p-3">Created At</th>
            <th class="border border-gray-600 p-3">Action</th>
        </tr>
    </thead> 
    <tbody>  
		<c:forEach var="deliveryPersons" items="${deliveryPersonsAll}">        
  
        <tr>

            <td class="border border-gray-600 p-2">${deliveryPersons.dpId}</td>

                <td class="border border-gray-600 p-2">${deliveryPersons.dpId}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.name}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.phone}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.email}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.location}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.assignedOrders}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.paymentStatus}</td>
                <td class="border border-gray-600 p-2">${deliveryPersons.orderStatus}</td>
            
            
            <td class="border border-gray-600 p-2 space-y-2">
            
            	<a href="DeliveryPersonUpdate.jsp?dpId=${deliveryPersons.dpId}&name=${deliveryPersons.name}&phone=${deliveryPersons.phone}&email=${deliveryPersons.email}
            	&location=${deliveryPersons.location}&assignedOrders=${deliveryPersons.assignedOrders}&paymentStatus=${deliveryPersons.paymentStatus}&orderStatus=${deliveryPersons.orderStatus}">
            			
            		<button class="bg-green-500 hover:bg-green-600 text-white font-bold py-1 px-3 rounded">Update</button>
            		
            	</a>
            	
      
            
            	<form action="DeliveryPersonDeleteServlet" method="post" class="inline-block">
            	<input type="hidden" name="dpId" value="${deliveryPersons.dpId}"></input>
            		<button class="bg-red-500 hover:bg-red-600 text-white font-bold py-1 px-3 rounded">Delete</button>
            		
            	</form>
            
            </td>
            
		</tr>
		</c:forEach>
    </tbody> 
    </table>
   </div> 
</body>
</html>
