package com.inti.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

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
	private LocalTime duree;
	
	@ManyToMany
    @JoinTable( name = "Oeuvre_Soliste_Associations",
                joinColumns = @JoinColumn(name = "num_Oeuvre" ),
                inverseJoinColumns = @JoinColumn(name = "num_Soliste" ) )
    private List<Soliste> solistes = new ArrayList<>();

	public Oeuvre() {
		super();
	}

	public Oeuvre(String nom, LocalTime duree) {
		super();
		this.nom = nom;
		this.duree = duree;
	}

	public Oeuvre(Long num, String nom, LocalTime duree) {
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

	public LocalTime getDuree() {
		return duree;
	}

	public void setDuree(LocalTime duree) {
		this.duree = duree;
	}

	@Override
	public String toString() {
		return "Oeuvre [num=" + num + ", nom=" + nom + ", duree=" + duree + "]";
	}
	
	

}
