package day0714;

import java.util.Scanner;

public class ArrayPractice02 {

	public static void main(String[] args) {

		// ���� 2)A���� �л����� �Է��Ͽ� �Է��� �л��� ��ŭ�� scores�迭�� �����ϰ�.
		// �� �л��� ������ �Է��Ͽ� ,�� �л��� ������ ����ϰ�,A���� ������ ����� ����ϼ���.

		// 1.�л��� �Է°� ���ÿ� �迭 ���� �׸��� ���� ����.
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double ave = 0.0;

		System.out.print("A�� �л��� �� �Է� : ");
		int[] scores = new int[sc.nextInt()];

		// �� �л��� ������ �Է�
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "�� �л��� ���� :");
			scores[i] = sc.nextInt();
		}

		// �������ϱ�
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}

		// ��ձ��ϱ�
		ave = (double) total / scores.length;

		// �� �л��� ������ ���
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%2d�� ���� %3d\n", i + 1, scores[i]);
		}
		
		// ������ ��� �����
		
		System.out.printf("�л� ���� :%4d\n�л� ��� :%6.1f",total,ave);

		sc.close();
	}// main end
}// class end
