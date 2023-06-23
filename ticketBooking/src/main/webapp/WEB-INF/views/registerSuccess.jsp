<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.centered {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

.container {
	max-width: 400px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	margin-bottom: 30px;
}

.button-container {
	display: flex;
	justify-content: space-between;
	margin-top: 20px;
}

.button-container button {
	flex-grow: 1;
	background-color: #007bff;
	color: white;
	padding: 10px;
	border: none;
	cursor: pointer;
	font-size: 16px;
	border-radius: 5px;
	transition: background-color 0.3s ease;
}

.button-container button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Register Successful</h1>
		<form action="loginController" method="POST">
			<button type="submit">Login</button>
		</form>
	</div>

</body>
</html>