package test01;

import kr.co.interface5.*;

public class MenuTest01 {

	public static void main(String[] args) {
		
		Menu momo = new Menu();
		momo.addMenu("Ŀ��", 2500);
		momo.addMenu("���̵�", 4500);
		momo.addMenu("��ũ����ũ", 4000);
		momo.addMenu("��ī��", 2000);
		momo.totalPrice();
		momo.printOrder();
		
		
	}
	
}
