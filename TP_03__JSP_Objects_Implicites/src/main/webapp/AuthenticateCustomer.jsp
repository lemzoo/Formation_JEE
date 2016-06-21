<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Specify the name of the error page --%>
<%@ page errorPage="LoginErrorPage.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font face="verdana"> <%
 	/* Retrieving the value of the uname text field */
 	String user = request.getParameter("uname");
 	/* Converting the string value into the integer value */
 	int customerID = Integer.parseInt(user);
 	/* Retrieving the value of the password text field */
 	String pass = request.getParameter("password");
 	/* Validate the customerID and password */
 	if (customerID == 1010 && pass.equals("Mike")) {
 		out.println("Welcome to Online Banking System");
 %> <br> <br> <%
 	out.println("Login Successful");
 	} else {
 		out.println("Login Unsuccessful");
 	}
 %>
	</font>

</body>
</html>