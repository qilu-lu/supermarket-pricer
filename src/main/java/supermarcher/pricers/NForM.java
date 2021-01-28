package supermarcher.pricers;

public class NForM implements IModelPrice {
    private int nomN;
	private int nomDemande;
	
	private double perPrix;

	public NForM(int nomN,int nomDemande, double perPrix) {
		super();
		this.nomN=nomN;
		this.nomDemande = nomDemande;
		
		this.perPrix = perPrix;
	}

	public double price(int qty) {
		if (qty < nomDemande) {
			return perPrix * qty;
		} else if (qty % nomDemande == 0) {
			return qty / nomDemande * (nomN*perPrix);
		} else {
			return qty / nomDemande * (nomN*perPrix) + qty % nomDemande * perPrix;
		}

	}

}
