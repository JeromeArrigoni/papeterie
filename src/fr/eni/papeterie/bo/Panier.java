package fr.eni.papeterie.bo;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	private float montant;
	private List<Ligne> lignesPanier;

	public Panier() {

		float montant;
		lignesPanier = new ArrayList<>();
	}

	public float getMontant() {
		return montant;
	}

	public Ligne getLigne(int index) {
		return lignesPanier.get(index);
	}

	public final List<Ligne> getLignesPanier() {
		return lignesPanier;
	}

	public void addLigne(Article article, int qte) {

		lignesPanier.add(new Ligne(qte, article));
	}

	public void updateLigne(int index, int newQte) {
		this.getLigne(index).setQte(newQte);
	}

	public void removeLigne(int index) {
		lignesPanier.remove(index);
	}

	@Override
	public String toString() {
		return "Panier [montant=" + montant + ", lignesPanier=" + lignesPanier + "]";
	}

}
