package singleton_7_1;

public class TheHeadShop {
	
	final String name = "paris";
	final int mike = 1500;
	final int bread = 2500;
	final int water = 600;
	
	private TheHeadShop() {}
	private static TheHeadShop paris = new TheHeadShop();
	
	public static void main(String[] args) {

	}
	
	public static TheHeadShop getAddress() {
		return paris;
	}
	
//	public int getMike() {
//		return mike;
//	}
//	public int getbread() {
//		return bread;
//	}
//	public int getWater() {
//		return mike;
//	}
//	public String getName() {
//		return name;
//	}

	public int getMike() {
		return mike;
	}
	public int getbread() {
		return bread;
	}
	public int getWater() {
		return mike;
	}
	public String getName() {
		return name;
	}
	
//	public int setMike(int num) {
//		this.mike = num;
//	} final을 쓰면 set으로 수정이 안된다;
}
