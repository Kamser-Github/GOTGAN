package kr.co.abstractex;

public class ManualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("����� ������ �մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("�극��ũ�� �����մϴ�.");
	}
	
	public void changeGear() {
		System.out.println("�ӵ� ��ȯ�� ���� �� �ٲߴϴ�.");
	}
}
