package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;


@Service ("service")
public class serviceImpl implements Iservice {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@Autowired
	private AdresseRepository adresseRepository;



	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public int modifierPersonne(String nom, int idpersonne) {
		// TODO Auto-generated method stub
		return personneRepository.modifierPersonne(nom, idpersonne);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		personneRepository.delete(p);
	}

	@Override
	public Iterable<Personne> listerPersonne() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Optional<Personne> getPersonne(int idpersonne) {
		// TODO Auto-generated method stub
		return personneRepository.findById(idpersonne);
	}

	@Override
	public List<Personne> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenom(prenom);
	}

	@Override
	public List<Personne> chercherParPrenomContenant(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenomContaining(prenom);
	}

	@Override
	public List<Personne> rechercherParMC(String nom) {
		// TODO Auto-generated method stub
		return personneRepository.rechercherParMC("%"+nom+"%");
	}

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Adresse getAdresse(int idadresse) {
		// TODO Auto-generated method stub
		return adresseRepository.getOne(idadresse);
	}

	@Override
	public int modifierAdresse(String ville, int idadresse) {
		// TODO Auto-generated method stub
		return adresseRepository.modifierAdresse(ville, idadresse);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		adresseRepository.delete(a);
	}

	@Override
	public Iterable<Adresse> listerAdresse() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public void lierAdressePersonne(Adresse adresse, int idpersonne) {
		// TODO Auto-generated method stub
		personneRepository.lierAdressePersonne(adresse, idpersonne);
	}

	

}
