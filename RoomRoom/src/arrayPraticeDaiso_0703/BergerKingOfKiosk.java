package arrayPraticeDaiso_0703;

public class BergerKingOfKiosk {
	
	public static void main(String[] args) {
		CustomerBuyBerger kang = new CustomerBuyBerger("kang", 1105);
		kang.setCustomerChoiceBerger("띠드버거", 4500, 2);
		kang.setCustomerChoiceBerger("와퍼", 4300, 1);
		kang.setCustomerChoiceBerger("프렌치후라이", 1500, 3);
		kang.setCustomerChoiceBerger("몬스터X", 8600, 4);
		
		kang.showTotalPrice();
		
	}
	
}

