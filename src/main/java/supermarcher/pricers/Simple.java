package supermarcher.pricers;

public class Simple implements IModelPrice {

	private double prix;

	public Simple(double prix) {
		super();
		this.prix = prix;
	}

	public double price(int qty) {
		return this.prix * qty;
	}

}
