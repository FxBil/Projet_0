package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipementController implements ActionListener {
	
	boolean estEquipe;
	
	public boolean getEstEquipe(){  
	    return estEquipe;
	 }
	
	 public void setEstEquipe(boolean aEstEquipe){
	    estEquipe = aEstEquipe;
	 }

	static public boolean verification(ObjetController objet){
        boolean contain = false;
        int type=set(objet.type);
        int [] emplacement = ; // je ne sais pas avec quoi tester , a voir avec l'equipe
         for(type=0;type<emplacement.length;type++)
                {
                    if(emplacement[type]==set(objet.type))
                    {
                        contain = true;
                    }
                }
         if(contain)
             {System.out.println("l’objet"+ objet.getType()+" peut être équipé");}
         else
             {System.out.println("l’objet"+objet.getType()+" peut pas être équipé");}

        }

	public ajouterObjet(keyObjetDestination, Objet objetAjoute)
    {
        if(objetAjout = true)
        {
	keyObjetDestination = objetAncien

	estEquipé = 0
	estEquipé = 1
              
        }
        else 
        {
            System.out.println("Cet objet ne peut pas être équipé ici");//
        }
    }
}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}





