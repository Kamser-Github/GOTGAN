package kr.co.interface6;

public class Subway extends App implements Available  {
	
	//�Ÿ��� ��� ����ϱ�
	public int calcPrice() {
		return getDistance()*250;
	}
			
		//�Ÿ��� �ð� ����ϱ�
	public int calcTheTime() {
		return getDistance()*40;
	}
			
		//��ü ���� �����ֱ�
	public void showInfo() {}
}
