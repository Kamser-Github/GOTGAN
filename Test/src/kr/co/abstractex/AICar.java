package kr.co.abstractex;

public class AICar extends Car{
	
	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�");
		System.out.println("�ڵ����� �˾Ƽ� ������ �մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	public void autoStop() {
		System.out.println("�����Ұ�� ������ �մϴ�.");
	}
}
