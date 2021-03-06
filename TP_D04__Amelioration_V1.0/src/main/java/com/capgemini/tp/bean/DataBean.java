/**
 * 
 */
package com.capgemini.tp.bean;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * DataBean est la classe qui permet la connexion à la base de données grâce à
 * la DataSource "masource"
 * 
 * @author Lamine
 *
 */
public class DataBean {
	/**
	 * son unique méthode getConnection() renvoie la connexion sous forme d'un
	 * objet de type Connection
	 */
	public Connection getConnection() {
		Connection con = null;
		try {
			Context initialContext = new InitialContext();
			Context localContext = (Context) initialContext.lookup("java:comp/env/");
			DataSource ds = (DataSource) localContext.lookup("MaConnexion");
			con = ds.getConnection();
		} catch (NamingException e) {
			System.out.println("erreur dans databean NamingException");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur dans databean SQLException");
		}

		return con;
	}
}
