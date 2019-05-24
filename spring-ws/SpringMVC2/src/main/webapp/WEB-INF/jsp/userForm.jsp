<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" commandName="user">
		UserName : <form:input path="name"/><br><br>
		Password :<form:password path="password"/><br/>
		gender :<form:radiobutton path="gender" value="m" label="m"/>
				<form:radiobutton path="gender" value="f" label="f"/><br><br>
		country :
		<form:select path="country">
			<form:option value="0" label="Select"></form:option>
			<form:option value="1" label="india"></form:option>
			<form:option value="2" label="pakistan"></form:option>
		</form:select><br><br>
		About you :<form:textarea path="aboutYou"/><br><br>
		community : <form:checkbox path="community" value="spring" label="spring"/>
					<form:checkbox path="community" value="hibernate" label="hibernate"/>
		
		<br /><br>
		<form:checkbox path="mailingList" value="would you like to join our mailing list?"/>would you like to join our mailing list
		<br /><br>
		<input type="submit" value="submit">
	
	
	</form:form>
</body>
</html>