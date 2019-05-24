<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>


<center><h2>user reg</h2></center>
<hr>
<form action="/SampleProject/Sport.jsp" method="post">
Name  : <input type="text" name="username"><br><br>
Salery: <input type="text" name="salery"><br><br>
Gender: <input type="radio" name="gender" value="male">male
		<input type="radio" name="gender" value="female">female<br><br> 
Sports:<input type="checkbox" name="Sports" value="Football">Football
		<input type="checkbox" name="Sports" value="Cricket">Cricket
		<input type="checkbox" name="Sports" value="Rugby">Rugby<br>
		
<button type="submit"> submit</button>


</form>
</body>
</html>