package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;


@Transactional
public interface PersonneRepository extends JpaRepository<Personne, Integer>{
	
	public List<Personne> findByPrenom(String x);
	public List<Personne> findByPrenomContaining(String x);
	
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> rechercherParMC(@Param("x")String nom);
	
	// Liste des mots clés permettant de créer des méthodes semblables aux deux précédents : 
	// https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
	
	// Méthode pour modifier le nom d'une personne
	
	@Modifying
	@Query("update Personne SET nom = :x where idpersonne = :a")
	public int modifierPersonne(@Param("x") String nom,@Param("a") int idpersonne);
	
	//Méthode pour ajouter une personne à une adresse
	
	@Modifying
	@Query("UPDATE Personne SET adresse = :x WHERE idpersonne = :y")
	public void lierAdressePersonne(@Param("x")Adresse adresse, @Param("y")int idpersonne);
	
		
}
