package com.company.tp.cookie;

import javax.servlet.http.Cookie;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * MonCookie est une classe héritant de la classe Cookie. 
 * 
 * 
 * @author Lamine BA
 *
 */

public class MonCookie extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String sMessageATransmettre = "Transmission de variables : OK";
		request.setAttribute("test", sMessageATransmettre);
		
		Cookie nom = new Cookie("nomUtilisateur","DJOTSUP");
		Cookie prenom = new Cookie("prenomUtilisateur","Christian");
		
		System.out.println(nom);
		//Cookie [] mesCookies = {nom, prenom};
		
		response.addCookie(nom);
		
		
		this.getServletContext().getRequestDispatcher( "/monCookie.jsp" ).forward( request, response );
		
		
    }
}