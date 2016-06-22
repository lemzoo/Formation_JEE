package com.capgemini.tp.controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SettingHttpSession
 */
@WebServlet("/setHttpSession")
public class SettingHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SettingHttpSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("nom");
		HttpSession session=request.getSession();
		session.setAttribute("user", username);

		PrintWriter pw = response.getWriter();
		pw.println("Attribute user set in HttpSession.");
		pw.println("<br>");
		pw.println("<a href='retHttpSession'>continue...</a>");

	}
}
