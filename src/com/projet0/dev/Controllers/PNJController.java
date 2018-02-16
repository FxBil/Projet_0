package com.projet0.dev.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PNJController extends IndividuController implements ActionListener {
	
    HashMap<Integer, String> mapMarchandise = new HashMap<Integer, String>();
    
    
    public HashMap<Integer,String> getMapMarchandise(){  
	    return mapMarchandise;
	 }
    
    public void setMapMarchandise(HashMap<Integer,String> aMapMarchandise){
	    mapMarchandise = aMapMarchandise;
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}


}
