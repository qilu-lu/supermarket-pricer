package supermarcher.pricers;

public class PerPound implements IModelPrice {

	private double prix;

	public PerPound(double prix) {
		super();
		this.prix = prix;
	}

	public double price(int qty) {
		return prix / 16 * qty;
	}

}
