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
	//지역 추가하기
	public void setRegion(String region,int x,int y) {
		if(i>9) {
			System.out.println("더이상 추가할수없습니다.");
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
		//목적지 정하기
	public void choiceLocation(int num,int num2) {
		departure = getStation(num);
		destination = getStation(num2);
	}
		//거리 계산하기
	public void calcDistance() {
		int x = departure.getX()-destination.getX();
		int y = departure.getY()-destination.getY();
		distance = (int)(Math.sqrt(x*x+y*y));
	}
	//거리별 요금 계산하기
	public abstract int calcPrice();
		//거리별 시간 계산하기
	public abstract int calcTheTime();
		//전체 정보 보여주기
	public abstract void showInfo();
}

