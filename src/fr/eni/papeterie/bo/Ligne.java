package fr.eni.papeterie.bo;

public class Ligne {

	protected int qte;
	private Article article;

	public Ligne(int qte, Article article) {
		super();
		setQte(qte);
		setArticle(article);

	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public float getPrix() {

		return article.getPrixUnitaire();
	}

	public Article getArticle() {
		return this.article;
	}

	private void setArticle(Article article) {
		this.article = article;

	}

	@Override
	public String toString() {
		return "Ligne [qte=" + qte + ", article=" + article + "]";
	}

}
