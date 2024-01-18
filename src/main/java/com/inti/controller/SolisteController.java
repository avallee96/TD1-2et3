package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inti.model.Soliste;
import com.inti.service.SolisteServiceImpl;

@Controller
@RequestMapping(value = {"soliste", "sol"})
public class SolisteController {
	
	@Autowired
	SolisteServiceImpl solisteServiceImpl;
	
	@GetMapping("formulaireSoliste")
	public String getFormulaireProduit() {
		return "formulaireSoliste";
	}
	
	@GetMapping("affichageSolistes")
	public String getAllSoliste(Model as) {
		List<Soliste> solistes = solisteServiceImpl.getAllSoliste();
		long c = solisteServiceImpl.getSolisteCount();
		
		as.addAttribute("solistes", solistes);
		as.addAttribute("count", c);
		
		return "affichagesSolistes";
	}
	
	@PostMapping("saveSoliste")
	public String saveSoliste(@ModelAttribute("soliste") Soliste soliste) {
		
		solisteServiceImpl.saveSoliste(soliste);
		return "redirect:affichageSolistes";
	}
	
	@PutMapping("updateSoliste")
	public String updateSoliste(@ModelAttribute("soliste") Soliste soliste) {
		solisteServiceImpl.saveSoliste(soliste);
		return "redirect:affichageSolistes";
	}
	
	@GetMapping("affichageSoliste")
	public String getSoliste(@RequestParam(value="nom" ) long num, Model s) {
		
		Soliste soliste = solisteServiceImpl.getSoliste(num);
		s.addAttribute("soliste", soliste);
		
		return "affichageSoliste";
	}
	
	@GetMapping("modification/{num}")
	public String updateSoliste(@PathVariable(value="num" ) long num, Model s) {
		Soliste so = solisteServiceImpl.getSoliste(num);
		s.addAttribute("so", so);
		return "formulaireSolisteUpdate";
	}
	
	@GetMapping("suppressionSoliste/{num}")
	public String deleteSoliste(@PathVariable("num") Long num, Model as) {
		solisteServiceImpl.deleteSoliste(num);
		
		
		return "redirect:/soliste/affichageSolistes";
	}

}
