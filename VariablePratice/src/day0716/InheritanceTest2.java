package day0716;

public class InheritanceTest2 {
	public static void main(String[] args) {
		
		TopLoader lg = new TopLoader();
		System.out.println(lg.x);
		Washer lg2 = new TopLoader();
		lg2.wash();
	}
}

class Washer{
	int x = 20;
	int limitWeght;
	int price;
	int height;
	String moter;
	String pad;
	
	Washer(){
		this(11, 350000, 150);
	}
	
	Washer(int limitWeght,int price,int height){
		this.limitWeght = limitWeght;
		this.price = price;
		this.height = height;
	}
	
	void wash() {
		System.out.println("세탁을 합니다.");
	}
	
	
}

class TopLoader extends Washer{
	
	int x = 10;
	
	TopLoader(){
		this(15, 250000, 130);
	}
	
	TopLoader(int limitWeght,int price,int height){
		super(limitWeght, price, height);
		moter = "Auto";
		pad = "pushButton";
	}
	
	void wash() {
		super.wash();
		System.out.println("통돌이로 세탁합니다");
	}
	
	void plus() {
		System.out.println("조상의 x : " + super.x);
		System.out.println("자손의 x : " + this.x);
		System.out.println(super.x+this.x);
		
	}
	//통돌이
}

class FrontLoader extends Washer{
	//드럼
	int x = 15;
	
	FrontLoader(){
		super();
	}
	
	void wash(){
		super.wash();
		System.out.println("드럼으로 세탁합니다.");
	}
}