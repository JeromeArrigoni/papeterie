package fr.eni.papeterie.dal.jdbc;

import java.util.Properties;

public class Settings {

	private static Properties properties;

	// Permet d'executer ce qui se trouve dans le bloc static � chaque
	// cr�ation d'instance
	static {
		System.out.println("D�but du bloc static");

		properties = new Properties();
		try {
			properties.load(Settings.class.getResourceAsStream("conf.properties"));
			System.out.println("Connexion r�ussie");

		} catch (Exception e) {
			System.out.println("Il y'a eu une erreur lors de l'ouverture du fichier");
		}

	}

	public static String getProperties(String key) {
		return properties.getProperty(key);
	}

}
