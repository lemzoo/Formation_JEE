package com.capgemini.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpResquestHeaderDemo
 */
/*Line contenant l'example : 
 * http://memorynotfound.com/servlet-3-initialisation-parameter-annotation-example/
 */
@WebServlet(
		value = "/", 
		initParams = {
				@WebInitParam(name = "MON_PARAM",value = "Bonjour")
		}, 
		description = "Servlet 3 initialisation parameter annotation example: @WebInitParam"
)

public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String sMonParam = "toto";  
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void init(ServletConfig config) throws ServletException {
		 sMonParam = config.getInitParameter("MON_PARAM");
    }
	 
	 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Lancement de la servlet");
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//sMonParam = getInitParameter("MON_PARAM");
		
		out.write("<h2>Affichage de ma variable dans la servlet : </h2>" + "<p><mark>" + sMonParam + "</mark></p>");
	}

}