package kr.co.interface4;

public class Walking implements Guiding {
	
	@Override
	public void findLoad() {
		System.out.println("������ �ȴ� ���� �ȳ��մϴ�.");
	}
	@Override
	public void InformTime() {
		System.out.println("�ɸ��� �ð��� �ȳ��մϴ�.");
		notResult();
	}
	public void notResult() {
		System.out.println("30km �̻��� �ȳ��� ���� �ʽ��ϴ�.");
	}
}
