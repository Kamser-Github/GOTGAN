package array_7_1;

public class Daiso1 {
	
	private String name;
	private int price;
	
	public Daiso1() {}
	public Daiso1(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showProduct() {
		System.out.println(name+","+price);
	}
	
	
	
}
