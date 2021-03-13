package fr.petro.exos.vente.vetements;

import fr.petro.exos.vente.vetements.donnees.Panier;
import fr.petro.exos.vente.vetements.donnees.Produit;
import fr.petro.exos.vente.vetements.donnees.Stock;
import fr.petro.exos.vente.vetements.operations.impl.Caisse;
import fr.petro.exos.vente.vetements.donnees.Categorie;
public class LanceurAppVetements {

	public static void main(String[] args) {

		String nom = "vetementsHomme";
		Categorie vetementsHomme = new Categorie (nom);

		String nomFemme = "vetementsFemme";
		Categorie vetementsFemme = new Categorie (nomFemme);

		String chaussures = "escarpinsFemme"; 
		Categorie escarpinsFemme = new Categorie (chaussures); 

		String nomArticle2 = "sandales"; 
		Categorie sandalesFemme = new Categorie (nomArticle2); 
		
		String sac = "sacsFemme"; 
		Categorie sacsFemme = new Categorie(sac); 
		
		String article = "chaussures";
		Categorie chaussuresFemme = new Categorie(article); 
		
		String sandales = "mules";  
		Categorie mules = new Categorie(sandales); 


		String designation = "chemise"; 
		double prix = 100; 
		Produit chemise100VetementsHomme  = new Produit (designation, prix, vetementsHomme); 
		Produit robe= new Produit(designation, prix, vetementsFemme); 
		
		String designation1 = "chaussures";
		double prix2 = 120; 
		Produit chaussures120escarpinsFemme = new Produit(designation1, prix2, escarpinsFemme); 
		Produit pantalons = new Produit (designation, 90, vetementsFemme);
		
		Produit claquettes = new Produit ("claquettes", 120, sandalesFemme); 
		Produit sacAdos = new Produit("sacsAdos", 50, sacsFemme); 
		Produit mocassins = new Produit ("mocassins", 70, chaussuresFemme); 
		Produit baskets = new Produit ("baskets", 150, chaussuresFemme); 
		Produit ceintures = new Produit ("ceintures", 50, vetementsFemme); 
		Produit gilets = new Produit ("gilets",100,vetementsFemme); 
		Produit portefeuilles = new Produit( "portefeuilles",60,vetementsFemme); 
		Produit ballerinesAtalons = new Produit ("ballerinesAtalons",80,mules);
		Produit foulard = new Produit("foulard", 2, vetementsFemme); 
		
		
		Stock stock = new Stock ();
		stock.ajouterProduit(chemise100VetementsHomme,10);
		stock.ajouterProduit(robe, 10);
		stock.ajouterProduit(chaussures120escarpinsFemme, 100);
		stock.ajouterProduit(sacAdos, 2);
		stock.ajouterProduit(mocassins, 5);
		stock.ajouterProduit(baskets, 3);
		stock.ajouterProduit(ceintures, 5);
		stock.ajouterProduit(pantalons, 5);
		stock.ajouterProduit(gilets, 3);
		stock.ajouterProduit(portefeuilles, 2);
		stock.ajouterProduit(ballerinesAtalons, 10);
		stock.ajouterProduit(foulard, 4);
		stock.ajouterProduit(claquettes, 30);
		
		Panier panier = new Panier(); 
		panier.ajouterProduitEtQuantite (chemise100VetementsHomme, 3);
		panier.ajouterProduitEtQuantite(robe, 4); 
		panier.ajouterProduitEtQuantite(chaussures120escarpinsFemme,10);
		
		Caisse caisse = new Caisse (); 
		caisse.vente(panier);
		
		
		
		



		/*List <Produit> produits = new ArrayList<> (); 
		Panier panier = new Panier(produits); 
		String designation = "chemise"; 
		double prix = 100; 
		String nom = "vetementsHomme";
		Categorie categorie = new Categorie (nom);
		Produit produitAajouter = new Produit (designation, prix, categorie);
		
		panier.ajouterProduit(produitAajouter);
		 */





	}

}
