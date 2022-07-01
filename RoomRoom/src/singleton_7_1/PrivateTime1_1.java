package singleton_7_1;

public class PrivateTime1_1 {

	public static void main(String[] args) {
		
		PrivateTime1 customer = PrivateTime1.gs25();
		customer.setMike(5500);
		System.out.println(customer.getMike());
	}
}
