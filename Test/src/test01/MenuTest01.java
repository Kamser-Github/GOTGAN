package test01;

import kr.co.interface5.*;

public class MenuTest01 {

	public static void main(String[] args) {
		
		Menu momo = new Menu();
		momo.addMenu("커피", 2500);
		momo.addMenu("에이드", 4500);
		momo.addMenu("밀크쉐이크", 4000);
		momo.addMenu("마카롱", 2000);
		momo.totalPrice();
		momo.printOrder();
		
		
	}
	
}
