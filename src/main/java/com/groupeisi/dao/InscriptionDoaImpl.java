package com.groupeisi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		loadDriver(dbDriver);
		Connection cnx = getConnection();
        String result = "Inscription Successfully";
        String INSERT_INSCRIPTION_SQL = "INSERT INTO inscription (nom,prenom,email,date,classe) VALUES  (?, ?, ?, ?, ?)";
		
        try {
	        PreparedStatement pstm;
	    	
            	pstm = cnx.prepareStatement(INSERT_INSCRIPTION_SQL);
            	
            	pstm.setString(1, inscription.getNom());
            	pstm.setString(2, inscription.getPrenom());
            	pstm.setString(3, inscription.getEmail());
            	pstm.setDate(4, java.sql.Date.valueOf(inscription.getDate()));
            	pstm.setString(5, inscription.getClasse());
                pstm.executeUpdate();
            } catch (SQLException e) {
				e.printStackTrace();
				result = "Inscription echouée";
			}
		return result;

	}
}
