package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatController extends EvenementController implements ActionListener {
	
	static int quiJoue;
	
	public int getQuiJoue(){  
	    return quiJoue;
	 }
	
	 public void setQuiJoue(int aQuiJoue){
	    quiJoue = aQuiJoue;
	 }
	 
	 public void changementTour()
	 {
		 quiJoue = (quiJoue == 1) ? (quiJoue = 0):(quiJoue = 1);
		 if(perso.constituion > 50)
		 {
			 etat = 1;
		 }
		 if(perso.constitution > 25)
		 {
			 etat = 2;
		 }
		 else
		 {
			 etat = 3;
		 }
	 }
	 
	 public boolean sortieCombat(int action) {
			
			if (PersonnageController.fuite() == true) {
				action=1;
			}
			
			if (getEtat() == 1) {
				action=2;
			}
			
			/*if (variable gagne changement tour == true){
				action=3;
			}*/
			
			
		}
	 	
	static public int verificationEtat(PersonnageController perso){
        
        int etat = perso.getEtat();

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
