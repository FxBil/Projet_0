package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PersonnageController extends IndividuController implements ActionListener {
	
    HashMap<Integer, String> mapInventaire = new HashMap<Integer, String>();
    HashMap<Integer, String> mapStuff= new HashMap<Integer, String>();
    int exp;
    ///test
    
    public HashMap<Integer,String> getMapChoix(){  
	    return mapInventaire;
	 }
    
    public HashMap<Integer,String> getMapStuff(){  
	    return mapStuff;
	 }
    
    public int getExp()
    {
    		return exp;
    }
    
    public void setMapChoix(HashMap<Integer,String> aMapInventaire){
	    mapInventaire = aMapInventaire;
	 }
    
    public void setMapStuff(HashMap<Integer,String> aMapStuff){
	    mapStuff = aMapStuff;
	 }
    
    public void  setExp(int newXp)
    {
    		exp = newXp;
    }

    
    
    static public boolean fuite(int id_perso,int id_pnj) {
        id_perso = PersonnageController.getId_perso();
        id_pnj = PNJController.getId_png();
        
        if (PersonnageController.getAgi_perso() + EvenementController.lancerDes() > PNJController.getAgi_pnj() + EvenementController.lancerDes()) {
                return true;}
        else {
                return false;}
    }

   

    static public int ajouterObjet(int key_objet) {
		key_objet = ObjetController.getId_objet();//caca
		mapInventaire.add(key_objet);
    }
    
    static public int supprimerObjet(int key_objet) {
    		key_objet = ObjetController.getId_objet();
    		mapInventaire.remove(key_objet);
        }
    
    static public int utiliserObjet(int key_objet) {
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
