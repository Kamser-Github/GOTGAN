package day0716;

import java.util.ArrayList;

public class ObjectPractice02 {
	
	public static void main(String[] args) {
		//생각 없이 코드를 짜다보니 어떻게 마무리를 해야할지모르겠다.
		//다시 공부해서 정리해야겠다.
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
		this(4,"네모","하늘색");
	}
	
	Button(int size,String shape,String color){
		this.size = size;
		this.shape = shape;
		this.color = color;
	}
	
	void clickButton(){
		effect = "반짝";
	}
	
}

class MemodAudio{
	String lang;
	char voiceOfGender;
	String voice;
	
	MemodAudio(){
		this("한국어",'여');
	}
	MemodAudio(String lang,char viceOfGender){
		this.lang = lang;
		this.voiceOfGender = viceOfGender;
	}
	
	void cancelAudio(){
		voice = "취소되었습니다.";
		System.out.println(voice);
	}
	
	void payPrice() {
		voice = "결제되었습니다";
		System.out.println(voice);
	}
	
	void drawReceipt() {
		voice = "영수증을 뽑아주세요";
		System.out.println(voice);
	}
	
	void ChoiceMenu() {
		voice = "메뉴를 골라주세요";
		System.out.println(voice);
	}
	
	void ChoiceMenu(String name) {
		voice = ""+name+"을 선택하셨습니다.";
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

