<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="com.capgemini.tp.bean.Client,java.util.List"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>

	<table border="1">
		<thead>
			<tr>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Adresse</th>
				<th>Poste</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="client" items="${requestScope['clients']}">

				<tr>
					<td>${client.nom}</td>
					<td>${client.prenom}</td>
					<td>${client.adresse}</td>
					<td>${client.poste}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</body>
</html>
