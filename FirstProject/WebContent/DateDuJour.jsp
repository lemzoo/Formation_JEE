<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>La date du jour</h1>
	<%! Date uneDate = new Date();%>
	<strong>On est le : <%=uneDate.getDay() + "/" + uneDate.getMonth() + "/" + uneDate.getYear()%></strong></br></br>
	<strong>Il est : <%=uneDate.getHours() + ":" + uneDate.getMinutes() + ":" + uneDate.getSeconds()%></strong>
</body>
</html>