package objectPractice;

public class Customer {

	protected String customerName;
	protected int customerID;
	protected int bonusPoint;
	protected double bonusRatio;
	protected String customerGrade;
	protected int buyTotal;

	public Customer(String customerName, int customerID) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerBenefit();
	}

	public void customerBenefit() {
		this.bonusPoint = 1000;
		this.customerGrade = "실버";
		this.bonusRatio = 0.01;
	}

	public void buyProductBonusPoint(int price) {
		this.bonusPoint += price * this.bonusRatio;
	}

	public void buyProductPrice(int price) {
		buyProductBonusPoint(price);
		this.buyTotal += price;
		System.out.println(price);
	}

	public void customerTotalInfo() {
		System.out.println("총 결제 금액은 : " + buyTotal + "입니다."+"\n"+"현재 누적 포인트는 : " + bonusPoint +"입니다.");
	}

}
