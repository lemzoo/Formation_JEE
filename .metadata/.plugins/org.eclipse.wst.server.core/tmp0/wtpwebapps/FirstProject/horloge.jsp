<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="maPageInclude.jsp" %>
<%@ page import="com.capgemini.tp.person.Person" %>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Ma page JSP</title>
</head>
<body>
	<h1>Mon premier fichier en JSP (VUE New)</h1>
	<h2>Affichage de l'horloge</h2>
	<p>
	<%
		String attribut = (String) request.getAttribute("test");
	    out.println(attribut );
    %>
    </p>
    
    <p>J'inclue un fichier</p>
    <%out.println(sMonTexte); %>
    
    <hr>
    <h2>Recuperation de ma variable</h2>
     <p>
    <% out.println("La valeur de la variable récupérée = " + sVotreNom); %>
    </p>
    
    <jsp:useBean id="unePerson" class="com.capgemini.tp.person.Person"/>
    <%  %>
    
    
    <core:out value="Birame Faye"></core:out>
    core
    
</body>
</html>