package kr.co.interface4;

public class Trans implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("���߱������� ���� �ȳ��մϴ�.");
	}
	@Override
	public void InformTime() {
		System.out.println("�ɸ��� �ð��� �� ##�Դϴ�.");
		takeMoney();
	}
	public void takeMoney() {
		System.out.println("�� �̵������ ##�Դϴ�.");
	}
}
