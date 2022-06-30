package cooperationSolo;

public class Person {
	
	String personName;
	int personMoney;
	int personCalorie;
	
	public Person(String personName, int money) {
		this.personName = personName;
		this.personMoney = money;
	}
	
	public void goKimBobHeaven(KimBobHeaven kim) {
		kim.goHeaven(4000, 1300);
		personCalorie +=kim.calorie;
		personMoney -= kim.money;
	}
	
	public void showEat() {
		System.out.println(personMoney);
		System.out.println(personCalorie);
	}
	
}
