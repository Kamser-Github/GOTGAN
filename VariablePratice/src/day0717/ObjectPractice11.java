package day0717;

import java.util.ArrayList;

public class ObjectPractice11 {
	
	public static void main(String[] args) {
		MamosCoffee kang = new MamosCoffee();
		kang.addMenu("���̽� �Ƹ޸�ī��", 1700, 'L');
		kang.addMenu("�� �Ƹ޸�ī��", 2000, 'X');
		kang.addMenu("��ũ����ũ", 4000, 'L');
		kang.addMenu("�ڸ����̵�", 3300, 'M');
		
		kang.showTotal();
	}

}

class MamosCoffee{
	String location;
	String number;
	String order;
	int money;
	ArrayList<WeCoffee> menuList;
	
	MamosCoffee(){
		location = "������";
		number = "02-787-1234";
		menuList = new ArrayList<WeCoffee>();
	}
	void addMenu(String menu,int price,char size){
		WeCoffee we = new WeCoffee();
		we.setMenu(menu);
		we.setPirce(price);
		we.setSize(size);
		we.setBonustPoint();
		menuList.add(we);
	}
	public void showTotal() {
		int total = 0;
		String order = " ";
		int bonus = 0;
		for(WeCoffee a : menuList) {
			total += a.getPrice();
			order += a.getMenu()+" ";
			bonus += a.getBonus();
		}
		System.out.printf("�� �����ݾ��� : %6d\n�ֹ��Ͻ� �޴� ������ : %s\n�� �����ݾ��� : %d"
				,total,order,bonus);
	}
	
}

class WeCoffee{
	private String menu;
	private int price;
	private double bonusPoint;
	private char size;
	
	WeCoffee(){}
	
	void setMenu(String menu) {
		this.menu = menu;
	}
	void setPirce(int price) {
		this.price = price;
	}
	void setBonustPoint() {
		this.bonusPoint = price*0.03;
	}
	void setSize(char size) {
		switch(size) {
		case 'M' : 
			price-=300;
			size = 'M';
			break;
		case 'L' : 
			size = 'L';
			break;
		case 'X':
			price+=300;
			size = 'X';
			break;
		}
	}
	
	int getPrice() {
		return price;
	}
	String getMenu() {
		return menu;
	}
	char getSize() {
		return size;
	}
	int getBonus() {
		return (int)bonusPoint;
	}
}
