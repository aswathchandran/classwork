<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Session</title>
</head>
<body>



<%

out.println(session.getId());
out.println(session.getCreationTime());
out.println(session.getLastAccessedTime());
out.println(session.isNew());

session.setAttribute("course", "java");



%>
<a href="session1.jsp">ClickMe</a>
</body>
</html>