package com.bo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnexionBD {	
	private static Connection Connexion=null;
	
	public ConnexionBD(){
		try {
			Class.forName ("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/berexia_project";
		try{
		 Connexion = DriverManager.getConnection(url, "root", "");
		System.out.println(getClass().getName() + ": connecté");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public Connection getConnexion(){
		return Connexion;
	}

public static void main(String[] args) {
	
	ConnexionBD conn= new ConnexionBD();
}}




