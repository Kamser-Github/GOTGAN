package day3;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		// ���� 1
		// ������ �Է¹޾Ƽ� 2���� �������� �Ҽ� ���,����,�հ踦 ���Ͻÿ�

		// �����Է�
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		// ���� ����
		int sum = 0;
		int count = 0;

		// ���
		for (int i = 2; i <= num; i++) {
			// 2���� ���� num���� �ݺ��ϴ� for��
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
		System.out.printf("2���� ���� %d���� \n�Ҽ��� ���� %d\n�Ҽ��� ������ %d",num,sum,count);
		sc.close();
	}
}
