package day2;

import java.util.Scanner;

public class Jungol814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*1~12 사이의 정수를 입력 받아 평년의 경우 
		 입력 받은 월의 날 수를 출력하는 프로그램을 작성하시오.​ 
		 */
		System.out.println("월 입력시 날 일이 나옵니다");
		int month = sc.nextInt();
		int day=0;
		switch(month){
		case 1:case 3 : case 5 : 
		case 8 : case 7 :
		case 10 : case 11 :
			day = 31;
			break;
		case 2 :
			day = 28;
			break;
		default : 
			day = 30;
		}
		
		System.out.printf("%d월의 날 수는 %d일 입니다",month,day);
		
		sc.close();
	}
}
