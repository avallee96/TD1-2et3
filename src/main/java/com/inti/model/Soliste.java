package com.inti.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 * @author antoine vallée
 * 
 * Classe soliste pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Entity
@Table(name = "soliste")
public class Soliste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name = "prenom", length = 50)
	private String prenom;
	
	private LocalDate dateNaissance;
	
	@Column(name = "nationalite", length = 50)
	private String nationalite;

	public Soliste() {
		super();
	}

	public Soliste(String nom, String prenom, LocalDate dateNaissance, String nationalite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
	}

	public Soliste(long num, String nom, String prenom, LocalDate dateNaissance, String nationalite) {
		super();
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.nationalite = nationalite;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	@Override
	public String toString() {
		return "Soliste [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", nationalite=" + nationalite + "]";
	}
	
	
	
	

}
