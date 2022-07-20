package kr.co.abstractex;

public abstract class Computer {
	
	public Computer() {}
	public abstract void display();
	public abstract void typing();
	//�����ΰ� ���°� �߻�޼����� �Ѵ�.
	public void turnOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void doPlay() {
		turnOn();
		display();
		typing();
		turnOff();
	}
}


