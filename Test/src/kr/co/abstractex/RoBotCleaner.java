package kr.co.abstractex;

public class RoBotCleaner extends Cleaner{
	
	public void fillIn() {
		System.out.println("������ ŵ�ϴ�");
	}
	public void powerLevel() {
		System.out.println("�κ�û�ұⰡ �����մϴ�");
	}
	public void moveWay() {
		System.out.println("�ڵ����� �����Դϴ�.");
	}
	public void rightOrder() {
		System.out.println("�ڵ����� ���ڸ��� ���ư��ϴ�.");
	}
	
	public void autoPlay(int num) {
		switch(num) {
		case 1 :
			System.out.println("�ֿϵ��� ���� �۵��մϴ�");
			System.out.println("�Ŀ��� �ִ������� �մϴ�.");
			break;
		case 2 : 
			System.out.println("��ħ���� �۵��մϴ�");
			System.out.println("�Ŀ��� �ּҷ� �մϴ�.");
			break;
		default :
			System.out.println("���� ���� �۵��մϴ�");
			System.out.println("�Ŀ��� �������� �۵��մϴ�.");
		}
	}
}
