package com.groupeisi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.groupeisi.entities.User;

public class UserDoaImpl {

	/*private PreparedStatement pstm;
	private ResultSet rs;
	private Connection cnx;
	private int result;*/
	
	String userMysql = "root";
	String passwordMysql = "";
	String url = "jdbc:mysql://localhost:3306/scolaritedb";
	String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbdriver) {
		try {	
			Class.forName(dbDriver) ;
		}catch(Exception ex){
			ex.printStackTrace() ;
		}
	}
	
	public Connection getConnection() {
		Connection cnx = null;
		try {
			Class.forName(dbDriver) ;
			cnx = DriverManager.getConnection(url, userMysql, passwordMysql);
		}catch(Exception ex){
			ex.printStackTrace() ;
		}
		return cnx;
	}
	
	public String insert(User user) {
			
			loadDriver(dbDriver);
			Connection cnx = getConnection();
	        String INSERT_USERS_SQL = "INSERT INTO user VALUES  (?, ?, ?, ?, ?);";
	        String result = "Connection Successfully";
	        
	        	PreparedStatement pstm;
	
	            try {
	            	pstm = cnx.prepareStatement(INSERT_USERS_SQL);
	            	pstm .setInt(1, 1);
	            	pstm .setString(2, user.getFirstname());
	            	pstm .setString(3, user.getLastname());
	            	pstm .setString(4, user.getEmail());
	            	pstm.setString(5, user.getPassword());
	                pstm .executeUpdate();
	            } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = "Connexion echouée";
				}
			return result;
		}
	
	
	//Connexion DB
	/*public Connection openConnection() {
		
		Connection cnx = null;
		try {
			//chargement du pilote
			
			Class.forName(dbDriver) ;
			cnx = DriverManager.getConnection(url, userMysql, passwordMysql);
		}catch(Exception ex){
			ex.printStackTrace() ;
		}
		return cnx;
	}*/
	
	/*public void closeConnection() {
		try {
			if(cnx != null) {
				cnx.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}*/

	/*public String insert(User user) {
		
		Connection cnx = openConnection();
        String INSERT_USERS_SQL = "INSERT INTO user VALUES  (?, ?, ?, ?, ?);";
        String result = "Connection Successfully";
        
        	PreparedStatement pstm;

            try {
            	pstm = cnx.prepareStatement(INSERT_USERS_SQL);
            	pstm .setInt(1, 1);
            	pstm .setString(2, user.getFirstname());
            	pstm .setString(3, user.getLastname());
            	pstm .setString(4, user.getEmail());
            	pstm.setString(5, user.getPassword());
                pstm .executeUpdate();
            } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result = "Connexion echouée";
			}
		return result;
	}*/
}
