<%@ page language="java"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.DateFormat"%>
<!DOCTYPE html>
<html>
<head>
<title>Ticket Booking App</title>
<style>
/* CSS styling */
body {
	font-family: Arial, sans-serif;
}

.container {
	max-width: 400px;
	margin: 0 auto;
}

h1 {
	text-align: center;
	margin-bottom: 30px;
}

label, select, input[type="date"], input[type="submit"] {
	display: block;
	width: 100%;
	margin-bottom: 10px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px;
	border: none;
	cursor: pointer;
}

.availability-btn {
	background-color: #007bff;
	color: white;
	padding: 10px;
	border: none;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Ticket Booking App</h1>
		<form action="seatSelection" method="post">
			<label for="from">From:</label> <select id="from" name="from"
				required>
				<option value="From">Select From</option>
				<option value="CHN">Chennai</option>
				<option value="MDU">Madurai</option>
				<option value="BLR">Banglore</option>
			</select> <label for="to">To:</label> <select id="to" name="to" required>
				<option value="To">Select To</option>
				<option value="CHN">Chennai</option>
				<option value="MDU">Madurai</option>
				<option value="BLR">Banglore</option>
			</select> <label for="date">Date:</label> <input type="date" id="datepicker"
				name="date" min="<%=getFormattedDate()%>" required>
			<!-- <label for="Ac">AC:</label> <input
				type="radio" id="Ac" name="class" value="Ac" disabled="disabled">
			<label for="Non-Ac">Non-AC:</label> <input type="radio" id="Non-Ac"
				name="class" value="Non-Ac" disabled="disabled"> -->
			<input type="submit" value="Search Buses">

		</form>
		<%!public String getFormattedDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		return dateFormat.format(today);
	}%>



		<div>
			<form action="showHistory">
				<input type="submit" value="Show Booking history"
					disabled="disabled">
			</form>
			<form id="logoutForm" action="logoutForm" method="post">
				<input type="submit" value="Logout" />
			</form>

		</div>
	</div>




</body>
</html>
