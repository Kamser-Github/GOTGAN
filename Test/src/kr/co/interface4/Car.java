package kr.co.interface4;

public class Car implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("�ڵ��� �������� ���� �ȳ��մϴ�.");
	}
	@Override
	public void InformTime() {
		System.out.println("�ɸ��� �ð��� �� ##�Դϴ�.");
		consumedOil();
	}
	public void consumedOil() {
		System.out.println("�� �Ҹ� �⸧���� ##�Դϴ�.");
	}
	
}
