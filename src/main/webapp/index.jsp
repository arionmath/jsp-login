<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/css.css">
<title>Entre no sistema</title>
</head>
<body>

<div id = conteudo>
<form action="LoginServlet" method="POST">
	<h2>Please, type your credentials to login</h2>
	<label>Login:</label>
	<input name="username" type="text">
	<label>Password:</label>
	<input name="password" type="password">
	<input type="submit" value="Login">
	
</form>
</div>

</body>
</html>