package arrayPraticeDaiso_0703;

import java.util.ArrayList;

public class CustomerBuyBerger {

	protected String CustomerName;
	protected int CustomerMemberID;
	
	ArrayList<BergerkingOfMenu> bergerkingMenuList;
	
	public CustomerBuyBerger(String CustomerName,int CustomerMemberID) {
		this.CustomerName = CustomerName;
		this.CustomerMemberID = CustomerMemberID;
		
		bergerkingMenuList = new ArrayList<BergerkingOfMenu>();
		
	}

	public void setCustomerChoiceBerger(String bergerName,int bergerPrice,int bergerOfPacking) {
		BergerkingOfMenu bergerkingOfMenu = new BergerkingOfMenu();
		bergerkingOfMenu.setBergerName(bergerName);
		bergerkingOfMenu.setBergerPrice(bergerPrice);
		bergerkingOfMenu.setBergerOfPacking(bergerOfPacking);
		bergerkingMenuList.add(bergerkingOfMenu);
	}
	
	public void showTotalPrice() {
		int total = 0;
		for(BergerkingOfMenu choice : bergerkingMenuList) {
			total += (choice.getBergerOfPacking()*choice.bergerPrice);
			System.out.println(choice.getBergerName()+"을"+choice.bergerOfPacking+"개 고르셨습니다"
					+"가격은 :"+ (choice.getBergerOfPacking()*choice.bergerPrice) + "입니다");
					}
		System.out.println(total);
	}
}
