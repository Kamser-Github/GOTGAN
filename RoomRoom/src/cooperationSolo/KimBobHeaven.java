package cooperationSolo;

public class KimBobHeaven {
	
	String menu;
	int price;
	int money;
	int calorie;
	int accumulateCustomer;
	
	public KimBobHeaven(String menu) {
		this.menu = menu;
	}
	
	public void goHeaven(int price,int calorie) {
		
		this.price = price;
		this.calorie = calorie;
		this.money += price;
		this.accumulateCustomer++;
	}

}
