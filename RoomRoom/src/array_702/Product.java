package array_702;

public class Product {

	private final int pen = 1000;
	private final int watch = 1200;
	private final int mouse = 1500;
	private final int bag = 4000;
	
	int theNumber;
	int totalPrice;

	public Product () {}

	public int getTheNumber() {
		return theNumber;
	}

	public int setTheNumber(int theNumber) {
		return this.theNumber = theNumber;
	}

	public int getPen() {
		return pen;
	}

	public int getWatch() {
		return watch;
	}

	public int getMouse() {
		return mouse;
	}

	public int getBag() {
		return bag;
	}
	
	public void setTotal(int price) {
		this.totalPrice = price;
	}
	
	public int getTotal() {
		return totalPrice;
	}
	
}
