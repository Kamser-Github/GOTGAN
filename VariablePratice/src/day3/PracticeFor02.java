package day3;

import java.util.Scanner;

public class PracticeFor02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
//		좌측상단이 직각인 삼각형을 만드세요
		
		//1.i와 j를 0으로 출발
		for(int i=0;i<num ;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2.i와 j를 num으로 출발
		for(int i=num; i>0;i--) {
			for(int j=num;j>num-i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3.i는 num,j는0으로 시작할때
		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//4.i는 0 j는 num으로 시작
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5.또다른 방법.
		for(int i=0;i<num;i++) {
			for(int j=0;j+i<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//6.나머지 빈칸을 채워보자
		for(int i=0;i<num;i++) {
			for(int j=0;j+i<num;j++) {
				System.out.print("*");
			}
			for(int k=0;k<i;k++) {
				System.out.print("0");
			}
			System.out.println();
		}
		sc.close();

	}
}
