package objectPractice;

import java.util.ArrayList;

public class StoreCenter {
	
	public static void main (String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer lee = new Customer("Lee", 1104);
		Customer kang = new Customer("kang", 1105);
		Customer park = new VipCustomer("park", 1106,11505);
		Customer moon = new Customer("moon", 1107);
		Customer yi = new GoldCustomer("yi", 1108);
		customerList.add(lee);
		customerList.add(kang);
		customerList.add(park);
		customerList.add(moon);
		customerList.add(yi);
		
		lee.buyProductPrice(1250);
		lee.buyProductPrice(1550);
		lee.buyProductPrice(1750);
		
		kang.buyProductPrice(8000);
		kang.buyProductPrice(8500);
		
		park.buyProductPrice(190000);
		
		moon.buyProductPrice(1260);
		
		yi.buyProductPrice(19800);
		
		for(Customer info : customerList) {
			info.customerTotalInfo();
		}
		
	}

}
