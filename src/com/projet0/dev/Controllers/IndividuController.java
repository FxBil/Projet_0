package com.projet0.dev.Controllers;

import java.awt.Image;
import java.awt.event.ActionListener;

public abstract class IndividuController implements ActionListener {
	
	int genre, age, poids, taille,constitution, force, agilite, perception, charisme, intelligence, etat;
	String nom, prenom;
	Image image;

	
	public int attaque(PersonnageController unPersonnage, PNJController unPnj, CombatController quiJoue) {
		
		if (quiJoue%2==0) {
			
			PersonnageController attaquant = unPersonnage;
			PNJController défenseur = unPnj;
			
		}
		else {
			
			PNJController attaquant = unPnj;
			PersonnageController défenseur = unPersonnage;
			
		}
		
		int atk = (lancerDes()+(attaquant.force+attaquant.agi+attaquant.intelligence));
		int def = (lancerDes()+(défenseur.force+défenseur.agi+défenseur.intelligence));
		int dgt = atk-def;
		
		if (dgt<1) {
			dgt=0;
		}
		
		int constitu = défenseur.constitution-dgt;
		return défenseur.constitution;

	}
}
