package kr.co.interface5;

public class Menu extends Kichin implements Orderable{
	
	private String orderCheckList = "";
	private int money = 0;
	
	public Menu() {
		super();
	}
	@Override
	public void addMenu(String name,int price) {
		Product memo = new Product(price,name);
		menu.add(memo);
	}
	
	@Override
	public void printOrder() {
		for(int i=0 ; i<getOrder() ; i++) {
			orderCheckList += getName(i);
		}
		System.out.println(getOrderName());
	}
	@Override
	public void totalPrice() {
		for(int j=0 ; j<getOrder() ; j++) {
			this.money += getPrice(j);
		}
		System.out.println(getTotalMoney());
	}
	@Override
	public int getWaitingOrder() {
		return getOrder();
	}
	
	//getter
	public String getOrderName() {
		return orderCheckList;
	}
	public int getTotalMoney() {
		return money;
	}
}
