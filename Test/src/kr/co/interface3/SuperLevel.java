package kr.co.interface3;

public class SuperLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("���� ������ �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("õ�忡 ���������� �����մϴ�.");
	}
	@Override
	public void turn() {
		System.out.println("������ ���� �մϴ�.");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("��Ŀ �Դϴ�.");
	}
}
