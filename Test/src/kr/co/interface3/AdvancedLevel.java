package kr.co.interface3;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("�ӵ��� ���� �޸��ϴ�.");
	}
	@Override
	public void jump() {
		System.out.println("������ ���� ���մϴ�/");
	}
	@Override
	public void turn() {
		System.out.println("�ڵ���� ���� ���մϴ�/");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("�߱��� ����");
	}
	
}
