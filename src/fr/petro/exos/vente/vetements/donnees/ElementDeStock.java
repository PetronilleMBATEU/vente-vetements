package fr.petro.exos.vente.vetements.donnees;

public class ElementDeStock {

	private Produit produit; // on aurait pu déclarer aussi string code du produit
	private Integer quantite;

	public ElementDeStock(Produit produit, Integer quantite) {

		this.produit = produit;
		this.quantite = quantite;
	}

	public Produit getProduit() {
		return produit;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "ElementDeStock [produit=" + produit + ", quantite=" + quantite + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result + ((quantite == null) ? 0 : quantite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementDeStock other = (ElementDeStock) obj;
		if (produit == null) {
			if (other.produit != null)
				return false;
		} else if (!produit.equals(other.produit))
			return false;
		if (quantite == null) {
			if (other.quantite != null)
				return false;
		} else if (!quantite.equals(other.quantite))
			return false;
		return true;
	}

}