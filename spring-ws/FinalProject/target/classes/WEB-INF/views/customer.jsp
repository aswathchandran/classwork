<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://www.springframework.org/tags" prefix="spring"  %>
    <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function deleteCustomer(customerId)
	{
		if(confirm('do you want to delete this customer?'))
		{
			var url='delete/'+customerId;
			window.location.href=url;
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer jsp</title>
<style type="text/css">
              body {
                     font-family: verdana;
                     font-size: 12px;
                     margin: 40px;
              }
              .customerTable, .customerTable td {
                     border-collapse: collapse;
                     border: 1px solid #aaa;
                     margin: 2px;
                     padding: 2px 2px 2px 10px;
                     font-size: 12px;
              }
              .CustomerTable th {
                     font-weight: bold;
                     font-size: 12px;
                     background-color: #5C82FF;
                     color: white;
              }
              .CustomerLabel {
                     font-family: verdana;
                     font-size: 12px;
                     font-weight: bold;
              }
              a, a:AFTER {
                     color: blue;
              }
              
  .error {
      color: red;
      font-style: italic;
  }

       </style>

</head>
<body>
<h2>banking application</h2>


<c:url var="action" value="/Customer/add.html"></c:url>
<form:form method="post" action="${action}" commandName="customer" cssClass="customerForm">
	<table>
	<c:if test="${!empty customer}">
		<tr>
			<td>
				<form:label path="id" cssClass="customerLabel">
					<spring:message code="label.customerId"></spring:message>
				</form:label>
			</td>
			<td>
				<form:input path="id" readonly="true" size="8" disabled="true"/>
				<form:hidden path="id"/>
			</td>
		</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name" cssClass="customerLabel">
				<spring:message code="label.customername"></spring:message>
			</form:label>
		</td>
		<td>
			<form:input path="name"/>
			<form:errors path="name" cssClass="error"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="address" cssClass="customerLabel">
				<spring:message code="label.address"></spring:message>
			</form:label>
		</td>
		<td>
			<form:input path="address"/>
			<form:errors path="address" cssClass="error"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="age" cssClass="customerLabel">
				<spring:message code="label.age"></spring:message>
			</form:label>
		</td>
		<td>
			<form:input path="age"/>
			<form:errors path="age" cssClass="error"></form:errors>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="salery" cssClass="customerLabel">
				<spring:message code="label.salery"></spring:message>
			</form:label>
		</td>
		<td>
			<form:input path="salery"/>
			<form:errors path="salery" cssClass="error"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty customer.name }">
				<input type="submit" value="<spring:message code="label.editCustomer"/>"/>
			</c:if>
			<c:if test="${empty customer.name }">
				<input type="submit" value="<spring:message code="label.addCustomer"/>"/>
			</c:if>
		</td>
	
	</tr>
	
	
	</table>


</form:form>

<hr>

<c:if test="${!empty customerList}">
<h3>List of customer</h3>
	<table class="customerTable">
		<tr>
			<th width="180">Customer Name</th>
			<th width="160">Address</th>
			<th width="60">Age</th>
			<th width="80">Salery</th>
			<th width="60">Action</th>
		</tr>
		<c:forEach items="${customerList}" var="customer">
			<tr>
				
				<td><a href="<c:url value='/edit/${customer.id }' />" >${customer.name}</a></td>
				<td>${customer.address}</td>
				<td>${customer.age}</td>
				<td>${customer.salery}</td>
				<td><img src="<c:url value='/images/vcard_delete.png'/>"
					title="DeleteCustomer"
					onclick="javascript:deleteCustomer(${customer.id})"/>
					<a href="<c:url value='edit/${customer.id}'/>">
						<img src="<c:url value='/images/vcard_edit.png'/>">
					</a>
				 </td> 
 		</tr>
		
		</c:forEach>
	</table>

</c:if>

	

</body>
</html>