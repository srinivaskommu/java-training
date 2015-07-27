<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>
	<style>
body {
	background-color: #8FBC8F;
}
</style>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>my first file</title>
</head>
<body>

	<form action="hello">

		<h style="font-size:300%""text-align:center"> MILAN PRODUCT</h>
		<br> <br> <br>
		<table style="width: 100%">
		
		<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  

			<p>
				username:<input type="text" name="username" /><br> password :<input
					type="password" name="password" /><br> <input type="submit"
					value="Login"> <input type="submit" value="Register"
					onclick="form.action='registerCustomer.jsp';">
			</form>
</body>
</html>


</body>
</html>