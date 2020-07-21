package fr.eni.papeterie.bo;

import java.util.List;

public class Panier {

	private float montant;
	private List<Ligne> lignesPanier;

	public Panier() {
		super();
	}

	public float getMontant() {
		return montant;
	}

	public Ligne getLigne(int index) {

	}

	public List<Ligne> getLignesPanier() {
		return this.lignesPanier;
	}

	public void addLigne(Article article, int qte) {

	}

	public void updateLigne(int index, int newQte) {

	}

	public void removeLigne(int index) {

	}

	@Override
	public String toString() {
		return "Panier [montant=" + montant + ", lignesPanier=" + lignesPanier + "]";
	}

}
