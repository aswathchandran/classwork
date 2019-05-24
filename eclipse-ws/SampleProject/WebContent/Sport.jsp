<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
</head>
<body>

<%= request.getParameter("username") %><br>
<%
	out.println(request.getParameter("salery"));
	out.println(request.getParameter("gender"));
	String s[]=request.getParameterValues("Sports");
	
	for(int iter=0;iter<s.length;iter++)
	{
		out.println(s[iter]);
	}
	out.println(request.getScheme());
	out.println(request.getProtocol());
	out.println(request.getServerPort());
	out.println(request.getContextPath());
	
%>
<%request.setAttribute("subject", "Maths"); %>
<br>
<jsp:include page="/Sample.jsp"></jsp:include>
</body>
</html>