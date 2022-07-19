package k220719;


import java.util.ArrayList;

public class Buyer01 {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList<Product01> lg = new ArrayList<Product01>();
	
	void buy(Product01 p) {
		if(money < p.getPrice()) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getbonusPoint();
		lg.add(p);
		System.out.println(p+"��ǰ�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product01 p) {
		if(lg.remove(p)) {
			money += p.getPrice();
			bonusPoint -= p.getbonusPoint();
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�����Ͻ� ������ �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0;
		String LgList = "";
		
		if(lg.isEmpty()) {
			System.out.println("�����Ͻ� ������ �����ϴ�");
			return;
		}
		
		for(Product01 a : lg) {
			Product01 p = (Product01)a;
			sum += p.getPrice();
			LgList += p+",";
		}
		
		System.out.println("�����Ͻ� �ݾ���"+sum);
		System.out.println("���ų����� : "+LgList);
	}
}
