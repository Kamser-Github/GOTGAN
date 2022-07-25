package day1.oop01;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product[] product = new Product[5];
		product[0] = new Product();
		product[1] = new Product("ÇÇÄ«Ãò»§",52,1500);
		product[2] = new Product("´ÜÆÏ»§",54,1500);
		product[3] = new Product("Ãò·¯½º»§",52,1500);
		product[4] = new Product("ºü¾Ó»§",51,1500);
		
		for(Product a : product) {
			System.out.printf("%s %d %,3d",a.getName(),a.getBalance(),a.getPrice());
		}
	}
}
