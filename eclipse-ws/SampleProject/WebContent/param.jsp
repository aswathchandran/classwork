<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${param.username}<br>
${param.salery}<br>
${param.gender}<br>
${paramValues.Sports[0]}<br>





${header["accept-language"]}<br>
${header["user-agent"]}<br>
${initParam.Midfielder}<br> 
<% 
Cookie c=new Cookie("MyCookie","Aswath");
response.addCookie(c);
Cookie c2=new Cookie("MyCookie2","guhan");
response.addCookie(c2);
%>



</body>
</html>