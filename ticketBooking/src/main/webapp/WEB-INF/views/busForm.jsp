<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.full.springMVC.ticketBooking.model.Bus"%>
<!DOCTYPE html>
<html>
<head>
<title>Number Dropdown and Date Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

h1 {
	text-align: center;
}

form {
	margin-top: 20px;
	text-align: center;
}

label {
	display: block;
	margin-bottom: 10px;
}

select, input[type="date"], input[type="submit"] {
	padding: 5px;
	border: 1px solid #ccc;
	border-radius: 3px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}

table {
	border-collapse: collapse;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}
</style>
</head>
<body>
	<h1>Enter the bus details</h1>

	<form action="getBusDetails" method="post">
		<label for="number">Select a Number:</label> <select name="routeId"
			id="number">
			<%
			for (int i = 1; i <= 6; i++) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			}
			%>
		</select><br> <br> <label for="date">Enter a Date:</label> <input
			type="date" name="date" id="date" required><br> <br>
		<input type="submit" value="Submit">
	</form>
	<%
	Boolean isFirstVisit = (Boolean) request.getAttribute("isFirstVisit");
	if (!isFirstVisit) {
		Bus bus = (Bus) request.getAttribute("bus");
		if (bus != null) {
	%>
	<table>
		<tr>
			<th>Seat Number</th>
			<th>Booking Status</th>
			<th>User Name</th>
			<th>User Mail ID</th>
		</tr>
		<%
		for (int i = 1; i <= 20; i++) {
		%>
		<tr>
			<td><%=bus.getSeatMap().get(i).getSeatNo()%></td>
			<td><%=bus.getSeatMap().get(i).getStatus() ? "Booked" : "Available"%></td>
			<td><%=bus.getSeatMap().get(i).getUserDetails() != null ? bus.getSeatMap().get(i).getUserDetails().getUserName()
		: "NA"%></td>
			<td><%=bus.getSeatMap().get(i).getUserDetails() != null ? bus.getSeatMap().get(i).getUserDetails().getEmail() : "NA"%></td>
		</tr>
		<%
		}
		%>

	</table>
	<%
	} else {
	%>
	<div>
		<p>Bookings Not Yet Opened...!</p>
	</div>

	<%
	}
	%>
	<%}%>
</body>
</html>
