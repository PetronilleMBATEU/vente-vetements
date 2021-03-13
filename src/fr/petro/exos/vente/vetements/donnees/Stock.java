package fr.petro.exos.vente.vetements.donnees;

import java.util.HashMap;
import java.util.Map;

public class Stock {

	private Map<Produit, Integer> stock; // Déclaration de la class(type) Map = tableau à 2 dimensions, collection de
	// key/value et, liste clef valeurs (
	// integer = quantité

	public Stock() { // Constructeur vide
		this.stock = new HashMap<>(); // Généricité qui rappelle la ligne 8 ou déclaration et instanciation de l'objet hashmap

	} // toujours appliquer les hashcodes et equals lorsqu'on utilise des map et ou hashmap

	public void ajouterProduit(Produit produit, Integer quantite) { // Methode AjouterProduit
		this.stock.put(produit, quantite);
	}

	public void sortirProduit(Produit produitASortir, Integer quantiteASortir) {
		Integer quantiteStock = this.stock.get(produitASortir);
		Integer quantiteRestante = quantiteStock - quantiteASortir;
		this.stock.put(produitASortir, quantiteRestante);
	}
 
		
		}
				
