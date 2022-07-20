package kr.co.abstractex;

public abstract class Computer {
	
	public Computer() {}
	public abstract void display();
	public abstract void typing();
	//구현부가 없는걸 추상메서드라고 한다.
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void doPlay() {
		turnOn();
		display();
		typing();
		turnOff();
	}
}


