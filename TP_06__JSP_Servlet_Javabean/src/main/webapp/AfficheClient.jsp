<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Client Page</title>
</head>
<jsp:useBean id="client" scope="request" class="com.capgemini.tp.bean.Client" />
<body>
		<TABLE BORDER=1 WIDTH=80%>
		<TR>
		<TH>Nom</TH><TH>Prénom</TH><TH>Adresse</TH><TH>Poste</TH>
		</TR>
		<TR>
		<TD><jsp:getProperty name="client" property="nom"/></TD>
		<TD><jsp:getProperty name="client" property="prenom"/></TD>
		<TD><jsp:getProperty name="client" property="adresse"/></TD>
		<TD><jsp:getProperty name="client" property="poste"/></TD>
		</TR>
		</TABLE>
</body>
</html>
