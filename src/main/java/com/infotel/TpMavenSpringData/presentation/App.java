package com.infotel.TpMavenSpringData.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.serviceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Iservice service = context.getBean("service", serviceImpl.class);    	
    	
//    	// Ajouter 1
//    	Personne p1 = context.getBean("personne", Personne.class);
//    	p1.setNom("Bruneau");
//    	p1.setPrenom("Raphaël");
//    	p1.setAge(24);
//    	System.out.println(p1);
//    	service.ajouterPersonne(p1);
//    	
//    	// Ajouter 2
//    	Personne p2 = context.getBean("personne", Personne.class);
//    	p2.setNom("Pol");
//    	p2.setPrenom("Jena");
//    	p2.setAge(24);
//    	System.out.println(p2);
//    	service.ajouterPersonne(p2);
//    	
//    	// Ajouter 3
//    	Personne p3 = context.getBean("personne", Personne.class);
//    	p3.setNom("V");
//    	p3.setPrenom("Keen");
//    	p3.setAge(24);
//    	System.out.println(p3);
//    	service.ajouterPersonne(p3);
//    	
//    	// Modifier
//    	service.modifierPersonne("Damidot",3);
//    	
//    	// Supprimer
//    	Personne p5 = context.getBean("personne", Personne.class);
//    	p5.setIdpersonne(2);	
//    	System.out.println(p5);
//    	service.supprimerPersonne(p5);
//    	
//    	
//    	// Lister
//    	System.out.println(service.listerPersonne());
//    	
//    	// Chercher par prénom   	
//    	System.out.println(service.chercherParPrenom("Raphaël"));
//    	
//    	// Chercher par prénom contenant  	
//    	System.out.println(service.chercherParPrenomContenant("ee"));
//    	
//    	// Chercher par nom contenant
//    	System.out.println(service.rechercherParMC("eau"));
//    	
//    	// Méthode Get
//    	System.out.println(service.getPersonne(3));
//    	
//    	// Ajouter 1
//    	Adresse a1 = context.getBean("adresse", Adresse.class);
//    	a1.setNumRue("45");
//    	a1.setNomRue("Rue de la Paix");
//    	a1.setCp("29470");
//    	a1.setVille("Plougastel");
//    	System.out.println(a1);
//    	service.ajouterAdresse(a1);
//    	
//    	// Ajouter 2
//    	Adresse a2 = context.getBean("adresse", Adresse.class);
//    	a2.setNumRue("18");
//    	a2.setNomRue("Rue de l'Amour");
//    	a2.setCp("69100");
//    	a2.setVille("Villeurbanne");
//    	System.out.println(a2);
//    	service.ajouterAdresse(a2);
//    	
//    	// Ajouter 3
//    	Adresse a3 = context.getBean("adresse", Adresse.class);
//    	a3.setNumRue("37");
//    	a3.setNomRue("Rue de la Vie");
//    	a3.setCp("78230");
//    	a3.setVille("Le Pecq");
//    	System.out.println(a3);
//    	service.ajouterAdresse(a3);
//    	
//    	// Modifier
//    	service.modifierAdresse("Caen", 3);
//    	
//    	// Supprimer
//    	Adresse a5 = context.getBean("adresse", Adresse.class);
//    	a5.setIdadresse(2);	
//    	System.out.println(a5);
//    	service.supprimerAdresse(a5);
//    	
//    	
//    	// Lister
//    	System.out.println(service.listerAdresse());
//    	
//    	// Méthode Get
//    	System.out.println(service.getAdresse(3));
//    	
    	
    	// Méthode pour lier adresse à une personne
    	
    	service.lierAdressePersonne(service.getAdresse(3), 1);
    	
    	
    	context.close();
    }
}
