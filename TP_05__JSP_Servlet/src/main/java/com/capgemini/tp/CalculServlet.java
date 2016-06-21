package com.capgemini.tp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Retrieving the value of radio button */
		String str = request.getParameter("operation");
		String param1 = request.getParameter("operand1");
		String param2 = request.getParameter("operand2");
		String final_output = "";
		/* Declaring integer variable for performing calculation */
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		/* Converting strings values into integer */
		num1 = Integer.parseInt(param1);
		num2 = Integer.parseInt(param2);
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
		
		Integer in = new Integer(num3);
		
		//construction de l'url de redirection
		String url="Calculate.jsp?final_output="+final_output+"&in="+in;
		
		//redirection JSP avec passage de parametre sur l'url
		RequestDispatcher disp=request.getRequestDispatcher(url);
		disp.forward(request, response);
				
	}

}
