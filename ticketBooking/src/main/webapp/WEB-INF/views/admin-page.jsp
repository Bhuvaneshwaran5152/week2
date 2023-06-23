<%@page import="org.springframework.context.annotation.Import"%>
<%@page import="com.full.springMVC.ticketBooking.database.UserDataBase"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@page import="com.full.springMVC.ticketBooking.model.UserDetails"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Page</title>
<link rel="stylesheet" type="text/css" href="style.css">

<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	padding: 20px;
}

h1 {
	color: #333;
}

.button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	cursor: pointer;
	border-radius: 4px;
}

.button:hover {
	background-color: #45a049;
}

.user-details {
	display: none;
}
</style>

</head>
<body>
	<h1>Admin Page</h1>


	<form action="userDetails" method="GET">
		<%
		Map<String, UserDetails> userList = (Map<String, UserDetails>) request.getAttribute("userList");
		%>
		<%
		if (userList != null) {
		%>

		<table>
			<tr>
				<th>user</th>
				<th>Mail Id</th>
			</tr>
			<%
			for (Map.Entry<String, UserDetails> entry : userList.entrySet()) {
				String key = entry.getKey();
				UserDetails value = entry.getValue();
			%>
			<tr>
				<td><%=value.getUserName()%></td>
				<td><%=value.getEmail()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>

		<button type="submit">Show User Details</button>
	</form>
	<form action="getBusForm">
		<button type="submit">ShowBusDetails</button>
	</form>
</body>
</html>

