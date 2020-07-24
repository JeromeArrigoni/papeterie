package fr.eni.papeterie.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTools {

	private static String urldb;
	private static String userdb;
	private static String passwordddb;

	public static Connection getConnection() throws SQLException {

		urldb = Settings.getProperties("url");
		userdb = Settings.getProperties("utilisateur");
		passwordddb = Settings.getProperties("mdp").trim();

		return DriverManager.getConnection(urldb, userdb, passwordddb);

	}

}
