<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>
<h1>Dear user, you have successfully login.</h1>
	Welcome <%out.print(session.getAttribute("name"));%>, You have successfully logged in<br>
	<a href="/SigninApplication/changeEmail.html">Change Email</a>
</body>
</html>