<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
function openCity(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";}
        
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");}

document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";}

</script>
<style>
	.inp
	{
		border-radius: 25px;
	}
	.container1
	{
		margin-top:0px;
		margin-left:10%;
		
 	}
 	.lgn_btn
	{
		margin-rignt:30%;
		border-radius: 25px;
		background:#bdc3c7;
	}	
	h4
	{
		color: black;
	}
 	.tab 
 	{
 		overflow: hidden; border: 1px solid #ccc; 
		background-color: #f1f1f1;
	}

	.tabcontent 
	{
		display: none; padding: 6px 12px; border: 1px solid #ccc;
    	border-top: none;
    }
    
	.tab button 
	{
		background-color: inherit; float: left; border: none;
    	outline: none; cursor: pointer; padding: 14px 16px; 
    	transition: 0.3s;
    }
    
	.tab button:hover 
	{
		background-color: #ddd;
	}

	.tab .active
	 {
	 	background-color: #ccc;
	 }

	.tabcontent 
	{
		display: none; 
		padding: 6px 12px;
	
		border: 1px solid #ccc; 
		border-top: none;
	}

	table 
	{
		font-family: arial, sans-serif; 
		border-collapse: collapse;
    	width: 100%;
    }

	td, th
	{
		border: 1px solid ; padding: 8px; 
    	text-align: center;
    }

	/*Change color to gray*/
	tr:nth-child(even) {
    	background-color: ;
    }

	.actived a{color:green}
	.actived a:hover{ font-weight: bold}

	.deactivated a{color:red}
	.deactivated a:hover{ font-weight: bold}

	.available {color:green; }
	.disable{ color: red; font-weight: bold}
	.intraining{color: blue; font-weight: bold}
	.vacation{ font-weight: bold}
	
	
	
	
	
</style>


</head>
<body>
<div class=" " style="background-color:white; margin-top: 2%;margin-left: 2%">
	<div class="">
		<div class="tab">
			<button class="tablinks" onclick="openCity(event, 'Products')">PRODUCTS</button>
			<button class="tablinks" onclick="openCity(event, 'Inventory')">INVENTORY</button>
		</div>
	</div>
	<div id="Products" class="tabcontent">
	<div class="container">
	<div class="row">
		
		<input type="text" placeholder="ChooseAction">
		
		
		<input type="text" placeholder="productId/Product">
		
		
		<select>
			<option>name</option>
			<option>id</option>
		</select>
		
		<button type="button" onclick="openCity(event, 'AddProduct')">Add Product</button>
		</div>
	</div>
	<br>
		<c:if test="${!empty productlist}"></c:if>
						  		<table>
						  			<tr>
						  				<th style="width:06%">select</th>
						  				<th style="width:14%">Product list</th>
						  				<th>Brand</th>
						  				<th>Category</th>
						  				<th>Rating</th>
						  				<th >Actions</th>
						  			</tr>
						  			<c:forEach items="${productlist}" var="product">
						  				<tr>
						  					<td style="background-color: white"></td>
						  						
						  					<td style="background-color: white"><a href="ViewProductController?pname=${product.productname}">	${product.productname}</a></td>
						  					<td style="background-color: white">${product.brand}</td>
						  					<td style="background-color: white">${product.category}</td>
						  					<td style="background-color: white">${product.rating}</td>
						  					<td style="background-color: white"> <button>view</button><button>block</button><button>Remove</button></td>
						  				</tr>
						  			</c:forEach>
						  		</table>
	</div>
	<div id="Inventory" class="tabcontent">
		 <c:if test="${!empty inventoryList}"></c:if>
		 <table>
						  			<tr>
						  				<th style="width:06%">select</th>
						  				<th style="width:14%">Product list</th>
						  				<th>availablity</th>
						  				<th>required</th>
						  				<th>price</th>
						  				<th>Rating</th>
						  				<th >Actions</th>
						  			</tr>
		 	<c:forEach items="${inventoryList}" var="inventory">
		 		<tr>
		 		<td style="background-color: white"></td>
				<td style="background-color: white"><a href="">	${inventory.productname}</a></td>
				<td style="background-color: white">${inventory.availablity}</td>
				<td style="background-color: white">${inventory.required}</td>
				<td style="background-color: white">${inventory.price}</td>
				<td style="background-color: white">${inventory.rating}</td>
				<td style="background-color: white"> <button>view</button><button>block</button><button>Remove</button></td>
		 		</tr>
		 	</c:forEach>
		 	</table>
	</div>
	
	<div id="AddProduct" class="tabcontent">
	
	<form action="VendorController" method="post">
		<input type="text" name="productid"  placeholder="enter the product id"><br><br>
		<input type="text" name="quantity" placeholder="enter the quantity"><br><br>
		<button type="submit" class="btn btn-success" >Submit</button>
	</form>
		
	
	
	</div>
	
</div>

</body>
</html>