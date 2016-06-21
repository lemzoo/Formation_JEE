package com.capgemini.tp.bean;

import java.io.Serializable;

public class Client implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nom;
	private String prenom;
	private String adresse;
	private String poste;
	
	
	public Client() {
		super();
	}


	public Client(String nom, String prenom, String adresse, String poste) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.poste = poste;
	}
	
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getPoste() {
		return poste;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}


	@Override
	public String toString() {
		return "Client [adresse=" + adresse + ", nom=" + nom + ", poste="
				+ poste + ", prenom=" + prenom + "]";
	}
	
}