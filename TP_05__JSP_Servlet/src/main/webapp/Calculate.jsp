<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- Import the Java packages --%>
<%@ page language="java"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Calculate JSP</title>
</head>
<body>
	<%-- Displaying the option selected --%>
	L'opération mathématique est:
	<%=request.getParameter("final_output")%>
	<br> The Result is :
	<%=request.getParameter("in")%>

</body>
</html>