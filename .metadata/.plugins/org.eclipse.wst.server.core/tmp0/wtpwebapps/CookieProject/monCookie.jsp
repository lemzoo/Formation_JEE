<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.Cookie"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Cookie</title>
</head>
<body>
	<h1>Mon premier Cookie</h1>
	<h2>Affichage de l'horloge</h2>
	<p>
	<%
		Cookie [] mesCookies = request.getCookies(); //(Cookie)request.getAttribute("cookie");
		for (Cookie c : mesCookies){
			out.println("Nom = " + c.getName() + 
						" Valeur = " + c.getValue());
		}
	    
    %>
    </p>
</body>
</html>