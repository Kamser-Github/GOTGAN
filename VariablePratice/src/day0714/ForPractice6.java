package day0714;

import java.util.Scanner;

public class ForPractice6 {

	public static void main(String[] args) {

		// ���� 867 ���ĺ� ����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int alp = 65; //���ĺ� ��
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				
				System.out.print((char)alp++);
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}
}