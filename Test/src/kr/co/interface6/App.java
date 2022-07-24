package kr.co.interface6;

public abstract class  App implements Available{

	private static final Station[] station = new Station[10];
	
	private int i = 0;
	private Station departure;
	private Station destination;
	private int distance;
	private int num1;
	private int num2;
	
	public App() {}
	//���� �߰��ϱ�
	public void setRegion(String region,int x,int y) {
		if(i>9) {
			System.out.println("���̻� �߰��Ҽ������ϴ�.");
			return;
		}
		station[i++] = new Station(region,x,y);
	}
	
	public Station getStation(int i) {
		return station[i];
	}
	//getter
	public Station getDeparture() {
		return departure;
	}
	public Station getDestination() {
		return destination;
	}
	public int getDistance() {
		return distance;
	}
	//setter
	public void setDeparture(Station departure) {
		this.departure = departure;
	}
	public void setDestination(Station destination) {
		this.destination = destination;
	}
		//������ ���ϱ�
	public void choiceLocation(int num,int num2) {
		departure = getStation(num);
		destination = getStation(num2);
	}
		//�Ÿ� ����ϱ�
	public void calcDistance() {
		int x = departure.getX()-destination.getX();
		int y = departure.getY()-destination.getY();
		distance = (int)(Math.sqrt(x*x+y*y));
	}
	//�Ÿ��� ��� ����ϱ�
	public abstract int calcPrice();
		//�Ÿ��� �ð� ����ϱ�
	public abstract int calcTheTime();
		//��ü ���� �����ֱ�
	public abstract void showInfo();
}

