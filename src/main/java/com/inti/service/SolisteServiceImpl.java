package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Soliste;
import com.inti.repository.SolisteRepository;

@Service
public class SolisteServiceImpl implements SolisteService{

	@Autowired
	SolisteRepository solisteRepository;
	
	@Override
	public List<Soliste> getAllSoliste() {
		return solisteRepository.findAll();
	}

	@Override
	public Soliste saveSoliste(Soliste soliste) {
		if(soliste != null) {
			return solisteRepository.save(soliste);
		} else {
			return null;
		}
		
	}


	@Override
	public Soliste getSoliste(Long num) {
		if(Objects.nonNull(num)) {
			return solisteRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateSoliste(Soliste soliste) {
		if(Objects.nonNull(soliste)) {
			solisteRepository.save(soliste);
			return true;
		}
		return false;
	}

	@Override
	public void deleteSoliste(Long num) {
		if(Objects.nonNull(num)) {
			solisteRepository.deleteById(num);
		}
	}
	
	@Override
	public long getSolisteCount() {
		return solisteRepository.count();
	}
	

}
