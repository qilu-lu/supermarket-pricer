package supermarcher;

import supermarcher.pricers.IModelPrice;

public class Produit {
	String nom;
	IModelPrice prix;

	public Produit(String nom, IModelPrice prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}

	public double getPrice(int qty) {
		return prix.price(qty);
	}
}
