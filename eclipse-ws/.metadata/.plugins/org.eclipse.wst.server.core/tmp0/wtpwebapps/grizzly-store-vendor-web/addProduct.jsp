<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<style>
.size
{
	
	width: 40%;	
}

</style>
</head>
<body>


	<div class="container-fluid" style="background-color: yellow">
		<div class="row">
			<div class="col col-md-6 col-lg-6">
				works
			</div>
			<div class="col col-md-6 col-lg-6" style="align-content: center">
				<form action="AddProductsController" method="post">
					<input class="size" type="text" placeholder="Enter the Product id" name="productid"><br><br>
					<select class="size" name="category" placeholder="category">
  						<option value="electronics">Electronics</option>
  						<option value="personal_care">Personal Care</option>
  						<option value="stationary">Stationary</option>
  						<option value="gadgets">Gadgets</option>
					</select><br><br>
					<input class="size" type="text" placeholder="Name" name="productname"><br></br>
					<input type="text" class="size" placeholder="description" name="description"><br><br>
					<input type="text" class="size" placeholder="Price" name="price"><br><br>
					<input type="text" class="size" placeholder="Brand" name="brand"><br><br>
					<input type="text" class="size" placeholder="Image" name="image"><br><br>
					
					<div>
						<button type="submit">Add</button>
						<Button type="button" onclick="openCity(event, 'Products')">cancel</Button>
					</div>
				
				</form>
			</div>
		</div>
	
		
	</div>

</body>
</html>