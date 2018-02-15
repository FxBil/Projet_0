package com.projet0.dev.Controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.lang.Math;

public class EvenementController implements ActionListener {
	
	String nom;
    Image image;
    HashMap<Integer, String> mapChoix = new HashMap<Integer, String>();
    
    
    static public int lancerDes(){
        int nbrand = 0;
        int etat = IndividuController.getEtat();
    
        if (etat == 3) {
            nbrand = (int) (Math.random() * 6 );  //Pour un entier entre 0 et 5
            return nbrand;}
        else if (etat == 2) {
            nbrand = (int) (Math.random() * 3 );  // Pour un entier entre 0 et 2
                return nbrand;}                                     
        else {
            nbrand = (int) (Math.random() * 11 );  // Pour un entier entre 0 et 10    
                return nbrand;}                                
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
