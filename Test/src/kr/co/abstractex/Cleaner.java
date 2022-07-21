package kr.co.abstractex;

public abstract class Cleaner {
	
	//���� Ű�� ���
	public  abstract void fillIn();
	public void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	//���Է� ����
	public abstract void powerLevel();
	//�����̴� ���
	public abstract void moveWay();
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
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
