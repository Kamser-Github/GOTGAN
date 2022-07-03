package array_702;

public class DaisoTest {
	
	public static void main(String[] args) {
		
		Daiso customerKang = new Daiso("논현점");
		customerKang.getBagPrice(1);
		customerKang.getWatchPrice(2);
		customerKang.getPenPrice(4);
		customerKang.getMousePrice(1);
		
		customerKang.showTotalPrice();
	}
}
