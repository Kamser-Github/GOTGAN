package day3;

import java.util.Scanner;

public class PracticeFor01 {

	public static void main(String[] args) {

		// For 중첩사용연습
		// 좌하단 직각 삼각형 연습
		//1. n=0 & j=0
		System.out.print("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//i=num & j=num;
		for(int i=num;i>0;i--) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//i=num & j=0;
		for(int i=num;i>0;i--) {
			for(int j=0;j+i<=num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//i=0 & j=num;
		for(int i=0;i<num;i++) {
			for(int j=num;j+i>=num;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//또 다른 방법.
		for(int i=0;i<num;i++) {
			for(int j=0; j<= i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//빈칸을 " "로 채워보자
		for(int i=0;i<num;i++) {
			for(int j=0; j<= i ;j++) {
				System.out.print("*");
			}
			for(int k=0;k+i<num-1;k++) {
				System.out.print("0");
			}
			System.out.println();
		}
		
		sc.close();

	}
}
