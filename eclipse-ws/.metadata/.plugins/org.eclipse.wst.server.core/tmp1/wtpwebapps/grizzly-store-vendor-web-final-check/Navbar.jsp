<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link rel="stylesheet" href="./Styles/Homepage.css">
<title>Insert title here</title>
<style>
#custom-search-input {
        margin:0;
        padding: 0;
    }
 
    #custom-search-input .search-query {
        padding-right: 3px;
        padding-right: 4px \9;
        padding-left: 3px;
        padding-left: 4px \9;
        /* IE7-8 doesn't have border-radius, so don't indent the padding */
 
        margin-bottom: 0;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        border-radius: 25px;
    }
 
    #custom-search-input button {
        border: 0;
        background: none;
        /** belows styles are working good */
        padding: 2px 5px;
        margin-top: 2px;
        position: relative;
        left: -28px;
        /* IE7-8 doesn't have border-radius, so don't indent the padding */
        margin-bottom: 0;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        border-radius: 25px;
        color:#D9230F;
    }
 
    .search-query:focus + button {
        z-index: 3;   
    }
   	


</style>



</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <strong><a class="navbar-brand" href="#">GRIZZLY <img alt="logo" src="./images/logo.png" width="30px" height="30px"> STORE</a></strong>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    
    <div class="container container1">
    <div class="row">
    <div class="col-lg-6">
    <form>
       <div id="custom-search-input">
         <div class="input-group col-md-12">
         	<input type="text" class="  search-query form-control inp" placeholder="Search" />
            <span class="input-group-btn">
	            <button class="btn" type="button">
	            <span class=" glyphicon glyphicon-search" style="color:#bdc3c7" ></span>
	            </button>
            </span>
         </div>
       </div> 
       </div>
       
       </div>
                     
    </form>
    </div>
    
    
  </div>
  <div  style="margin-top: 5px;margin-right: 30px;">
       	<i class="material-icons">&#xe7f4;</i>
   </div>
   
      
   <div style="margin-top: 5px;margin-right: 40px;">
   <h4 >Welcome
	<%
		out.print(session.getAttribute("username"));
	%>   
	</h4>
	  </div>
	  
	<div style="margin-right:30px;">
	<form action="LogoutController" method="post">
	<button type="submit" class="btn lgn_btn" style="width:80px;"><strong>Logout</strong></button>
	</form>
	</div>
 
</nav>

</body>
</html>