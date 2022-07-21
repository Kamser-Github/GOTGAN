package kr.co.abstractex;

public abstract class Cleaner {
	
	//전원 키는 방법
	public  abstract void fillIn();
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	//흡입력 조절
	public abstract void powerLevel();
	//움직이는 방법
	public abstract void moveWay();
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public abstract void rightOrder();
	
	final public void doClean() {
		fillIn();
		powerOn();
		powerLevel();
		moveWay();
		powerOff();
		rightOrder();
	}
}
