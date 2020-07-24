package fr.eni.papeterie.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTools {

	private static String urldb = Settings.getProperties("url");
	private static String userdb = Settings.getProperties("utilisateur");
	private static String passwordddb = Settings.getProperties("mdp").trim();

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(urldb, userdb, passwordddb);

	}
}
