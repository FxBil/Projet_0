package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatController extends EvenementController implements ActionListener {
	
	static int quiJoue = 1; 
	boolean aGagne; 
	
	public int getQuiJoue(){  
	    return quiJoue;
	 }
	
	 public void setQuiJoue(int aQuiJoue){
	    quiJoue = aQuiJoue;
	 }
	 
	 public void changementTour(int aQuiJoue, PersonnageController perso, PNJController pnj)//incrémenter
	 {
		 
		 quiJoue ++;
		 if(perso.constitution > 50)
		 {
			 perso.etat = 4;
		 }
		 if(perso.constitution > 25)
		 {
			 perso.etat = 3;
		 }
		 if(perso.constitution < 25 && perso.constitution > 0)
		 {
			 perso.etat = 2;
		 }
		 else
		 {
			 perso.etat = 1;
		 }

	 }
	 
	 public int sortieCombat(int action,PersonnageController perso, PNJController pnj)
	 {
			
			if (perso.fuite(perso, pnj) == true) {
				action=1;// a le droit
			}
			
			if (perso.etat == 1) {
				action=0;//Mort fin combat
			}
						
			if(pnj.constitution <= 0)
			{
				 action = 2;//PNJ mort fin combat 
			}
			
			return action;
			
		}
	 	
	static public int verificationEtat(PersonnageController perso){
        
        int etat = perso.etat;

        switch (etat)
        {
        case 1:
        System.out.println("mort");
        return etat;        
        case 2:
        System.out.println("blessé grave");
        return etat;        
        case 3:
        System.out.println("blessé");
        return etat;
        default:
        System.out.println("normal");
        return etat;
        }
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
