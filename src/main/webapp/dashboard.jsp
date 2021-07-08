<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/cssheader.css">

<title>Profile</title>
</head>
<body>
	<%
	Object atribute = session.getAttribute("login");
		if (atribute == null || !atribute.equals("yes")) {
			request.getSession().setAttribute("erro", "noAuthenticated");
			response.sendRedirect("index.jsp");
		}
	%>
	<%@include file="components/header.jsp"%>
	Welcome, this is a message for only those who sucess to login to the
	system, congratulations!
</body>
</html>