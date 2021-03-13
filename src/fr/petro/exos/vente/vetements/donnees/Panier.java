package fr.petro.exos.vente.vetements.donnees;

import java.util.HashMap;
import java.util.Map;

public class Panier {

	// Déclaration de la variable produits sous forme de liste et s'applique ds le constructeur
	private Map<Produit, Integer> panier; // toujours initialiser avec new hash map 

	public Panier() { 
		super();
		this.panier = new HashMap<>();
	}

	// public void ajouterPanier(Map<Produit,Integer> produitsAajouter){
	//for(Produit produitAajouter: produitsAajouter)	{	
	//this.produits.add(produitAajouter);
	// }

	public void ajouterProduitEtQuantite(Produit produitAajouter, Integer quantite) {
		this.panier.put(produitAajouter,quantite);
	}
	
	public Map<Produit, Integer> getPanier() {
		return panier;
	}



}
