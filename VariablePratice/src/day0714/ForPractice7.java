package day0714;

import java.util.Scanner;

public class ForPractice7 {

	public static void main(String[] args) {

		// 정올 869 알파벳 정렬
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int alp = 65;
		int number = 1;
		for(int i=0;i<num;i++) {
			for(int k=0;k<num-i;k++) {
				System.out.printf("%2d",number++);
			}
			for(int j=0;j<i+1;j++) {
				System.out.printf("%2c",(char)alp++);
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}