package kr.co.interface5;

public abstract class TransApp implements Available{
	
	Station[] station = new Station[10];
	Station departure; //�����
	Station destination; //������
	private int price;
	private int times;
	
	public TransApp(int location,String name,int x,int y) {
		station[location] = new Station(name,x,y);
	}
	
	//getter
	public int getPrice() {return price;}
	public int getTimes() {return times;}
	
	//setter
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
//	public void addSubway(int location,String name,int x,int y) {
//		station[location] = new Station(name,x,y);
//	}
	public void choiceSubway(int location1,int location2) {
		departure = station[location1];
		destination = station[location2];
	}
	public int findDistance() {
		int x = (departure.getX()-destination.getX());
		int y = (departure.getY()-destination.getY());
		return (int)Math.sqrt(x*x+y*y);
	}//�Ÿ��� ���ϴ� �żҵ�
	
	public void appearScreen() {
		System.out.printf("��߿� : %s\n������ : %s\n�� �� : %d��\n�ҿ�� : %d",
				departure.getName(),destination.getName(),price,times);
	}
}
