package day1;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product[] products = {
				new Product("��ī��",5,15000),
				new Product("���̸�", 3, 12500),
				new Product("���α�", 4, 10500),
				new Product("���̾�", 6, 12000),
				new Product("����ġ", 7, 15500),
		};
		for(Product a : products) {
			System.out.println(a);
		}
	}
}
