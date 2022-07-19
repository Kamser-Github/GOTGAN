package k220719;

public class Counter01 {
	public static void main(String[] args) {
		Buyer01 lee = new Buyer01();
		lee.buy(new TV());
		lee.buy(new Com());
		lee.buy(new Audio());
		lee.buy(new TV());
		
		lee.summary();
	}
}
