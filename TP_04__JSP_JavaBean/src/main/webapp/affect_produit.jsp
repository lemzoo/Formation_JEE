<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="produit" scope="session"
		class="com.capgemini.tp.bean.Produit">
		<p>Nouveau produit !</p>
	</jsp:useBean>


	<jsp:setProperty name="produit" property="*" />

	<jsp:forward page="afficheProduit3.jsp" />

</body>
</html>