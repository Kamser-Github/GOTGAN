package day0717;

import java.util.ArrayList;

public class ReferanceTest01 {
	
	public static void main(String[] args) {
		Father kang = new Father("kang",40);
		kang.setLand("강남", 5000, 400);
		kang.setLand("대구", 3500, 300);
		kang.setLand("부산", 4000, 200);
		kang.setLand("마산", 1500, 150);
		kang.getLand();
		
		System.out.println("-----------");
		//부모의 생성자는 못가져온다는걸 느꼇다.
		//아직 유산이 아닌가보다.
		Son kang2 = new Son();
		kang2.getLand();
		
	}
}

class Father{
	String name;
	int age;
	ArrayList<Property> myLand;
	
	Father(String name,int age){
		this.name = name;
		this.age = age;
		myLand = new ArrayList<Property>();
	}
	void setLand(String name,int landOfPrice,int extent) {
		Property property = new Property();
		property.setExtent(extent);
		property.setlandOfPrice(landOfPrice);
		property.setName(name);
		myLand.add(property);
	}
	
	void getLand() {
		int totalMoney = 0;
		for(Property a : myLand) {
			System.out.println(a.getName());
			System.out.println(a.getExtent());
			System.out.println(a.getlandOfPrice());
			totalMoney+=a.getlandOfPrice();
		}
		System.out.println(totalMoney);
	}
}

class Property{
	
	private String name;
	private int landOfPrice;
	private int extent;
	
	Property(){}
	
	void setName(String name) {
		this.name = name;
	}
	void setlandOfPrice(int landOfPrice) {
		this.landOfPrice = landOfPrice;
	}
	void setExtent(int extent) {
		this.extent = extent;
	}
	
	String getName() {
		return name;
	}
	int getlandOfPrice() {
		return landOfPrice;
	}
	int getExtent() {
		return extent;
	}
}

class Son extends Father{
	Son(){
		super("kang2",15);
	}
}

