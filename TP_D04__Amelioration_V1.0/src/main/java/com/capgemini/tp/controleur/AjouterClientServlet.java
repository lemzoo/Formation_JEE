package com.capgemini.tp.controleur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.tp.bean.Client;
import com.capgemini.tp.service.Service;

/**
 * Servlet implementation class AfficheServlet
 */
@WebServlet("/ajouterClient")
public class AjouterClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Service service = new Service();
		
		String client[] = new String[4];
		String nomClient = request.getParameter("nomClient");
		String prenomClient = request.getParameter("prenomClient");
		String adresseClient = request.getParameter("adresseClient");
		String ageClient = request.getParameter("posteClient");
		
		client[0] = nomClient; 
		client[1] = prenomClient; 
		client[2] = adresseClient; 
		client[3] = ageClient; 
		
		System.out.println(client[0]);
		
		//On ajoute le client dans la base
		service.addClient(client);
		//On recupere apres la liste des clients present dans la base
		List<Client> clients = service.getAllClients();

		request.setAttribute("clients", clients);
		// redirection vers la page pour afficher les clients
		RequestDispatcher disp = request.getRequestDispatcher("ListeClientsService.jsp");
		disp.forward(request, response);
	}
}
