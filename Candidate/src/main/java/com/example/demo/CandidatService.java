package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CandidatService {
	@Autowired
	private CandidatRepository candidatRepository ;
	
	public Candidat  addcondidat( Candidat candidat) {
		return  candidatRepository.save(candidat);
	}
	
	public Candidat  update(int id , Candidat newcandidat) {
		if (candidatRepository.findById(id).isPresent())
		{
			Candidat existantcandidt =candidatRepository.findById(id).get();
			existantcandidt.setNom(newcandidat.getNom());
			existantcandidt.setPrenom(newcandidat.getPrenom());
			existantcandidt.setEmail(newcandidat.getEmail());
			return  candidatRepository.save(existantcandidt);
		} else 
		return  null;
	}
	
	public String deletecandidat(int id)
	{
		if(candidatRepository.findById(id).isPresent())
		{
			candidatRepository.deleteById(id);
			return "Candidate supprimer avc sucees";
			
		} else return"ceci  n 'existe pas ";
		
	}
	
    }


