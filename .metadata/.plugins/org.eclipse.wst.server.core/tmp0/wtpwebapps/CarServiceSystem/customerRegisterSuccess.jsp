<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Register Success</title>
<style>
body {
    background-image: url("./images/car-auto-repair.png");
    background-size: 100%;
}
</style>
</head>
<body>
	Dear <%out.print(session.getAttribute("cname"));%>, You have successfully registered<br>
	<a href="/CarServiceSystem/customerLogin.html">Login</a>
</body>
</html>