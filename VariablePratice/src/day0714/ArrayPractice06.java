package day0714;

import java.util.Scanner;

public class ArrayPractice06 {

	public static void main(String[] args) {

		// �ڹ��� ���� 5-6
		// . ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�
		// ���� ���� �� �ݾ��� �Է±�� �־�Ҵ�
		Scanner sc = new Scanner(System.in);
		
		int[] coinUnit = { 500, 100, 50, 10 };
		
		//���� ����
		System.out.print("���� ��ȯ�� ���Ͻô� �ݾ��� �־��ּ���.");
		int money = sc.nextInt();
		System.out.println("money=" + money);
		
		//���� ���� �迭 ����
		int[] coinCount = new int[4];
		
		//���� ���� ����
		for (int i = 0; i < coinUnit.length; i++) {
			coinCount[i]=money/coinUnit[i];
			money%=coinUnit[i];
		}
		
		//���� ���� ���
		for(int i=0 ; i<coinCount.length ; i++) {
			System.out.printf("%3d�� :%2d��\n"
					+ "",coinUnit[i],coinCount[i]);
		}
		
		sc.close();
	}// main end
}// class end
