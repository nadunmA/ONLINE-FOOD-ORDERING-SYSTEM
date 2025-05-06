<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<script src="https://cdn.tailwindcss.com"></script>

<link rel="stylesheet" type="text/css" href="CSS/InserDelivery.css">

</head>
<body class="text-white">
  
    <video autoplay muted loop id="backgroundVideo">
      <source src="Images/Sora.mp4" type="video/mp4">
    </video>
    
	
    <div class="overlay absolute top-0 left-0 w-full h-full bg-black bg-opacity-40 z-0"> 

      <div class="flex z-10 items-center justify-center h-screen">
	
		    <form action="DeliverypInsertServlet" method="post" class="bg-black bg-opacity-45 p-8 rounded-[16px] shadow-lg space-y-14 w-3/4 max-w-5xl">

            <h2 class="text-4xl font-sans font-bold mb-5 text-center text-white">Delivery Person Details</h2>
            
            <div class="grid grid-cols-2 md:grid-cols-3 gap-12">

            <div>    
        	    <label class="block mb-1">ID : </label>
        	    <input type="text" name="dpId" required class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

             <div>
        	    <label class="block mb-1">Name : </label>
        	    <input type="text" name="name" required class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

            <div>
        	    <label class="block mb-1">Phone : </label>
        	    <input type="text" name="phone" required class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

            <div>
        	    <label class="block mb-1">Email : </label>
        	    <input type="email" name="email" required class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

            <div>
        	    <label class="block mb-1">Location : </label>
        	    <input type="text" name="location" class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

            <div>
        	    <label class="block mb-1">Assigned Orders : </label>
        	    <input type="text" name="assignedOrders" class="font-sans w-full p-1 rounded-[16px] text-black"/><br/>
            </div>

            <div>
        	    <label class="block mb-1">Payment Status : </label>
        	    <select name="paymentStatus" class="font-sans w-full p-1 rounded-[16px] text-black">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Paid">Paid</option>
            	
        	    </select><br/>
            </div>

            <div>
        	    <label class="block mb-1">Order Status : </label>
        	    <select name="orderStatus" class="font-sans w-full p-1 rounded-[16px] text-black">
        	
            	<option value="Pending" selected>Pending</option>
            	<option value="Delivered">Delivered</option>
            	
        	    </select><br/>
            </div>
        
          </div>

          <div class="flex justify-center mt-6">
        	  <button type="submit" class="bg-green-600 hover:bg-green-90 text-white font-bold text-white py-2 px-6 rounded-full transform transition-transform duration-500 active:scale-150">Submit</button>
          </div>    

    	</form>
    </div>   
    </div> 

</body>
</html>