package kr.co.interface5;

public class Product {
	
	private int price;
	private String name;
	
	public Product(int price,String name){
		this.price = price;
		this.name = name;
	}
	//getter
	public int getPrice() {return price;}
	public String getName() {return name;}
	
	//toString
	public String toString() {
		return "\n가격 :"+price+"\n메뉴 : "+name;
	}
}
