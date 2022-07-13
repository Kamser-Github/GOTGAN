package day3;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		// 숙제 1
		// 정수를 입력받아서 2부터 정수까지 소수 출력,개수,합계를 구하시오

		// 정수입력
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// 변수 선언
		int sum = 0;
		int count = 0;

		// 계산
		for (int i = 2; i <= num; i++) {
			// 2부터 정수 num까지 반복하는 for문
			if (Math.sqrt(i) < 2) {
				System.out.print(i + " ");
				sum += i;
				count++;
			}
			for (int j = 2; j < Math.sqrt(i); j++) {
				if (i % j == 0) {
					break;
				} else if (j == (int)(Math.sqrt(i))) {
					sum += i;
					count++;
					System.out.print(i + " ");
				}
			}
		}
		System.out.printf("2부터 정수 %d까지 \n소수의 합은 %d\n소수의 개수는 %d",num,sum,count);
		sc.close();
	}
}
