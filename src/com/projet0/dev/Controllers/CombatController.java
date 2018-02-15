package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CombatController extends EvenementController implements ActionListener {
	
	int quiJoue;
	
	public int getQuiJoue(){  
	    return quiJoue;
	 }
	
	 public void setQuiJoue(int aQuiJoue){
	    quiJoue = aQuiJoue;
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
