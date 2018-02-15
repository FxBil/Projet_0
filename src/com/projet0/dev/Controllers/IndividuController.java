package com.projet0.dev.Controllers;

import java.awt.Image;
import java.awt.event.ActionListener;

public abstract class IndividuController implements ActionListener {
	
	int genre, age, poids, taille,constitution, force, agilite, perception, charisme, intelligence, etat;
	String nom, prenom;
	Image image;
	
	public int getGenre(){  
	    return genre;
	 }
	
	public int getAge(){  
	    return age;
	 }
	
	public int getPoids(){  
	    return poids;
	 }
	
	public int getTaille(){  
	    return taille;
	 }
	
	public int getConstitution(){  
	    return constitution;
	 }
	
	public int getForce(){  
	    return force;
	 }
	
	public int getAgilitee(){  
	    return agilite;
	 }
	
	public int getPerception(){  
	    return perception;
	 }
	
	public int getCharisme(){  
	    return charisme;
	 }
	
	public int getIntelligence(){  
	    return intelligence;
	 }
	
	public int getEtat(){  
	    return etat;
	 }
	
	public String getNom(){  
	    return nom;
	 }

	public String getPrenom(){  
	    return prenom;
	 }
	

	public Image getImage(){  
	    return image;
	 }
	
	 public void setGenre(int aGenre){
	    genre = aGenre;
	 }
	 
	 public void setAge(int aAge){
		 age = aAge;
	 }
	 
	 public void setPoids(int aPoids){
		 poids = aPoids;
	 }
	 
	 public void setTaille(int aTaille){
		 taille = aTaille;
	 }
	 
	 public void setConstitution(int aConstitution){
		 constitution = aConstitution;
	 }
	 
	 public void setForce(int aForce){
		 force = aForce;
	 }
	 
	 public void setAgilite(int aAgilite){
		 agilite = aAgilite;
	 }
	 
	 public void setPerception(int aPerception){
		 perception = aPerception;
	 }
	 
	 public void setCharisme(int aCharisme){
		 charisme = aCharisme;
	 }
	 
	 public void setIntelligence(int aIntelligence){
		 intelligence = aIntelligence;
	 }
	 
	 public void setEtat(int aEtat){
		 etat = aEtat;
	 }
	 
	 public void setNomt(String aNom){
		 nom = aNom;
	 }
	 
	 public void setPrenom(String aPrenom){
		 prenom = aPrenom;
	 }
	 
	 public void setImage(Image aImage){
		 image = aImage;
	 }
	 

	
	public int attaque(PersonnageController unPersonnage, PNJController unPnj, CombatController quiJoue) {
		
		if (CombatController.quiJoue%2==0) {
			
			PersonnageController attaquant = unPersonnage;
			PNJController défenseur = unPnj;
			
			int atk = (EvenementController.lancerDes()+(attaquant.force+attaquant.agilite+attaquant.intelligence));
			int def = (EvenementController.lancerDes()+(défenseur.force+défenseur.agilite+défenseur.intelligence));
			
			int dgt = atk-def;
			
			if (dgt<1) {
				dgt=0;
			}
			
			int constitu = défenseur.constitution-dgt;
			return défenseur.constitution;
		}
		else {
			
			PNJController attaquant = unPnj;
			PersonnageController défenseur = unPersonnage;
			
			int atk = (EvenementController.lancerDes()+(attaquant.force+attaquant.agilite+attaquant.intelligence));
			int def = (EvenementController.lancerDes()+(défenseur.force+défenseur.agilite+défenseur.intelligence));
			
			int dgt = atk-def;
			
			if (dgt<1) {
				dgt=0;
			}
			
			int constitu = défenseur.constitution-dgt;
			return défenseur.constitution;
			
		}
		
	}
}
