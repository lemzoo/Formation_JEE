/**
 * 
 */
package com.capgemini.tp.person;

/**
 * @author Lamine
 *
 */
public class Person {
	
	private String sNom; 
	private String sPrenom;
	
	public Person(String sNom, String sPrenom) {
		this.sNom = sNom;
		this.sPrenom = sPrenom;
	} 
	
	public Person(){
		this.sNom = "blabla";
		this.sPrenom = "blabla";
	}

	@Override
	public String toString() {
		return "Personne : Nom : " + sNom + ", Prenom : " + sPrenom;
	}

	
}
