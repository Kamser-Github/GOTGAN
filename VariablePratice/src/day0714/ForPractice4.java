package day0714;

import java.util.Scanner;

public class ForPractice4 {

	public static void main(String[] args) {

		//���� 865 �ݺ����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//������� �����ﰢ��
		
		for(int i=0;i<num;i++) {
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}