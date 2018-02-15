package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PersonnageController extends IndividuController implements ActionListener {
	
    HashMap<Integer, String> mapInventaire = new HashMap<Integer, String>();
    HashMap<Integer, String> mapStuff= new HashMap<Integer, String>();
    ///test
    
    
    static public boolean fuite(int id_perso,int id_pnj) {
        id_perso = PersonnageController.getId_perso();
        id_pnj = PNJController.getId_png();
        
        if (PersonnageController.getAgi_perso() + EvenementController.lancerDes() > PNJController.getAgi_pnj() + EvenementController.lancerDes()) {
                return true;}
        else {
                return false;}
    }



	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
