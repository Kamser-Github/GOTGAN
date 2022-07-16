package day0716;

import java.util.ArrayList;

public class ObjectPractice02 {
	
	public static void main(String[] args) {
		//���� ���� �ڵ带 ¥�ٺ��� ��� �������� �ؾ������𸣰ڴ�.
		//�ٽ� �����ؼ� �����ؾ߰ڴ�.
		Monitor kiosk = new Monitor();
		kiosk.addMenu();
	}
}

class Monitor{
	int inch;
	
	Button button = new Button();
	MemodAudio audio = new MemodAudio();
	ArrayList<Menu> menuList = new ArrayList<Menu>();
	
	Monitor(){}
	
	void startDisplay() {
		audio.ChoiceMenu();
	}
	
	void choiceMenu(Menu item) {
		audio.ChoiceMenu(item.menu);
		button.clickButton();
	}
	
	void cancelMenu() {
		audio.cancelAudio();
		button.clickButton();
	}
	
	void addMenu() {
		Menu iceCoffe = new Menu("iceCoffe",2400);
		Menu hotCoffe = new Menu("hotCoffe",2000);
		Menu milkShake = new Menu("milkShake",4000);
		Menu chocoMilkShake = new Menu("chocoMilkShake",2400);
		Menu lemonTea = new Menu("lemonTea",3000);
		menuList.add(iceCoffe);
		menuList.add(hotCoffe);
		menuList.add(milkShake);
		menuList.add(chocoMilkShake);
		menuList.add(lemonTea);
	}
}

//class Kiosk{
//	
//}

class Button{
	int size;
	String shape;
	String color;
	String effect;
	
	Button(){
		this(4,"�׸�","�ϴû�");
	}
	
	Button(int size,String shape,String color){
		this.size = size;
		this.shape = shape;
		this.color = color;
	}
	
	void clickButton(){
		effect = "��¦";
	}
	
}

class MemodAudio{
	String lang;
	char voiceOfGender;
	String voice;
	
	MemodAudio(){
		this("�ѱ���",'��');
	}
	MemodAudio(String lang,char viceOfGender){
		this.lang = lang;
		this.voiceOfGender = viceOfGender;
	}
	
	void cancelAudio(){
		voice = "��ҵǾ����ϴ�.";
		System.out.println(voice);
	}
	
	void payPrice() {
		voice = "�����Ǿ����ϴ�";
		System.out.println(voice);
	}
	
	void drawReceipt() {
		voice = "�������� �̾��ּ���";
		System.out.println(voice);
	}
	
	void ChoiceMenu() {
		voice = "�޴��� ����ּ���";
		System.out.println(voice);
	}
	
	void ChoiceMenu(String name) {
		voice = ""+name+"�� �����ϼ̽��ϴ�.";
		System.out.println(voice);
	}
	
}

class Menu{
	String menu;
	int price;
	
	Menu(){}
	Menu(String menu,int price){
		this.menu = menu;
		this.price = price;
	}
	
}

