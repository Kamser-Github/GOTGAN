package day0714;

import java.util.Scanner;

public class ForPractice6 {

	public static void main(String[] args) {

		// 정올 867 알파벳 정렬
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int alp = 65; //알파벳 수
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				
				System.out.print((char)alp++);
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}
}