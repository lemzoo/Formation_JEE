<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Specify this is the error page --%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Insert title here</title>
</head>
<body>
	<h3>An exception has occurred</h3>
	<table>
		<tr>
			<td>Exception Class:</td>
			<%-- Obtain the name of exception class where 'exception'
is the implicit object provided by JSP --%>
			<td><%=exception.getClass()%></td>
		</tr>
		<tr>
			<td>Message:</td>
			<%-- Obtain the exception message where 'exception' is the
implicit object provided by JSP --%>
			<td><%=exception.getMessage()%></td>
		</tr>
	</table>
	<br> To go back to the login page click Login Page button
	<form name="f2" action="LoginPage.html">
		<input type="submit" name="button1" value="Login Page">
	</form>

</body>
</html>