package kr.co.interface6;

public class MugunghwaLake extends App implements Available  {

	//�Ÿ��� ��� ����ϱ�
	public int calcPrice() {
		return getDistance()*1000;
	}
			
		//�Ÿ��� �ð� ����ϱ�
	public int calcTheTime() {
		return getDistance()*5;
	}
			
		//��ü ���� �����ֱ�
	public void showInfo() {}
}
