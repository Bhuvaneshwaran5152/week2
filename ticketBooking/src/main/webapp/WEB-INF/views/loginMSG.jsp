<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>
<body>
	<h1>Error Message</h1>

	<%-- Display error message if it exists --%>
	<%
	if (request.getAttribute("msg") != null) {
	%>
	<p style="color: red;"><%=request.getAttribute("msg")%></p>
	<%

	%>
	<%
	}
	%>
	<%
	if (request.getAttribute("msg").equals("Username password miss-match")
			|| request.getAttribute("msg").equals("UserNotFound")
			|| request.getAttribute("msg").equals("Please select a seat to continue")) {
	%>
	<%
	String referer = request.getHeader("Referer");
	%>
	<form action="registerController" method="POST">
		<button type="submit">Register</button>
	</form>

	<form action="loginController" method="POST">
		<button type="submit">Login</button>
	</form>

	<%
	}
	%>

	<!-- <form method="post" action="/loginMSG">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" required><br> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" required><br> <input type="submit"
			value="Login">
	</form> -->

	<%-- Display success message if it exists --%>
	<%
	if (request.getAttribute("username") != null) {
	%>
	<h2>
		Welcome,
		<%=request.getAttribute("username")%>!
	</h2>
	<p>You have successfully logged in.</p>
	<%
	}
	%>
</body>
</html>
