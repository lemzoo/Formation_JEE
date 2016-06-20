/**
 * 
 */
package com.company.tp.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MaClasse est une classe héritant de la classe HttpServlet. 
 * 
 * 
 * @author Lamine BA
 *
 */
public class MaClasse extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		Date uneDate = new Date();
		String sMessageATransmettre = "La date du jour : " + uneDate.getDay() + "/" + uneDate.getMonth() + "/" + uneDate.getYear() + "\n" + 
				"L'heure actuelle : " + uneDate.getHours() + ":" + uneDate.getMinutes() + ":" + uneDate.getSeconds();
		request.setAttribute("test", sMessageATransmettre);
		
		this.getServletContext().getRequestDispatcher( "/horloge.jsp" ).forward( request, response );
		
		
    }
}
