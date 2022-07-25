package day1;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product[] products = {
				new Product("피카츄",5,15000),
				new Product("파이리", 3, 12500),
				new Product("꼬부기", 4, 10500),
				new Product("라이언", 6, 12000),
				new Product("어피치", 7, 15500),
		};
		for(Product a : products) {
			System.out.println(a);
		}
	}
}
