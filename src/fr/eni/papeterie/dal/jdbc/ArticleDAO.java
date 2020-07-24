package fr.eni.papeterie.dal.jdbc;

import java.util.List;

import fr.eni.papeterie.bo.Article;
import fr.eni.papeterie.dal.DALException;

public interface ArticleDAO {

	public Article selectById(int id) throws DALException;

	public List<Article> selectAll() throws DALException;

	public void update(Article data) throws DALException;

	public void insert(Article data) throws DALException;

	public void delete(int id) throws DALException;

	public List<Article> selectByMarque(String marque) throws DALException;

	public List<Article> selectByMotCle(String motCle) throws DALException;
}
