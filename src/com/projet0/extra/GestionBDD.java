package com.projet0.extra;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GestionBDD {
	 String bdurl = "projetovkxslam6.mysql.db"; 
	 String bdlogin = "projetovkxslam6";
	 String bdpasswd = "projet0Slam";

	 Connection cn = null;
	 Statement st = null;
	 ResultSet rs = null;
	 
	 public void connect(){
		 try {
	          	Class.forName("com.mysql.jdbc.Driver");
	          	cn = (Connection) DriverManager.getConnection(bdurl, bdlogin, bdpasswd);
	   	} 
		 catch (SQLException e) {
	          	JOptionPane.showConfirmDialog(null, "Ouverture Impossible de la Base de Données (e)", "Projet_0", JOptionPane.PLAIN_MESSAGE);
	          	e.printStackTrace();
	          	System.exit(0);
	   		} 
		 catch (ClassNotFoundException f) {
	   	   	JOptionPane.showConfirmDialog(null, "Ouverture Impossible de la Base de Données (f)",	"Projet_0", JOptionPane.PLAIN_MESSAGE);
	          	f.printStackTrace();
	          	System.exit(0);
		 }
		 return;
	 }
	 public Connection getcn(){
			return cn;
		}
		public String getUrl(){
			return bdurl;
		}
	 
}
