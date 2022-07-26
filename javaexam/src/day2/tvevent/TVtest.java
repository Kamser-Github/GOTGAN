package day2.tvevent;

public class TVtest {
	public static void main(String[] args) {
		SaleTV sale = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rent = new RentalTV(100000,"RENTALTV-10",42,1);
		sale.channelUp();
		sale.channelUp();
		rent.channelUp();
		rent.channelUp();
		rent.channelUp();
		printAllTV(sale);
		printAllTV(rent);
		printRentalTV(rent);
		
	}
	
	public static void printAllTV(TV tv) {
		System.out.println(tv);
		
		if(tv instanceof SaleTV) {
			((SaleTV) tv).play();
			((SaleTV) tv).sale();
		}else if(tv instanceof RentalTV) {
			((RentalTV) tv).play();
		}
	}
	public static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
