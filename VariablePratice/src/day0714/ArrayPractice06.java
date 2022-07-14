package day0714;

import java.util.Scanner;

public class ArrayPractice06 {

	public static void main(String[] args) {

		// 자바의 정석 5-6
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		// 내가 지불 한 금액을 입력기능 넣어보았다
		Scanner sc = new Scanner(System.in);
		
		int[] coinUnit = { 500, 100, 50, 10 };
		
		//변수 선언
		System.out.print("동전 교환을 원하시는 금액을 넣어주세요.");
		int money = sc.nextInt();
		System.out.println("money=" + money);
		
		//코인 개수 배열 생성
		int[] coinCount = new int[4];
		
		//코인 개수 저장
		for (int i = 0; i < coinUnit.length; i++) {
			coinCount[i]=money/coinUnit[i];
			money%=coinUnit[i];
		}
		
		//코인 개수 출력
		for(int i=0 ; i<coinCount.length ; i++) {
			System.out.printf("%3d원 :%2d개\n"
					+ "",coinUnit[i],coinCount[i]);
		}
		
		sc.close();
	}// main end
}// class end
