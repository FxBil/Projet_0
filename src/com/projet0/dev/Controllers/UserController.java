package com.projet0.dev.Controllers;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import com.projet0.dev.Models.UserModel;
import com.projet0.dev.Views.UserView;

public class UserController implements ActionListener {
	
    HashMap<Integer, String> mapPerso = new HashMap<Integer, String>();
    HashMap<Integer, String> mapScenar = new HashMap<Integer, String>();
    String login;
    Image image;
    
    public HashMap<Integer,String> getMapPerso(){  
	    return mapPerso;
	}
    
    public HashMap<Integer,String> getMapScenar(){  
	    return mapScenar;
	}
    
    public String getLogin(){  
	    return login;
	}
   
    public Image getImage(){  
	    return image;
	}
	
    public void setMapPerso(HashMap<Integer,String> aMapPerso){
	    mapPerso = aMapPerso;
    }
    
    public void setMapScenar(HashMap<Integer,String> aMapScenar){
	    mapScenar = aMapScenar;
    }
    
	 public void setLogin(String aLogin){
	    login = aLogin;
	 }
	 
	 public void setImage(Image aImage){
		 image = aImage;
	 }
	 
	 

	
	UserController (UserModel modelUser, UserView viewUser) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
