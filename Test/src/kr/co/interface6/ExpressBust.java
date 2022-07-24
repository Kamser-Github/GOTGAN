package kr.co.interface6;

public class ExpressBust extends App implements Available {
	
//	
//		//출발지, 도착지 고르기
//	public void choiceLocation(int num,int num2) {
//		setDeparture(getStation(num));
//		setDestination(getStation(num2));
//	}
//		//거리 계산하기
//	public void calcDistance() {
//		int x = getDeparture().getX()-getDestination().getX();
//		int y = getDeparture().getY()-getDestination().getY();
//		int result = (int)(Math.sqrt(x*x+y*y));
//	}
			
		//거리별 요금 계산하기
	public int calcPrice() {
		return getDistance()*450;
	}
			
		//거리별 시간 계산하기
	public int calcTheTime() {
		return getDistance()*20;
	}
			
		//전체 정보 보여주기
	public void showInfo() {}
}
