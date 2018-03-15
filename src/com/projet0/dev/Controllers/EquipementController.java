package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipementController implements ActionListener {
	
	boolean estEquipe;
	
	ObjetController armeG, armeD, gant, tete, corps, jambes, pieds, potion1, potion2, potion3, potion4, potion5;
	
	public boolean getEstEquipe(){  
	    return estEquipe;
	 }
	
	 public void setEstEquipe(boolean aEstEquipe){
	    estEquipe = aEstEquipe;
	 }

	public void ajouterObjet(ObjetController objet, int emplacement)
    {	
        switch (emplacement)
        {
        case 0 : armeG = objet;
        	break;
        case 1: armeD = objet;
        	break;
        case 2: gant = objet;
        	break;
        case 3 : tete = objet;
        	break;
        case 4: corps = objet;
        	break;
        case 5: jambes = objet;
        	break;
        case 6 : pieds = objet;
        	break;
        case 7: potion1 = objet;
        	break;
        case 8: potion2 = objet;
        	break;
        case 9 : potion3 = objet;
        	break;
        case 10: potion4 = objet;
        	break;
        case 11: potion5 = objet;
        	break;
        }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}





