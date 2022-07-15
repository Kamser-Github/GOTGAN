package day0715;

import java.util.Scanner;

public class MethodPratice01 {
	
	public static void main(String[] args) {
	// 문제1) 정수 1개와 문자 1개를 입력하여, 좌하변이 직각인 직각삼각형을 입력한 문자로 출력하는 프로그램을 작성하시오.
	// 각 행을 출력하는 부분을 메소드로 만들어 사용하시오. 메소드명: putChar

	/*
	- 입력화면
	정수 입력: 5
	문자 입력: @

	- 출력화면
	@
	@@
	@@@
	@@@@
	@@@@@
	*/
		//1.정수 입력,문자입력 장치 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("문자를 입력 : ");
		char ch = sc.next().charAt(0);
		
		//2.각 행을 출력하는 부분이라는 말이 
		//1을 입력하면 1개 2개 입력하면 2개가 나오게 하라는거였다.
		
		//3.입력한 정수만큼 행이 출력되는걸 만들고 메소드 추가하기
		
		for(int i=0 ; i<num ; i++) {
			putChar(i,ch);
			System.out.println();
		}
		
		
		sc.close();
	}
	
	public static void putChar(int n,char ch) {
		for(int i=0 ; i<n+1 ; i++) {
			System.out.print(ch);
		}
	}
	
}
