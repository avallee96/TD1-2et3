package com.inti.model;

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
 * Classe oeuvre pour lister des oeuvres de notre bdd
 *
 */
@Entity
@Table(name = "oeuvre")
public class Oeuvre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name="duree")
	private long duree;

	public Oeuvre() {
		super();
	}

	public Oeuvre(String nom, long duree) {
		super();
		this.nom = nom;
		this.duree = duree;
	}

	public Oeuvre(Long num, String nom, long duree) {
		super();
		this.num = num;
		this.nom = nom;
		this.duree = duree;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getDuree() {
		return duree;
	}

	public void setDuree(long duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Oeuvre [num=" + num + ", nom=" + nom + ", duree=" + duree + "]";
	}
	
	

}
