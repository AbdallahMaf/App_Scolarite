package com.groupeisi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import com.groupeisi.entities.User;


public class UserDaoImpl {
	
	private PreparedStatement pstm;
	private ResultSet rs;
	private Connection cnx;
	private int result;

	
	//Connexion DB
	public void openConnection() {
		String userMysql = "root";
		String passwordMysql = "";
		String url = "jdbc:mysql://localhost:3306/scolaritedb";
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		
		try {
			//chargement du pilote
			Class.forName("com.mysql.jdbc.Driver") ;
			cnx = DriverManager.getConnection(url, userMysql, passwordMysql);
			System.out.println("SUCCESS");
		}catch(Exception ex){
			ex.printStackTrace() ;
		}
	}
	
	public void closeConnection() {
		try {
			if(cnx != null) {
				cnx.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}
	
	
    /*public UserDaoImpl() {
    }

    public int registerEmployee(User user) throws Throwable {
        String INSERT_USERS_SQL = "INSERT INTO user  (id, firstname, lastname, email, password) VALUES  (?, ?, ?, ?, ?);";
        int result = 0;
        Class.forName("com.mysql.jdbc.Driver");

        try {
            Throwable var4 = null;
            Object var5 = null;

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite_db?useSSL=false", "root", "");

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);

                    try {
                        preparedStatement.setInt(1, 1);
                        preparedStatement.setString(2, user.getLastname());
                        preparedStatement.setString(3, user.getLastname());
                        preparedStatement.setString(4, user.getEmail());
                        preparedStatement.setString(5, user.getPassword());
     
                        result = preparedStatement.executeUpdate();
                    } finally {
                        if (preparedStatement != null) {
                            preparedStatement.close();
                        }

                    }
                } catch (Throwable var21) {
                    if (var4 == null) {
                        var4 = var21;
                    } else if (var4 != var21) {
                        var4.addSuppressed(var21);
                    }

                    if (connection != null) {
                        connection.close();
                    }

                    throw var4;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Throwable var22) {
                if (var4 == null) {
                    var4 = var22;
                } else if (var4 != var22) {
                    var4.addSuppressed(var22);
                }

                throw var4;
            }
        } catch (SQLException var23) {
            this.printSQLException(var23);
        }

        return result;
    }

    private void printSQLException(SQLException ex) {
        Iterator var3 = ex.iterator();

        while(true) {
            Throwable e;
            do {
                if (!var3.hasNext()) {
                    return;
                }

                e = (Throwable)var3.next();
            } while(!(e instanceof SQLException));

            e.printStackTrace(System.err);
            System.err.println("SQLState: " + ((SQLException)e).getSQLState());
            System.err.println("Error Code: " + ((SQLException)e).getErrorCode());
            System.err.println("Message: " + e.getMessage());

            for(Throwable t = ex.getCause(); t != null; t = t.getCause()) {
                System.out.println("Cause: " + t);
            }
        }
    }*/
}
