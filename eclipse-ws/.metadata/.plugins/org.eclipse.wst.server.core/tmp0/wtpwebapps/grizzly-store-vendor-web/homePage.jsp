 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="com.aswath.*"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="./Styles/Homepage.css">

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


<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <strong><a class="navbar-brand" href="#">GRIZZLY <img alt="logo" src="./images/logo.png" width="30px" height="30px"> STORE</a></strong>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    
    <div class="container container1">
    <div class="row">
    <div class="col-lg-6">
    <form>
       <div id="custom-search-input">
         <div class="input-group col-md-12">
         	<input type="text" class="  search-query form-control inp" placeholder="Search" />
            <span class="input-group-btn">
	            <button class="btn" type="button">
	            <span class=" glyphicon glyphicon-search" style="color:#bdc3c7" ></span>
	            </button>
            </span>
         </div>
       </div> 
       </div>
       
       </div>
                     
    </form>
    </div>
    
    
  </div>
  <div  style="margin-top: 5px;margin-right: 30px;">
       	<i class="material-icons">&#xe7f4;</i>
   </div>
   
      
   <div style="margin-top: 5px;margin-right: 40px;">
   <h4 >Welcome
	<%
		out.print(session.getAttribute("username"));
	%>   
	</h4>
	  </div>
	  
	<div style="margin-right:30px;">
	<form action="LogoutController" method="post">
	<button type="submit" class="btn lgn_btn" style="width:80px;"><strong>Logout</strong></button>
	</form>
	</div>
 
</nav>



<div class="container-fluid">
  <div class="row">
    	<div class="col-sm-3 col-md-6 col-lg-2" style="background-color:#dfe4ea; width:90%;margin-left: 2%;">
      		<div class="" style="background-color: #dfe4ea;margin-top: 2%">
		      		<div class="" style="background-color: #a4b0be; margin-left:2%;margin-right: 2%;margin-top: 2%;margin-bottom: 2%; height:4%">
		      			<table style="width: 100%">
		      			<tr style="background-color: grey">
		      			<td style="width: 90%"><h4 style="color: white;text-align: left;"><strong>PROFILE</strong></h4></td>
		      			<td style="text-align: center ;"><h4 style="color: white;">Edit </h4>  </td>
		      			</tr>
		      			</table>
		      		</div>
		      		
      			  	<div class="" style="background-color:"><center>
			      		<img alt="" src=${user.imagesrc} height="30%" width="30%">
			      		<h3><strong>${user.username}</strong></h3>
			      		<h3><strong>ID</strong></h3>
			      		<h4>GZS${user.userid}</h4><br>
			      		<h4><strong>DESIGNITION</strong></h4>
			      		<h4>${user.destignition}</h4><br>
			      		<h4><strong>OFFICE</strong></h4>
			      		<h4>${user.office}</h4><br><br><br>
			      		</center>    
		      		</div>
      		</div>
    	</div>
   
   
   
			    <div class="col-sm-9 col-md-6 col-lg-9" style="background-color:white; margin-left: 2%;">
			    <div class="">
					<div class="tab">
				  		<button class="tablinks" onclick="openCity(event, 'Products')">PRODUCTS</button>
				  		<button class="tablinks" onclick="openCity(event, 'Vendor')">VENDOR</button>
					</div>
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
			
					<div id="Vendor" class="tabcontent">
						  <%@ include file = "Vendor.jsp" %>
					</div>
					<div id="AddProduct" class="tabcontent">
						  <%@ include file = "addProduct.jsp" %>
					</div>
					<div id="ViewProduct" class="tabcontent">
						  view product works
					</div>
			
				</div>
				</div>
    </div>
  </div>




<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>



</body>
</html>