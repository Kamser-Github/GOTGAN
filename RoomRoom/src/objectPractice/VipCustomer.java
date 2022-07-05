package objectPractice;

public class VipCustomer extends Customer {
	
	protected int agentID;
	protected double saleRatio;

	public VipCustomer(String customerName, int customerID,int agentID) {
		super(customerName, customerID);
		this.agentID = agentID;
	}
	
	public void customerBenefit() {
		this.bonusPoint = 10000;
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	
	public void buyProductPrice(int price) {
		super.buyProductBonusPoint(price);
		this.buyTotal += price*(1-saleRatio);
		System.out.println(price*(1-saleRatio));
	}
	
}
