package com.groupeisi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.groupeisi.entities.Inscription;

public class InscriptionDoaImpl {

	String userMysql = "root";
	String passwordMysql = "";
	String url = "jdbc:mysql://localhost:3306/scolariteweb?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver (String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection cnx = null;
		try {
			Class.forName(dbDriver);
			cnx = DriverManager.getConnection(url, userMysql, passwordMysql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cnx;
	}
	
	public String create(Inscription inscription) {
		try {
			loadDriver(dbDriver);
			Connection cnx = getConnection();
	        String result = "Connection Successfully";
	        String INSERT_INSCRIPTION_SQL = "INSERT INTO inscription (nom,prenom,email,date,classe) VALUES  (?, ?, ?, ?, ?)";

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
}
