<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Navbar.jsp"></jsp:include>


<div class="">
	<div class="row">
		<div class="col col-lg-3">
			<jsp:include page="Profile.jsp"></jsp:include>
		</div>
		<div class="col col-lg-9">
			<jsp:include page="TabNav.jsp"></jsp:include>
		</div>
	</div>

</div>




</body>
</html>