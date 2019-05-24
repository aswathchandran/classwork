<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String Name=request.getParameter("UserName");
Cookie c=new Cookie("MyCookie",Name);
response.addCookie(c);

Cookie c2=new Cookie("MyCookie2","guhan");
response.addCookie(c2);

%>

<%
Cookie c1[]=request.getCookies();
for(int iter=0;iter<c1.length;iter++)
{
		out.println(c1[iter].getName());
		out.println(c1[iter].getValue());
}
%>


</body>
</html>