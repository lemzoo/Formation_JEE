<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page language="java"%>
<%@ page import="java.lang.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16LE">
<title>Insert title here</title>
</head>
<body>
	<font size=4 face="Verdana" color=#112244>
    <%
    /* Retrieving the value of radio button */
    String str = request.getParameter("operation");
    String str1 = request.getParameter("valeur1");
    String str2 = request.getParameter("valeur2");
    String final_output = "";
    /* Declaring integer variable for performing calculation */
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    /* Converting strings values into integer */
    num1 = Integer.parseInt(str1);
    num2 = Integer.parseInt(str2);
    /* Checking which mathematical function is selected by the user */
    if (str.equals("add")) {
        num3 = num1 + num2;
        final_output = "Addition";
    }
    if (str.equals("sub")) {
        num3 = num1 - num2;
        final_output = "Soustraction";
    }
    if (str.equals("div")) {
        num3 = num1 / num2;
        final_output = "Division";
    }
    if (str.equals("mul")) {
        num3 = num2 * num1;
        final_output = "Multiplication";
    }
     %>
     <%-- Displaying the option selected --%>
     The selected mathematical function by you is: <%=final_output%>
     <br>
     <%
	 /* Displaying the result */
	 Integer in = new Integer(num3);
	 out.println("The Result is " + in.toString());
     %>

</body>
</html>