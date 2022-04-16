<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WHYK Bank | Singapore</title>
</head>
<body>
	<header>
		<div>
			<div>
				<h1>WHYK Bank Singapore</h1>
			</div>
			Welcome <%out.print(session.getAttribute("name"));%>, to WHYK iBanking!<br>
			<nav>
				<ul>
					<li><a href="/BankApplicationSystem/checkBalance.html">Check Balance</a></li>
					<li><a href="/BankApplicationSystem/applyForLoan.html">Apply For Loan</a></li>
					<li><a href="/BankApplicationSystem/checkStatement.html">Check Statement</a></li>
					<li><a href="/BankApplicationSystem/changePassword.html">Change Password</a></li>
					<li><a href="/BankApplicationSystem/Logout">Logout</a></li>
				</ul> 	
			</nav>
		</div>
	</header>
</body>
</html>