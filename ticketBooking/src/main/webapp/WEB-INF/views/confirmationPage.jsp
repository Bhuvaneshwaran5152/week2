<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="logout.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Booking Successful</h1>
	<h1>
		<ul>
			<li>UserName:${user}</li>
			<li>From:${from}</li>
			<li>To:${to}</li>
			<li>Date:${date}</li>

			<li>Seat No:${selectedSeats}</li>

		</ul>
	</h1>


	<form id="logoutForm" action="logoutForm" method="post">
		<input type="submit" value="Logout" />
	</form>

</body>
</html>