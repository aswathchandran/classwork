<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<style>
body
{
background-color: #ffffff;
}
.center
{
	position: fixed;
  	top: 50%;
  	left: 50%;
  	width: 50%;
  	/* bring your own prefixes */
  	transform: translate(-50%, -50%);
}
.lgn_btn
{
	border-radius: 25px;
	width:30%;
	background:#bdc3c7;
}

.inp
{
	border-radius: 25px;
}


</style>
</head>
<body>

	<div class="center" style=""><center>
		<img alt="logo.png" src="./images/logo.png" height="150px" width="150px"><br>
		<h1>GRIZZLY STORE</h1>
		<hr>
		
		<form action="LoginController" class="iput-group" method="post">
		<input type="text" placeholder="UserName" name="username" class="form-control inp" style="width:100%"><br>
		<input type="password" placeholder="password" name="password" class="form-control inp">	<br>	
		<input type="submit" value="Login" class="btn lgn_btn" >
		</form>		
		</center>
	
	</div>



</body>
</html>