package test;

import java.util.ArrayList;

public class Mornnig_0707 {

	public static void main(String[] args) {
		
		Buyer kang = new Buyer();
		TV tv = new TV();
		Audio audio = new Audio();
		Computer computer = new Computer();
		
		kang.buyProduct(computer);
		kang.buyProduct(audio);
		kang.buyProduct(tv);
		kang.buyProduct(computer);
		kang.summury();
		kang.buyProduct(tv);
		kang.refundProduct(audio);
		kang.summury();
		
		
	}

}


class Product{
	protected int productPrice;
	int productPoint;
	void product (int productPrice) {
		this.productPrice = productPrice;
		productPoint = (int)(productPrice/10.0);
	}
	Product(){
		productPrice = 0;
		productPoint = 0;
		
	}
}

class TV extends Product{
	TV() {super.product(300);}
	public String toString() { return "TV";}
}

class Audio extends Product{
	Audio() {super.product(130);}
	public String toString() { return "Audio";}
}

class Computer extends Product{
	Computer() {super.product(250);}
	public String toString() { return "Computer";}
}

class Buyer {
	int money = 1000;
	int buyerPoint = 0;
	double saleRatio = 0.05;
	ArrayList<Product> shoppingBag = new ArrayList<Product>();
	
	void buyProduct(Product item){
		if(money < item.productPrice ) {
			System.out.println(item.toString()+"을 구입하실수 없습니다");
			System.out.println("한도 초과 입니다.");
			return; //이 메서드 종료시키기
		}
		money -= item.productPrice;
		buyerPoint += item.productPoint;
		shoppingBag.add(item);
		
		//600원 이상 구매시 5퍼센트 할인을 넣어보고 싶다.
		
		System.out.println(item + "을 구매하셨습니다");
		}
	void refundProduct (Product item) {
		if(shoppingBag.remove(item)) {
			money += item.productPrice;
			buyerPoint -= item.productPoint;
			System.out.println(item+"을 반품하셨습니다");
		} else {
			System.out.println("구매하신 내역이 없습니다.");
		}
	}
	
	void summury() {
		int sum = 0;
		String itemList = "";
		
		if(shoppingBag.isEmpty()) {
			System.out.println("구매하신 물품이 없습니다.");
			return;
			}
		
		//가격과 물품이름을 합치기;
		
		for(Product check : shoppingBag) {
			sum += check.productPrice;
			itemList += check.toString() +" ";
		}
		if(sum >500) {
			
			sum -= sum*this.saleRatio; 
			System.out.println("500만원 초과 구매시 할인혜택 "+saleRatio*100+"%할인을 받았습니다");
		}
		
		System.out.println("총 구매하신 금액은 : "+sum+" 원 입니다.");
		System.out.println("구입하신 제품은 :"+itemList+"입니다");
		
	}
	
}
