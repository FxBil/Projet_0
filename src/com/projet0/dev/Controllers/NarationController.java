package com.projet0.dev.Controllers;

import java.awt.event.ActionListener;

public class NarationController extends EvenementController implements ActionListener {

	public NarationController(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	String texte;
	

	public String getTexte(){  
	    return texte;
	}
	
	 public void setTexte(String aTexte){
	    texte = aTexte;
	 }

}
