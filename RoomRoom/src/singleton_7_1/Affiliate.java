package singleton_7_1;

public class Affiliate {

//	TheHeadShop paris = new TheHeadShop();

	public static void main(String[] args) {
	
		TheHeadShop sinchon = TheHeadShop.getAddress();
		System.out.println(sinchon.getMike());
		System.out.println(sinchon.getbread());
		System.out.println(sinchon.getWater());
		System.out.println(sinchon.getName());
		

	}
}