<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
	function deleteCustomer(customerId)
	{
		if(confirm('Do you you need to delete the customer?'))
		{
			var url='/Bank/DeleteCustomerController?custid='+customerId;
			window.location.href=url;
		}
	}


</script>



</head>
<body>
<form action="/Bank/CustomerController" method="post">
<table>
<tr>
<td>
Name:
</td>
<td>
<input type="text" name="customer_name"><br>
</td>
</tr>
<tr>
<td>
Address:
</td>
<td>
<input type="text" name="address"><br>
</td>
</tr>
<tr>
<td>
Salery
</td>
<td>
<input type="text" name="salery"><br>
</td>
</tr>
<tr>
<td>
City
</td>
<td>
<input type="text" name="city"><br><br>
</td>
</tr>
</table>
<button type="submit" >Add Customer</button>
<button type="reset">Reset</button>

</form>
<c:if test="${!empty custList}">

<table>
<tr>
	<th>Customer_id</th>
	<th>Customer_name</th>
	<th>customer Adderess</th>
	<th>Customer Salery</th>
	<th>Customer City</th>
	<th>customer image</th>
</tr>

<c:forEach items="${custList}" var="customer">
<tr>
	<td>${customer.customer_id}</td>
	<td>${customer.customer_name}</td>
	<td>${customer.address}</td>
	<td>${customer.salery}</td>
	<td>${customer.city}</td>
	<td>
		<button type="button" onclick="javascript:deleteCustomer(${customer.customer_id})">delete</button>
		<a href="/Bank/EditCustomerController?custid=${customer.customer_id}"><button type="button" onclick="/EditCustomerController?custid=${customer.customer_id}">edit</button></a>
	
	</td>
</tr>
</c:forEach>


</table>



</c:if>



</body>
</html>