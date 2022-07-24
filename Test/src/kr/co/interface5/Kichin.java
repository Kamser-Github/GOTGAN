package kr.co.interface5;
import java.util.ArrayList;
public class Kichin {
	
	ArrayList<Product> menu;
	public Kichin() {
		menu = new ArrayList<Product>();
	}
	
	public int getPrice(int num) {
		return menu.get(num).getPrice();
	}
	public String getName(int num) {
		return menu.get(num).getName();
	}
	
	public int getOrder() {
		return menu.size();
	}
	
}
