package com.projet0.dev.Controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjetController implements ActionListener {
	
	ObjetController(int id)
	{
		
	}
	
	String nom, description;
    int durabilite, valeur, type, temp, constitution, force, agilite, perception, charisme, intelligence, etat;
    Image image;

	public int getDurabilite(){  
	    return durabilite;
	 }
	
	public int getValeur(){  
	    return valeur;
	 }
	
	public int getType(){  
	    return type;
	 }
	
	public int getTemp(){  
	    return temp;
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

	public String getDescription(){  
	    return description;
	 }
	

	public Image getImage(){  
	    return image;
	 }
	
	 public void setGenre(int aDurabilite){
	    durabilite = aDurabilite;
	 }
	 
	 public void setAge(int aValeur){
		 valeur = aValeur;
	 }
	 
	 public void setPoids(int aType){
		 type = aType;
	 }
	 
	 public void setTaille(int aTemp){
		 temp = aTemp;
	 }
	 
	 public void setConstitution(int bConstitution){
		 constitution = bConstitution;
	 }
	 
	 public void setForce(int bForce){
		 force = bForce;
	 }
	 
	 public void setAgilite(int bAgilite){
		 agilite = bAgilite;
	 }
	 
	 public void setPerception(int bPerception){
		 perception = bPerception;
	 }
	 
	 public void setCharisme(int bCharisme){
		 charisme = bCharisme;
	 }
	 
	 public void setIntelligence(int bIntelligence){
		 intelligence = bIntelligence;
	 }
	 
	 public void setEtat(int bEtat){
		 etat = bEtat;
	 }
	 
	 public void setNomt(String bNom){
		 nom = bNom;
	 }
	 
	 public void setPrenom(String bDescription){
		 description = bDescription;
	 }
	 
	 public void setImage(Image bImage){
		 image = bImage; //
	 }
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
