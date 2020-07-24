package fr.eni.papeterie.dal.jdbc;

public class DAOFactory {

	public static ArticleDAO recupInstance() {
		return new ArticleDAOJdbcImpl();
	}
}
