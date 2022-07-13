package day0714;

import java.util.Scanner;

public class ForPractice2 {

	public static void main(String[] args) {

		// 정올 863 반복제어문
		// 좌측하단 직각삼각형
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}