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
	�����ϸ鼭 ������ ��ǵ�
	�� toString�� ����� �����Ѱ��� ?
	Product���� toString�� ���µ�
	toString�� Product�� �ż��尡 �ƴ϶� �ְ� ������
	Object�� �ż����̱� ������
	�ڼ��� tv,computer�� ����̰����ϴ�.


*/