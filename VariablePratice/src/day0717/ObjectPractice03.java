package day0717;

public class ObjectPractice03 {
	
	public static void main(String[] args) {
		
		ObjectPractice03 test2 = new ObjectPractice03();
		
		System.out.println(test2.productPrice(new TV()));
		
	}
	
	public int productPrice(Product pro) {
		return pro.price;
	}
}

class Product{
	int price;
	Product(int price){
		this.price = price;
	}
}
class TV extends Product{
	
	public TV() {
		super(200);
	}
}

class Audio extends Product{
	
	public Audio() {
		super(50);
	}
}