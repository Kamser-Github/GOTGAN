package cooperationSolo;

public class Customer {
	
	public static void main(String[] args) {
		
		Person personKang = new Person("kang",15000);
		KimBobHeaven kimbob = new KimBobHeaven("kimbob");
		personKang.goKimBobHeaven(kimbob);
		personKang.showEat();
		
		
	}

}
