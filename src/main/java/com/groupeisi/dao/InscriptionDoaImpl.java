package com.groupeisi.dao;

import java.sql.Connection;
import java.sql.DriverManager;

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
}
