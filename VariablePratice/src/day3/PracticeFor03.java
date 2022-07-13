package day3;

import java.util.Scanner;

public class PracticeFor03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();

		//우측 상단 직각인 삼각형
		
		//1.i=0 & j=0;
		for(int i=0;i<num;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("0");
			}
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2.i=num & j=num;
		for(int i=num; i>0;i--) {
			for(int k=num;k>i;k--) {
				System.out.print("0");
			}
			for(int j=num;j>num-i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3.i=0 & j=num;
		for(int i=0;i<num;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("0");
			}
			for(int j=num;j-i>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//4. i=num & j=0;
		for(int i=num;i>0;i--) {
			for(int k=num;k>i;k--) {
				System.out.print("0");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}
}
