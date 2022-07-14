package day0714;

import java.util.Scanner;

public class ArrayPractice02 {

	public static void main(String[] args) {

		// 문제 2)A반의 학생수를 입력하여 입력한 학생수 만큼의 scores배열을 생성하고.
		// 각 학생의 점수도 입력하여 ,각 학생의 점수를 출력하고,A반의 총점과 평균을 계산하세요.

		// 1.학생수 입력과 동시에 배열 선언 그리고 변수 선언.
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double ave = 0.0;

		System.out.print("A반 학생의 수 입력 : ");
		int[] scores = new int[sc.nextInt()];

		// 각 학생의 점수를 입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "번 학생의 점수 :");
			scores[i] = sc.nextInt();
		}

		// 총점구하기
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}

		// 평균구하기
		ave = (double) total / scores.length;

		// 각 학생의 점수를 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%2d번 점수 %3d\n", i + 1, scores[i]);
		}
		
		// 총점과 평균 출려기
		
		System.out.printf("학생 총점 :%4d\n학생 평균 :%6.1f",total,ave);

		sc.close();
	}// main end
}// class end
