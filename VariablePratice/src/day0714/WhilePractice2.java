package day0714;

import java.util.Scanner;

public class WhilePractice2 {

	public static void main(String[] args) {

		// ForPractice1 - while문으로 바꾸기
		
		
		//변수선언
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = (num % 2 == 0) ? 9 : num;
		int center = num/2;
		int starCount =1;
		int space = center-1;
		int w=0,i,j;
		//계산식
		while(w<num) {
			i=0;
			j=0;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			while(j<starCount) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			if (w < center) {
				starCount += 2;
				space -= 1;
			} else {
				starCount -= 2;
				space += 1;
			}
			w++;
		}
		
		
		sc.close();
	}

}
