<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Login</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	padding: 20px;
}

h1 {
	color: #333;
}

form {
	max-width: 300px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
}

label {
	display: block;
	margin-bottom: 10px;
	color: #333;
}

input[type="password"] {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	background-color: #4CAF50;
	color: #fff;
	border: none;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<h1>Admin Login</h1>

	<form method="post" action="adminPass">
		<label for="password">Password:</label> <input type="password"
			name="password" id="password"> <br> <input type="submit"
			value="Login">
	</form>
</body>
</html>
