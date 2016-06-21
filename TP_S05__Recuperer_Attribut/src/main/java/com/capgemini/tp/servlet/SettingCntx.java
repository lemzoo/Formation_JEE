package com.capgemini.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setting")
public class SettingCntx extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*Set the context attribute*/
        getServletContext().setAttribute("URL","jdbc:odbc:EmployeesDB");
        /*Obtain the PrintWriter object*/
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<B>The JDBC URL has been set as a context attribute</B>");
        out.close();
     }

}
