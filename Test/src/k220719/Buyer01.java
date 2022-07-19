package k220719;


import java.util.ArrayList;

public class Buyer01 {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Product01> lg = new ArrayList<Product01>();
	
	void buy(Product01 p) {
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getbonusPoint();
		lg.add(p);
		System.out.println(p+"제품을 구매하셨습니다.");
	}
	
	void refund(Product01 p) {
		if(lg.remove(p)) {
			money += p.getPrice();
			bonusPoint -= p.getbonusPoint();
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("구매하신 내력이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String LgList = "";
		
		if(lg.isEmpty()) {
			System.out.println("구매하신 내역이 없습니다");
			return;
		}
		
		for(Product01 a : lg) {
			Product01 p = (Product01)a;
			sum += p.getPrice();
			LgList += p+",";
		}
		
		System.out.println("구입하신 금액은"+sum);
		System.out.println("구매내역서 : "+LgList);
	}
}
