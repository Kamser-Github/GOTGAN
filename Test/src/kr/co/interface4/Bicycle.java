package kr.co.interface4;

public class Bicycle implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("������ ���η� ���� �ȳ��մϴ�.");
	}
	@Override
	public void InformTime() {
		System.out.println("�ɸ��� �ð��� �� ##�Դϴ�.");
		ride();
	}
	public void ride() {
		System.out.println("�̾����̳� �ڵ��� ����� �����մϴ�.");
	}
}
