package kr.co.interface6;

public interface Available {
	
	int SEOUL = 0;
	int DEAGU = 1;
	int BUSAN = 2;
	
	//출발지, 도착지 고르기
	void choiceLocation(int num1,int num2);
	//거리 계산하기
	void calcDistance();
	//거리별 요금 계산하기
	int calcPrice();
	//거리별 시간 계산하기
	int calcTheTime();
	//전체 정보 보여주기
	void showInfo();
	
}
