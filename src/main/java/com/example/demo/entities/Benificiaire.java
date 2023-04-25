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

	private String address;
	@ManyToOne()
	private Categorie categorie;
	@ManyToOne
	private Annexe annexe;
	@ManyToOne
	private District district;
	private String annexeName;
	private String districtName;
	private String categorieName;
	
	private String fiche;
	public Benificiaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getAnnexeName() {
		return annexeName;
	}



	public void setAnnexeName(String annexeName) {
		this.annexeName = annexeName;
	}



	public String getDistrictName() {
		return districtName;
	}



	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}



	public String getCategorieName() {
		return categorieName;
	}



	public void setCategorieName(String categorieName) {
		this.categorieName = categorieName;
	}



	public Benificiaire(String cin, String nom, String address, Categorie categorie, Annexe annexe, District district,
			String fiche) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.address = address;
		this.categorie = categorie;
		this.annexe = annexe;
		this.district = district;
		this.fiche = fiche;
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



	public Annexe getAnnexe() {
		return annexe;
	}



	public void setAnnexe(Annexe annexe) {
		this.annexe = annexe;
	}



	public District getDistrict() {
		return district;
	}



	public void setDistrict(District district) {
		this.district = district;
	}



	public String getFiche() {
		return fiche;
	}



	public void setFiche(String fiche) {
		this.fiche = fiche;
	}
	
}
