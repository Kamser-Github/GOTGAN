package kr.co.interface6;

public class MugunghwaLake extends App implements Available  {

	//거리별 요금 계산하기
	public int calcPrice() {
		return getDistance()*1000;
	}
			
		//거리별 시간 계산하기
	public int calcTheTime() {
		return getDistance()*5;
	}
			
		//전체 정보 보여주기
	public void showInfo() {}
}
