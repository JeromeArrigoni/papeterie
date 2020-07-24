package fr.eni.papeterie.dal.jdbc;

import java.util.Properties;

public class Settings {

	private static Properties properties;

	// Permet d'executer ce qui se trouve dans le bloc static à chaque
	// création d'instance
	static {
		System.out.println("Début du bloc static");

		properties = new Properties();
		try {
			properties.load(Settings.class.getResourceAsStream("conf.properties"));

		} catch (Exception e) {
			System.out.println("Il y'a eu une erreur lors de l'ouverture");
		}

	}

	public static String getProperties(String key) {
		return properties.getProperty(key);
	}

}
