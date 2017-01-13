package fr.doranco.aupetitcafe;

import java.math.BigDecimal;

public class Boisson {

	private String nom;
	
	private BigDecimal prix;

	public Boisson() {
		super();
	}

	public Boisson(String nom, BigDecimal prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public BigDecimal getPrix() {
		return prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}
	
}
