package inheritance_0703;


public class VipCustomer_0703 extends Customer_0703 {

	protected int agentID;
	protected double saleRatio;
	
	public VipCustomer_0703(int agentID,int customerID ,String customerName) {
		super(customerID,customerName);
		this.agentID = agentID;
		customerVIP();
	}
	
	public void customerVIP() {
		super.bonusPoint = 10000;
		super.bonusRatio = 0.05;
		this.saleRatio = 0.05;
		super.customerGrade = "VIP";
	}
	
	public void getProductPrice(int productPrice) {
		super.setProductBonusPoint(productPrice);
		productPrice = (int)(productPrice-productPrice*this.saleRatio);
		System.out.println(productPrice);
	}
}
