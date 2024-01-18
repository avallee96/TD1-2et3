package com.inti.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.model.Oeuvre;
import com.inti.repository.OeuvreRepository;

@Service
public class OeuvreServiceImpl implements OeuvreService{
	
	@Autowired
	OeuvreRepository oeuvreRepository;

	@Override
	public List<Oeuvre> getAllOeuvre() {
		return oeuvreRepository.findAll();
	}

	@Override
	public Oeuvre saveOeuvre(Oeuvre oeuvre) {
		if(oeuvre != null) {
			return oeuvreRepository.save(oeuvre);
		}
		return null;
	}

	@Override
	public Oeuvre getOeuvre(Long num) {
		if(Objects.nonNull(num)) {
			return oeuvreRepository.getReferenceById(num);
		}
		return null;
	}

	@Override
	public boolean updateOeuvre(Oeuvre oeuvre) {
		if(Objects.nonNull(oeuvre)) {
			oeuvreRepository.save(oeuvre);
			return true;
		}
		return false;
	}

	@Override
	public void deleteOeuvre(Long num) {
		if(Objects.nonNull(num)) {
			oeuvreRepository.deleteById(num);
		}
		
	}

	@Override
	public long getOeuvreCount() {
		return oeuvreRepository.count();
	}
	
	

}
