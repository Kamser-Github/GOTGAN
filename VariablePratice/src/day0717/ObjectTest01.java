package day0717;

public class ObjectTest01 {
	
	public static void main(String[] args) {
		
		
		Bean bean = new Bean();
		Coffee coffee = new Coffee();
		Customer lee = new Customer(6000);
		coffee.menu = "iceCoffee";
		coffee.price = 2500;
		lee.buyMenu(bean, coffee);
		System.out.println(bean.order);
		System.out.println(bean.money);
		System.out.println(lee.money);
	}

	
}

class Bean{
	String order ="";
	int money;
}

class Coffee{
	String menu;
	int price;
	
}

class Customer{
	int money;
	
	Customer(int money){
		this.money = money;
	}
	
	void buyMenu(Bean bean,Coffee coffee) {
		bean.order += coffee.menu;
		money -= coffee.price;
		bean.money += coffee.price;
	}
}
