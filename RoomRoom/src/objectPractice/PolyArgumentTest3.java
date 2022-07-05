package objectPractice;

import java.util.*;

class Product {
	int price;
	int bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class TV extends Product{
	TV() {
		super(100);
	}

	public String toString() {
		return "TV";
	}

}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}

}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}

}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Product> bag = new ArrayList<Product>();
	ArrayList<String> bagList = new ArrayList<String>();

	void buy(Product productName) {
		if (money < productName.price) {
			System.out.println("한도 초과 입니다");
			return;
		}
		money -= productName.price;
		bonusPoint += productName.bonusPoint;
		bag.add(productName);
		System.out.println(productName + "을 구매했습니다.");
	}

	void refund(Product productName) {
		if (bag.remove(productName)) {
			money += productName.price;
			bonusPoint -= productName.bonusPoint;
			System.out.println(productName + "을 환불하셨습니다.");
		} else
			System.out.println("구매를 하지 않은 물건입니다.");
	}

	void summary() {
		int sum = 0;

		if (bag.isEmpty()) {
			System.out.println("구입하신 물건이 없습니다.");
			return;
		}

		for (Product item : bag) {
			sum += item.price;
			bagList.add(item.toString());
		}
		System.out.println(sum);
		System.out.println(bagList);
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}

