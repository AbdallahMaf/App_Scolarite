package com.groupeisi.entities;


public class Inscription {
	
	private String id;
	private String nom;
	private String prenom;
	private String email;
	private String date;
	private String classe;
	
	public Inscription() {
		super();
	}
	
	//Constructor
	public Inscription(String nom, String prenom, String email, String date, String classe) {
		super();
		//this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.date = date;
		this.classe = classe;
	}
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	

}
