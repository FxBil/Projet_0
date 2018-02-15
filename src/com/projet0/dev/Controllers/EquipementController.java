package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EquipementController implements ActionListener {
	
	boolean estEquipe;
	
	
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



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}





