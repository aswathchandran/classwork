<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.mydiv
	{
	margin-top: 5%;
	margin-left: 5%;
	}
	.border
	{
		border: 1px solid black;
	}


</style>
</head>
<body>




<div class="mydiv border" style="width:100% ;background-color: #dfe4ea">
	<br>
	<div style="background-color: #a4b0be;margin-left: 2%;margin-right: 2%">
		<table style="width: 100%">
			<tr style="background-color: ">
			<td style="width: 90%"><h4 style="color: white;text-align: left;">PROFILE</h4></td>
			<td style="text-align: center ;"><h4 style="color: white;">Edit </h4>  </td>
			</tr>
		</table>
	</div>
	<div>
		<center>
			<br>
			<img alt="photo" src="https://d2zywfiolv4f83.cloudfront.net/img/players/73084.jpg" height="30%" width="30%">
			<br>
			<h3><strong>${user.username}</strong></h3><br>
			
			<h4>CONTACT</h4>
			<h5>${user.contact}</h5><br>
		
			<h4>Address</h4>
			<h5>${user.address}</h5>
			
			<br><br>
			
			<button type="button" style="background-color: #a4b0be">Contact Grizzly</button>
			
			<br>
			<br>
		
		</center>
	
	
	
	
	</div>
	
	
	
	
</div>

</body>
</html>