<%@ page language="java" contentType="text/html; charset=UTF-16LE"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Include Date Page</title>
</head>
<body>
	<%-- Using the <jsp: include> action --%>
	<h4>
		Today's Date is:
		<jsp:include page="DatePage.jsp" flush="true" /></h4>
	<%
	   /* Displaying a message to an user */
	   out.println("<h3> The output of the file DatePage.jsp is shown above</h3>");
	%>
</body>
</html>