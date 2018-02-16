package com.projet0.dev.Controllers;

import java.awt.event.ActionListener;

public class RecontreController extends EvenementController implements ActionListener {
	
	PersonnageController personnage;
    PNJController pnj;
    
    public PersonnageController getPersonnage(){  
	    return personnage;
	 }
    
    public PNJController getPnj(){  
	    return pnj;
	 }
	
	 public void setPersonnage(PersonnageController aPersonnage){
	    personnage = aPersonnage;
	 }

	 public void setPnj(PNJController aPnj){
		    pnj = aPnj;
		 }

}
