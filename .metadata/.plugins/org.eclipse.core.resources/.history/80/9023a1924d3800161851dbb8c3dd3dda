package com.capgemini.tp.controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveCookie
 */
@WebServlet("/retCookie")
public class RetrieveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RetrieveCookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = null;

		Cookie ck[] = request.getCookies();

		PrintWriter pw = response.getWriter();

		if (ck != null) {
			for (int i = 0; i < ck.length; i++) {
				if (ck[i].getName().equals("user"))
					/* Retrieve username from the cookie. */
					username = ck[i].getValue();
			}
			pw.println(" Hello! " + username);
		}
		else{
			pw.println("No cookies found");
		}

	}

}
