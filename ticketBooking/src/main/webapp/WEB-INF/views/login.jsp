<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: teal;
}

.admin-button {
	position: fixed;
	width: 200px;
	height: 30px;
	top: 10px;
	right: 100px;
	color: blue;
	height: 30px;
}

.container {
	width: 300px;
	margin: 0 auto;
	padding: 20px;
	background-color: activeborder;
	border-radius: 5px;
	box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
}

h2 {
	text-align: center;
	color: black;
}

label {
	display: block;
	margin-bottom: 5px;
	color: black;
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
		<h2>User Login</h2>
		<form action="loginMSG" method="post">
			<label for="username"><h3>Email Id:</h3> </label> <input type="text"
				id="username" name="username" required="required"><br>
			<br> <label for="password"><h3>Password:</h3></label> <input
				type="password" id="password" name="password" required><br>
			<br> <input type="submit" value="Log In">
		</form>
	</div>
	<form action="admin/adminPage">
		<button type="submit" class="admin-button">Admin</button>
	</form>
	<form action="registerController" method="POST">
		<button type="submit">Register</button>
	</form>
</body>
</html>

