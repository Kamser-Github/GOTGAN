package day0714;

import java.util.Scanner;

public class ForPractice8 {

	public static void main(String[] args) {

//		 정올 859 알파벳 정렬
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력해주세요 :  ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = (num1>num2)?num1:num2;
		for(int i=1;i<=9;i++) {
			for(int j=num1;j>=num2;j--) {
				System.out.printf("%2d *%2d = %2d ",j,i,i*j);
			}
			System.out.println();
		}
		
		
		sc.close();

	}
}