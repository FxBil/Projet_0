package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PersonnageController extends IndividuController implements ActionListener {
	
    HashMap<Integer, ObjetController> mapInventaire = new HashMap<Integer, ObjetController>();
    HashMap<Integer, ObjetController> mapStuff= new HashMap<Integer,  ObjetController>();
    int exp;
    ///test
    
    public HashMap<Integer, ObjetController> getMapChoix(){  
	    return mapInventaire;
	 }
    
    public HashMap<Integer, ObjetController> getMapStuff(){  
	    return mapStuff;
	 }
    
    public int getExp()
    {
    		return exp;
    }
    
    public void setMapChoix(HashMap<Integer, ObjetController> aMapInventaire){
	    mapInventaire = aMapInventaire;
	 }
    
    public void setMapStuff(HashMap<Integer, ObjetController> aMapStuff){
	    mapStuff = aMapStuff;
	 }
    
    public void  setExp(int newXp)
    {
    		exp = newXp;
    }

    
    
    public boolean fuite(PersonnageController perso,PNJController pnj) {
        
        if (perso.getAgilite() + EvenementController.lancerDes() > pnj.getAgilite() + EvenementController.lancerDes()) {
                return true;}
        else {
                return false;}
    }

   

    public int ajouterObjet(int key_objet) {
		ObjetController obj = new ObjetController(key_objet);
		mapInventaire.add(key_objet);//ajouter dans hashmap clé avec objet clé = keyobj valeur = obj
    }
    
    public int supprimerObjet(int key_objet) {
    		key_objet = ObjetController.getId_objet();
    		mapInventaire.remove(key_objet);
        }
    
    public int utiliserObjet(int key_objet) {
  		key_objet = ObjetController.getId_objet();
      mapInventaire.remove(key_objet);
      }
    
    int personnage: :personnage [ ]  {
    	String nom = tab[0];
    	String prenom = tab[1];
    	String genre = tab[2];
    	personnage = new caract( )


    	int id_race  = tab[5];
    	objet inventaire [];
    	objet equipement [];
    	} 


	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
