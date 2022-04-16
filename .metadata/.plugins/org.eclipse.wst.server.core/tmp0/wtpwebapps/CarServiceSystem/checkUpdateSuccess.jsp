<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Update Success</title>
<style>
body {
    background-image: url("./images/car-auto-repair.png");
    background-size: 100%;
}
</style>
</head>
<body>
<%
HttpSession ses = request.getSession();
out.println(ses.getAttribute("status"));
%>
</body>
</html>