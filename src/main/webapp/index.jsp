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


	<%
	String message = "";
	if (request.getSession().getAttribute("erro") != null) {

		String attribute = request.getSession().getAttribute("erro").toString();
		System.out.println("ATTRIBUTE = " + attribute);

		if (attribute.equalsIgnoreCase("noAuthenticated")) {
			message = "You need to be logged to acess!";
		} else if (attribute.equalsIgnoreCase("empty fields")) {
			message = "Empty fields, please complete them";
		} else if(attribute.equalsIgnoreCase("wrong password!")){
			message = attribute;
		}else if(attribute.equalsIgnoreCase("user not found!")){
			message = attribute;
		}
	}
	%>



	<div id=conteudo>
		<form action="LoginServlet" method="POST">
			<h2>Please, type your credentials to login</h2>
			<label>Login:</label> <input name="username" type="text"> <label>Password:</label>
			<input name="password" type="password"> <input type="submit"
				value="Login">

		</form>
		<p id=alert><%=message%></p>
	</div>

</body>
</html>