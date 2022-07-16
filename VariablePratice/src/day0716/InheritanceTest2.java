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
		System.out.println("��Ź�� �մϴ�.");
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
		System.out.println("�뵹�̷� ��Ź�մϴ�");
	}
	
	void plus() {
		System.out.println("������ x : " + super.x);
		System.out.println("�ڼ��� x : " + this.x);
		System.out.println(super.x+this.x);
		
	}
	//�뵹��
}

class FrontLoader extends Washer{
	//�巳
	int x = 15;
	
	FrontLoader(){
		super();
	}
	
	void wash(){
		super.wash();
		System.out.println("�巳���� ��Ź�մϴ�.");
	}
}