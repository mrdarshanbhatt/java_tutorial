<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.user.Connection_config"%>
<%@page import="com.user.UserManagment"%>
<jsp:useBean id="user" class="com.user.UserManagment"></jsp:useBean>
<jsp:setProperty property="*" name="user" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type"
			content="text/html; charset=ISO-8859-1">
		<title>Add user</title>
	</head>
	<body>
		<%
			Object retunnCode = Connection_config.addUser(user);
			if (retunnCode != null) {
				response.sendRedirect("AddSuccess.html");
			} else {
				response.sendError(400, "Someting went worange...");
			}
		%>
	</body>
</html>