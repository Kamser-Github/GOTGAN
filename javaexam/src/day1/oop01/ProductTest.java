package day1.oop01;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product[] product = new Product[5];
		product[0] = new Product();
		product[1] = new Product("��ī��",52,1500);
		product[2] = new Product("���ϻ�",54,1500);
		product[3] = new Product("�򷯽���",52,1500);
		product[4] = new Product("���ӻ�",51,1500);
		
		for(Product a : product) {
			System.out.printf("%s %d %,3d",a.getName(),a.getBalance(),a.getPrice());
		}
	}
}
