package fr.petro.exos.vente.vetements.donnees;

import java.util.ArrayList;
import java.util.List;

public class StockModel2 {

	private List<ElementDeStock> elementsDeStock;

	public StockModel2() {

		this.elementsDeStock = new ArrayList<>();
	}

	public void ajouterProduit(List<ElementDeStock> elementsDeStock) {
		for (ElementDeStock elementDeStock : elementsDeStock) {
			if (this.elementsDeStock.contains(elementDeStock)) {
				// EDS = élément de stock
				ElementDeStock edsexistant = this.elementsDeStock.stream()
						.filter(current -> current.equals(elementDeStock)).findFirst().get();
				edsexistant.setQuantite(edsexistant.getQuantite() + elementDeStock.getQuantite());
			} else {
				this.elementsDeStock.add(elementDeStock);

			}
		}
	}

	// si le produit n'existe pas, alors créer, le produit et mettre dans le stock

	private ElementDeStock elementsDeStock() {
		// TODO Auto-generated method stub
		return null;
	}
}
