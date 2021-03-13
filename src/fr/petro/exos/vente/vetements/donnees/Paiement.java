package fr.petro.exos.vente.vetements.donnees;

public class Paiement {
	
	private double prixTotal;
	private double difference; 	
	private ModeDePaiement modeDePaiement; // why not string, est ce pq c'est une constante le Mode de paiement? 
	
	public Paiement(double prixTotal, double difference, ModeDePaiement modeDePaiement) {
		super();
		this.prixTotal = prixTotal;
		this.difference = difference;
		this.modeDePaiement = modeDePaiement;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public double getDifference() {
		return difference;
	}

	public void setDifference(double difference) {
		this.difference = difference;
	}

	public ModeDePaiement getModeDePaiement() {
		return modeDePaiement;
	}

	public void setModeDePaiement(ModeDePaiement modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}

	@Override
	public String toString() {
		return "Paiement [prixTotal=" + prixTotal + ", difference=" + difference + ", modeDePaiement=" + modeDePaiement
				+ "]";
	}
	
	

}
