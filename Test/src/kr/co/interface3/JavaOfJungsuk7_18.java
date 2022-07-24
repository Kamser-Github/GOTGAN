package kr.co.interface3;

public class JavaOfJungsuk7_18 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
		
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
// Product�迭 cart�� ���� index
	int i = 0;

	void buy(Product p) {

		if (money < p.price)
			return;
		money -= p.price;
		add(p);
	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length * 2];
			System.arraycopy(cart, 0, newCart, 0, cart.length - 1);
			cart = newCart;
		}
		cart[i++] = p;
	} // add(Product p)

	void summary() {

		int total = 0;
		String bag = "";
		for (Product a : cart) {
			if(a == null) break;
			bag += a + ",";
		}
		for (Product a : cart) {
			if(a == null) break;
			total = a.price;
		}
		System.out.println("�ѱݾ��� : " + total);
		System.out.println("���ŷϸ� : " + bag);
	} // summary(){}
}

class Product {
	int price;

	Product(int price) {
//    ��ǰ��   ����
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product implements Productable {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product implements Productable {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

interface Productable {

}