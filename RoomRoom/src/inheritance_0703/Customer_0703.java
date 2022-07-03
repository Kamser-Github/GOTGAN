package inheritance_0703;

public class Customer_0703 {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	protected int priceTota = 0;
	
	public Customer_0703(int customerID,String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;	
		CustomerSilber();
		
	}
	
	public void CustomerSilber() {
		this.customerGrade = "실버";
		this.bonusRatio = 0.01;
		this.bonusPoint = 1000;
	}
	
	public int setProductPrice(int productPrice) {
		setProductBonusPoint(productPrice);
		return productPrice;
	}
	
	public void setProductBonusPoint(int productPrice) {
		this.bonusPoint += (productPrice*this.bonusRatio);
	}
	
	public void setCustomerInfo() {
		System.out.println("고객님의 번호는 : "+getCustomerID()+"입니다.\n"
							+getCustomerName()+"고객님의 남은 포인트는 \n"
						    +getBonusPoint()+"입니다");
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public int setBonusPoint(int bonusPoint) {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	public void getProductPrice(int productPrice) {
		setProductBonusPoint(productPrice);
		
		System.out.println(productPrice);
	}
	
	public void getTotal() {
		
	}
}
