package com.capgemini.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpResquestHeaderDemo
 */
@WebServlet("/")
public class HttpResquestHeaderDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HttpResquestHeaderDemo() {
		// TODO Auto-generated constructor stub
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

		// all header names
		Enumeration<String> names = request.getHeaderNames();
		out.println("<h3>Les headers sont:</h3>");

		while (names.hasMoreElements()) {
			/* Obtain the header name */
			String name = names.nextElement();

			Enumeration<String> values = request.getHeaders(name);

			out.println("<br>");
			if (values != null) {

				while (values.hasMoreElements()) {
					/* Obtain the header value */
					String value = values.nextElement();

					out.println(name + ": " + value);
				}
			}
		}
	}

}
