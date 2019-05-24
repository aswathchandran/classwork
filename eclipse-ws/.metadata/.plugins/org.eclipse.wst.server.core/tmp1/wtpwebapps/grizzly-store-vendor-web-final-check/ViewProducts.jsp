<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="Products" class="tabcontent">
						  	<div class="container">
							  	<div class="row">
							  		<div class="col col-lg-10">
									  	<input type="text" placeholder="Choose action">
									  	<input type="text" placeholder="Category Name">
									  	<input type="text" placeholder="Shortby">
								  	</div> 
								  	<div class="col col-lg-2"><button onclick="openCity(event,'AddProduct')">AddButton</button>
								  	</div>
							  	</div>
						  	</div><br>
						  	
						  	
						  	
						  	
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

</body>
</html>