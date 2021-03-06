package com.capgemini.tp.controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.tp.bean.Client;

public class AfficheServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recuperer les parametres
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String poste = request.getParameter("poste");

		// Preparer l'affichage
		Client client = new Client(nom, prenom, adresse, poste);

		// garder l'object en request
		request.setAttribute("client", client);

		System.out.println(client);

		// redirection
		RequestDispatcher disp = request.getRequestDispatcher("AfficheClient.jsp");
		disp.forward(request, response);

	}
}
