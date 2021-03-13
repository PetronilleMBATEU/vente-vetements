package fr.petro.exos.vente.vetements.operations.impl;

import java.util.Map;

import fr.petro.exos.vente.vetements.donnees.Panier;
import fr.petro.exos.vente.vetements.donnees.Produit;
import fr.petro.exos.vente.vetements.operations.EffectuerVente;

public class Caisse implements EffectuerVente {


	//R�cup�rer la liste des produits et prix du panier, faire m�thode ou op�ration vente = n(prod.prix) x quantit� pour calcul du prix total d'un panier. 
	// m�thode classe panier et foreach pour chaque produit et quantit� � encaisser. 


	@Override
	public void vente(Panier panier) {
		double prixDeVenteTotal = 0;
		Map<Produit, Integer> produits = panier.getPanier(); 
		for (Map.Entry<Produit, Integer> entry: produits.entrySet()) {
			
			Produit p = entry.getKey();
			Integer quantite = entry.getValue();
			double prixDeVenteProduit = p.getPrix()*quantite; 
			prixDeVenteTotal = prixDeVenteTotal+prixDeVenteProduit;
			
		}
		System.out.println("prixDeTotalVente est de" + "..." + prixDeVenteTotal);

	}



}
