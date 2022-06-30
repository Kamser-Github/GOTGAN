package date_6_30_person;

public class DaisoPrice {
	
	String productName;
	int price;
	int floor;
	char productLocation;
	
	public DaisoPrice(String productName) {
		this.productName = productName ;
	}
	public String getProductName() {
		return productName;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public char getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(char productLocation) {
		this.productLocation = productLocation;
	}
	
	
}
