package array_702;

import java.util.ArrayList;

public class Daiso {

	String daisoStoreName;
	ArrayList<Product> productList;
	Product product;
	
	public Daiso(String daisoStoreName) {
		this.daisoStoreName = daisoStoreName;
		productList = new ArrayList<Product>();
	}
	
	public void getPenPrice(int theNumber) {
		product = new Product();
		product.setTheNumber(theNumber);
		product.setTotal(product.setTheNumber(theNumber)*product.getPen());
		productList.add(product);
		
	}
	
	public void getWatchPrice(int theNumber) {
		product = new Product();
		product.setTheNumber(theNumber);
		product.setTotal(product.setTheNumber(theNumber)*product.getWatch());
		productList.add(product);
		
	}
	
	public void getBagPrice(int theNumber) {
		product = new Product();
		product.setTheNumber(theNumber);
		product.setTotal(product.setTheNumber(theNumber)*product.getBag());
		productList.add(product);
		
	}
	
	public void getMousePrice(int theNumber) {
		product = new Product();
		product.setTheNumber(theNumber);
		product.setTotal(product.setTheNumber(theNumber)*product.getMouse());
		productList.add(product);
		
	}
	
	
	public void showTotalPrice() {
		int total = 0;
		for(Product s : productList) {
			total += s.getTotal();
		}
		System.out.println(total);
	}
}
