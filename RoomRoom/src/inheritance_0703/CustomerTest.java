package inheritance_0703;



public class CustomerTest {
	
	public static void main (String[] args) {
	
		Customer_0703 lee = new VipCustomer_0703(1101, 99, "Lee");
		
		lee.setCustomerInfo();
		lee.getProductPrice(5500);
		lee.getProductPrice(5500);
		lee.getProductPrice(5500);
		lee.getProductPrice(5500);
		lee.getProductPrice(5500);
		lee.setCustomerInfo();
		
		
	}
}
