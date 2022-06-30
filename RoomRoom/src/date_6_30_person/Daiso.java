package date_6_30_person;

public class Daiso {

	String daisoLocation;
	
	DaisoPrice pen;
	DaisoPrice cup;
	DaisoPrice watch;
	
	public Daiso() {
		pen = new DaisoPrice("pen");
		cup = new DaisoPrice("cup");
		watch = new DaisoPrice("watch");
		
	}
	
	public Daiso(String location) {
		daisoLocation = location;
		pen = new DaisoPrice("pen");
		cup = new DaisoPrice("cup");
		watch = new DaisoPrice("watch");
	}
	
	public void setPen(int price,int floor,char productLocation) {
		pen.floor = floor;
		pen.price = price;
		pen.productLocation = productLocation;
	}
	public void setCup(int price,int floor,char productLocation) {
		cup.floor = floor;
		cup.price = price;
		cup.productLocation = productLocation;
	}
	public void setWatch(int price,int floor,char productLocation) {
		watch.floor = floor;
		watch.price = price;
		watch.productLocation = productLocation;
	}
	
	public String getDaisoLocation() {
		return daisoLocation ;
	}
	
	
	public void setDaisoLocation(String daisoLocation) {
		this.daisoLocation = daisoLocation;
	}
	
	public void showInfo(){
		String total = getDaisoLocation();
		String product = pen.getProductName()+","+cup.getProductName()+","+watch.getProductName();
		System.out.println(total);
		System.out.println(product);
	}
	
}
