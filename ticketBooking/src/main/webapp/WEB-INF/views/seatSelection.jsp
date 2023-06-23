<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.full.springMVC.ticketBooking.model.Bus"%>
<%@ include file="logout.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.container {
	width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #f2f2f2;
	border-radius: 5px;
}

h1 {
	text-align: center;
}

table {
	width: 100%;
	border-collapse: collapse;
}

td {
	padding: 10px;
	text-align: center;
}

.seat {
	width: 40px;
	height: 40px;
	background-color: #ccc;
	border-radius: 5px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.seat.available {
	background-color: #4CAF50;
	cursor: pointer;
}

.seat.booked {
	background-color: #f44336;
	cursor: not-allowed;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

body {
	font-family: Arial, sans-serif;
}

.centered {
	text-align: center;
	margin-top: 50px;
}

.content-box {
	width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #f2f2f2;
	border-radius: 5px;
}

h3 {
	margin-bottom: 20px;
}

label {
	font-weight: bold;
}
</style>

</head>
<body>
	<h1>Seat Selection Page</h1>
	<div class="centered">
		<div class="content-box">
			<h3>Search Filters</h3>
			<label>From:</label> <span><%=request.getAttribute("fromPlace")%></span><br>
			<label>To:</label> <span><%=request.getAttribute("toPlace")%></span><br>
			<label>Date:</label> <span><%=request.getParameter("date")%></span><br>
			<label>AC or NON-AC:</label> <span><%=request.getParameter("class")%></span>
		</div>
	</div>
	<div class="container">
		<h1>Bus Seat Availability</h1>

		<%
		Bus bus = (Bus) request.getAttribute("bus");
		%>

		<%
		request.setAttribute("bus", bus);
		%>
		<form action="seatSelectionProcess" method="post">
			<table>
				<%
				int totalSeats = bus.getSeatMap().size();
				%>
				<%
				int seatsPerRow = 2;
				%>
				<%
				int totalRows = (totalSeats + seatsPerRow - 1) / seatsPerRow;
				%>

				<%
				for (int row = 1; row <= totalRows; row++) {
				%>
				<tr>
					<%
					for (int seat = 1; seat <= seatsPerRow; seat++) {
					%>
					<%
					int seatNumber = (row - 1) * seatsPerRow + seat;
					%>
					<%-- Check seat availability based on your logic --%>
					<%
					boolean isSeatAvailable = !bus.getSeatMap().get(seatNumber).getStatus();
					%>

					<td>
						<div class="seat <%=isSeatAvailable ? "available" : "booked"%>">
							<%=seatNumber%>
							<input type="checkbox" id="<%=seatNumber%>" name="seats"
								value="<%=seatNumber%>" <%=isSeatAvailable ? "" : "disabled"%>>
						</div>
					</td>
					<%
					}
					%>
				</tr>
				<%
				}
				%>
			</table>

			<input type="submit" value="Book Selected Seats"> <input
				type="hidden" name="routeId"
				value="<%=request.getAttribute("routeId")%>"> <input
				type="hidden" name="date" value="<%=request.getParameter("date")%>">
			<input type="hidden" name="fromPlace"
				value="<%=request.getAttribute("fromPlace")%>"> <input
				type="hidden" name="toPlace"
				value="<%=request.getAttribute("toPlace")%>">

		</form>
	</div>
</body>
</html>