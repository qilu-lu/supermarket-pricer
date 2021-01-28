package supermarcher.pricers;

public class MultipleTogether implements IModelPrice {

	private double prixTotal;
	private int nombre;

	public MultipleTogether(double prixTotal, int nombre) {
		super();
		this.prixTotal = prixTotal;
		this.nombre = nombre;
	}

	public double price(int qty) {
		double prix = this.prixTotal / nombre * qty;
		return prix;
	}
}