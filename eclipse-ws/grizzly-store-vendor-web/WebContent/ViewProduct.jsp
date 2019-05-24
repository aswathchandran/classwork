<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.pos
{
position: fixed;
	
  	top: 30%;
  	left: 50%;
  	width: 80%;
  	height:50%;
  	margin-left: 11.5%;
  	margin-top: 6%;
  	/* bring your own prefixes */
  	transform: translate(-50%, -50%);
}
.haha
{
	margin-top: 25%;
	margin-left: 25%;
	width:300px;
	height:300px;
}
</style>


</head>
<body>
<jsp:include page="homePage.jsp"></jsp:include>
<div class="pos" >
<div class="row">
<div class="col col-lg-6">
<img src=${product.image} width="100%" height="100%"> <br>
<h1><center>${product.productname} <br></center></h1>
</div>
<div class="col col-lg-6 ">

${product.productid} <br>
${product.category} <br>
<h4>PRODUCT DESCRIPTION</h4>
${product.description} <br>
<h4>PRODUCT PRICE</h4>
${product.price} <br>
<h4>PRODUCT BRAND</h4>
${product.brand} <br>

</div>
</div>
</div>
<button type="button" onclick="openCity(event,'AddProduct')"></button>
</body>
</html>