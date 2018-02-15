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

	
	UserController (UserModel modelUser, UserView viewUser) {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
