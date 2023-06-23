<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Register Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
}

.container {
	width: 300px;
	margin: 0 auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
}

h2 {
	text-align: center;
	color: #333;
}

label {
	display: block;
	margin-bottom: 5px;
	color: #555;
}

input[type="text"], input[type="password"] {
	width: 93%;
	padding: 8px;
	margin-bottom: 10px;
	border-radius: 3px;
	border: 1px solid #ccc;
}

input[type="submit"] {
	width: 100%;
	padding: 8px;
	background-color: #4CAF50;
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Register Page</h2>
		<form action="register" method="post">
			<label for="username">Username:</label> <input type="text"
				id="username" name="username" required><br> <br> <label
				for="password">Password:</label> <input type="password"
				id="password" name="password" required><br> <br> <label
				for="email">Email:</label> <input type="text" id="email"
				name="email" required><br> <br> <input
				type="submit" value="Register">
		</form>
	</div>
	<br>
	<form action="loginController" method="POST">
		<button type="submit">Login</button>
	</form>
</body>
</html>
