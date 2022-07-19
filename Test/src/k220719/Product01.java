package k220719;

public class Product01 {
	
	private int price;
	private int bonusPoint;
	
	Product01(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product01(){
		price = 0;
		bonusPoint = 0;
	}
	
	public int getPrice() {
		return this.price;
	}
	public int getbonusPoint() {
		return this.bonusPoint;
	}
}

class TV extends Product01{
	TV(){super(200);}
	public String toString() {return "TV";}
}

class Com extends Product01{
	Com(){super(150);}
	public String toString() {return "com";}
}

class Audio extends Product01{
	Audio(){super(50);}
	public String toString() {return "audio";}
}

