package day0718;

import java.util.ArrayList;

public class ObjectPractice02 {
	
	public static void main(String[] args) {
		CoffeeShop lee = new CoffeeShop();
		lee.coffeeAddMenu("아아", 2500, 2);
		lee.coffeeAddMenu("뜨아", 2500, 2);
		lee.coffeeAddMenu("라떼", 2500, 2);
		lee.coffeeAddMenu("스무디", 2500, 0);
		
		CustomerA kang = new CustomerA(lee,3);
		System.out.println(kang.money);
		
	}
}

class CoffeeShop {
	
	public static int orderNumber = 0;
	String storeName;
	int storeNumber;
	String storeLocate;
	ArrayList<CoffeeMenu> coffeemenu;
	
	
	CoffeeShop(){
		this("매머드",123456,"강남");
	}
	CoffeeShop(String name,int number,String location){
		
		storeName = name;
		storeNumber = number;
		storeLocate = location;
		orderNumber++;
		coffeemenu = new ArrayList<CoffeeMenu>();
	}
	
	void coffeeAddMenu(String name,int price,int shot) {
		CoffeeMenu coffee = new CoffeeMenu();
		coffee.setCoffeeName(name);
		coffee.setCoffeePrice(price);
		coffee.addShot(shot);
		coffeemenu.add(coffee);
	}
	
	void menuInfo() {
		int total = 0;
		String name = " ";
		for(CoffeeMenu a : coffeemenu) {
			total += a.getCoffeePrice();
			name += a.getCoffeeName();
		}
		System.out.printf("주문하신 내역은 %s\n총 결제금액은 : %5d",name,total);
	}
}

class CoffeeMenu {
	
	private String coffeeName;
	private int coffeePrice;
	private int coffeeShot;
	
	CoffeeMenu(){}
	
	void addShot(int num) {
		coffeeShot = num;
		coffeePrice += num*300;
	}
	
	String getCoffeeName() {
		return coffeeName;
	}
	int getCoffeePrice() {
		return coffeePrice;
	}
	
	int coffeeShot() {
		return coffeeShot;
	}
	
	void setCoffeeName(String name) {
		coffeeName = name;
	}
	
	void setCoffeePrice(int price) {
		coffeePrice = price;
	}
	
}

class CustomerA{
	int money;
	CustomerA(CoffeeShop shop,int num){
		money -= shop.coffeemenu.get(num).getCoffeePrice();
	}
}