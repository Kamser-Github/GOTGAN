package kr.co.interface6;

public class ExpressBust extends App implements Available {
	
//	
//		//�����, ������ ����
//	public void choiceLocation(int num,int num2) {
//		setDeparture(getStation(num));
//		setDestination(getStation(num2));
//	}
//		//�Ÿ� ����ϱ�
//	public void calcDistance() {
//		int x = getDeparture().getX()-getDestination().getX();
//		int y = getDeparture().getY()-getDestination().getY();
//		int result = (int)(Math.sqrt(x*x+y*y));
//	}
			
		//�Ÿ��� ��� ����ϱ�
	public int calcPrice() {
		return getDistance()*450;
	}
			
		//�Ÿ��� �ð� ����ϱ�
	public int calcTheTime() {
		return getDistance()*20;
	}
			
		//��ü ���� �����ֱ�
	public void showInfo() {}
}
