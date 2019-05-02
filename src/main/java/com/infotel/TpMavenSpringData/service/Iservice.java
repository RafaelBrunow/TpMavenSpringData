package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {
	
	public Personne ajouterPersonne(Personne p);
	public Optional<Personne> getPersonne(int idpersonne);
	public int modifierPersonne(String nom, int idpersonne);
	public void supprimerPersonne(Personne p);
	public Iterable<Personne> listerPersonne();
	
	public List<Personne> chercherParPrenom(String prenom);
	public List<Personne> chercherParPrenomContenant(String prenom);
	public List<Personne> rechercherParMC(String nom);
	
	public void lierAdressePersonne(Adresse adresse, int idpersonne);
	
	
	public Adresse ajouterAdresse(Adresse a);
	public Adresse getAdresse(int idadresse);
	public int modifierAdresse(String ville, int idadresse);
	public void supprimerAdresse(Adresse a);
	public Iterable<Adresse> listerAdresse();
}
