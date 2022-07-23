package kr.co.inheritance;

class Product{
	
	private int price;
	private int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
	
}

class TV extends Product{
	
	public TV(int price) {
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	
	public Computer(int price) {
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}


public class ToStringTest {
	
	public static void main(String[] args) {
		
		Product[] product = {
				new TV(200),
				new Computer(150)
		};
		
		for(Product a : product) {
			System.out.println(a.toString());
		}
	}
}
/*
	연습하면서 생각이 든건데
	왜 toString이 사용이 가능한거지 ?
	Product에는 toString이 없는데
	toString은 Product의 매서드가 아니라 최고 조상인
	Object의 매서드이기 때문에
	자손인 tv,computer가 사용이가능하다.


*/