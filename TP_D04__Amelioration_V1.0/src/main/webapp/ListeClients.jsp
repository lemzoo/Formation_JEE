<%-- 
    Document   : affiche
    Created on : 22 juin 2016, 15:11:08
    Author     : Lamine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%--  On va chercher le bean en request   --%>
	<jsp:useBean id="clients" scope="request"
		type="java.util.List<com.capgemini.tp.bean.Client>" />

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

			<%
				java.util.Iterator<com.capgemini.tp.bean.Client> l = clients.iterator();

				while (l.hasNext()) {
					com.capgemini.tp.bean.Client client = (com.capgemini.tp.bean.Client) l.next();
			%>

			<tr>
				<td><%=client.getNom()%></td>
				<td><%=client.getPrenom()%></td>
				<td><%=client.getAdresse()%></td>
				<td><%=client.getPoste()%></td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>
</body>
</html>