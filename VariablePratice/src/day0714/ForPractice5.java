package day0714;

import java.util.Scanner;

public class ForPractice5 {

	public static void main(String[] args) {

		// 정올 866 반복제어문
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 뒤집어진 삼각형모양으로 출력

		for(int i=0;i<num;i++) {
			
			for(int k=0; k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(num-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}