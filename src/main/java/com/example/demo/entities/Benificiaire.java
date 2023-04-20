package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Benificiaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cin;
	private String nom;
	private String prenom;
	private String address;
	@ManyToOne()
	private Categorie categorie;
	@ManyToOne
	private Annexe annexe;
	@ManyToOne
	private District district;
	public Benificiaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Benificiaire(String cin, String nom, String prenom, String address, Categorie categorie, Annexe annexe,
			District district) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.address = address;
		this.categorie = categorie;
		this.annexe = annexe;
		this.district = district;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}
