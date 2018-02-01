package com.projet0.extra;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GestionBDD {
	 String bdurl = "chemin de la Base de Données"; 
	 String bdlogin = "root";
	 String bdpasswd = "";

	 Connection cn = null;
	 Statement st = null;
	 ResultSet rs = null;
	 
	 public void connect(){
		 try {
	          	Class.forName("com.mysql.jdbc.Driver");
	          	cn = (Connection) DriverManager.getConnection(bdurl, bdlogin, bdpasswd);
	   	} 
		 catch (SQLException e) {
	          	JOptionPane.showConfirmDialog(null, "Ouverture Impossible de la Base de Données (e)", "Le nom du Projet", JOptionPane.PLAIN_MESSAGE);
	          	e.printStackTrace();
	          	System.exit(0);
	   		} 
		 catch (ClassNotFoundException f) {
	   	   	JOptionPane.showConfirmDialog(null, "Ouverture Impossible de la Base de Données (f)",	"Le nom du projet", JOptionPane.PLAIN_MESSAGE);
	          	f.printStackTrace();
	          	System.exit(0);
		 }
	 }
	 
	 
}
