package objectPractice;

public class GoldCustomer extends Customer {
	
	protected double saleRatio;

	public GoldCustomer(String customerName, int customerID) {
		super(customerName, customerID);
	}
	public void customerBenefit() {
		this.bonusPoint = 5000;
		this.customerGrade = "골드";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.05;
	}
	public void buyProductPrice(int price) {
		super.buyProductBonusPoint(price);
		this.buyTotal += price*(1-saleRatio);
		System.out.println(price*(1-saleRatio));
	}
	
}
