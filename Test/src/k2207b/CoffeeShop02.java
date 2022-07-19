package k2207b;

public class CoffeeShop02 {
	
	private int price;
	private int bonusPoint;
	
	CoffeeShop02(){}
	CoffeeShop02(int price){
		this.price = price;
		bonusPoint = price/10;
	}
	
	//getter
	public int getPrice() {return price;}
	public int getBonusPoint() {return bonusPoint;}
	
	//setter
	public void setPrice(int price) {this.price = price;}
	
	//toString
	public String toString() {
		return "구입하시는 물품은";
	}
}

class IceCoffee extends CoffeeShop02{
	IceCoffee(){
		super(1500);
	}
	public String toString() {
		return "아이스아메리카노";
	}
}

class MilkShake extends CoffeeShop02{
	MilkShake(){
		super(4000);
	}
	public String toString() {
		return "밀크 쉐이크";
	}
}

class Latte extends CoffeeShop02{
	Latte(){
		super(3400);
	}
	public String toString() {
		return "카페라떼";
	}
}