package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Soliste;



@Repository
public interface SolisteRepository extends JpaRepository<Soliste, Long>{
	
	public Soliste findBynom(String nom);

}
