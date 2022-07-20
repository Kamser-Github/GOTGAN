package k220719;

//추상 클래스란
//미완성된 클래스로.
//애매하게 완성된 설계도로
//상속으로 자기에게 맞는 오버라이딩을 하거나
//또 다른 추상클래스가 되서 다른 타입이 되거나
//상속과는 반대가 되는 개념이다.

public abstract class Animal01 {
	
	private int size;
	private String name;
	private int price;
	
	public Animal01(int size,String name,int price) {
		this.size = size;
		this.name = name;
		this.price = price;
	}
	
	abstract public void bark();
	abstract public void character();
	abstract public int lifeSpan();
	
	//getter
	public int getPrice() {return price;}
	public String getName() {return name;}
	
	//setter
	public void setPrice(int price) {this.price=price;}
	
}
