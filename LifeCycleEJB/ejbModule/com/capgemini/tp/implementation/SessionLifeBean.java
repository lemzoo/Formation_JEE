package com.capgemini.tp.implementation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

import com.capgemini.tp.service.SessionLife;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class SessionLifeBean implements SessionLife {

	@Override
	public String affiche(String param) {
		System.out.println("Dans ma methode affiche...");
		return "Requete avec " + param + " executer.";
	}

	@PostConstruct
	public void initialize() {
		// code avant écécution
		System.out.println("Initialisation ....");
	}

	@PreDestroy
	public void destroyBean() {
		// code aprés éxécution
		System.out.println(" Destruction ....");
	}

}