package supermarcher;

import org.junit.Assert;
import org.junit.Test;

import supermarcher.pricers.IModelPrice;
import supermarcher.pricers.PerPound;
import supermarcher.pricers.NForM;

public class SupermarketTest {

	@Test
	public void prixmodel_2for3_should_return_price_of_one() {
		IModelPrice p23 = new NForM(2, 3, 9.);
		Produit p1 = new Produit("brice", p23);
		Assert.assertEquals(9, p1.getPrice(1), 0.001);
	}

	@Test
	public void prixmodel_2for3_should_return_price_of_4() {
		IModelPrice p23 = new NForM(2, 3, 9.);
		Produit p1 = new Produit("brice", p23);
		Assert.assertEquals(27, p1.getPrice(4), 0.001);
	}

	@Test
	public void prixmodel_2for3_should_return_price_of_3() {
		IModelPrice p23 = new NForM(2, 3, 9.);
		Produit p1 = new Produit("brice", p23);
		Assert.assertEquals(18, p1.getPrice(3), 0.001);
	}

	@Test
	public void prixModel_perPound() {
		IModelPrice perp = new PerPound(1.6);
		Produit p1 = new Produit("lu", perp);
		Assert.assertEquals(0.4, p1.getPrice(4), 0.001);
	}
}
