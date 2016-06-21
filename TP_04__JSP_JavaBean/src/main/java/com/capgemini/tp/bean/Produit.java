/**
 *  Classe Produit
 */
package com.capgemini.tp.bean;

public class Produit {
    String nom;
    String prix;
    String desc; 
        
    public Produit() {
        nom="Peugeot";
        prix="12000";
        desc="Voiture";
    }
    
    public String getDesc()  { return desc; }
    public String getNom()  { return nom; }
    public String getPrix()  { return prix; }
    
    public void setDesc(String desc) { this.desc = desc; } 
    public void setNom(String nom) { this.nom = nom; }
    public void setPrix(String prix) { this.prix = prix; }

}