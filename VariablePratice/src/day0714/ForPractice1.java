package day0714;

import java.util.Scanner;

public class ForPractice1 {

	public static void main(String[] args) {

		// 마름모 작성하기

		// 변수선언f
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		num = (num % 2 == 0) ? 9 : num;
		int center = num / 2 - 1;
		int starCount = 1;
		int space = center - 1;

		// 계산식
		for (int w = 0; w < num; w++) {

			for (int i = 0; i <= space ; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for (int k = 0; k <= space; k++) {
				System.out.print(" ");
			}
			System.out.println();

			if (w < center) {
				starCount += 2;
				space -= 1;
			} else {
				starCount -= 2;
				space += 1;
			}
		}
		sc.close();
	}
}
