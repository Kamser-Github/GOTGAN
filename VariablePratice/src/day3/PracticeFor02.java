package day3;

import java.util.Scanner;

public class PracticeFor02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();
//		��������� ������ �ﰢ���� ���弼��
		
		//1.i�� j�� 0���� ���
		for(int i=0;i<num ;i++) {
			for(int j=0;j<num-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2.i�� j�� num���� ���
		for(int i=num; i>0;i--) {
			for(int j=num;j>num-i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3.i�� num,j��0���� �����Ҷ�
		for(int i=num;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//4.i�� 0 j�� num���� ����
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5.�Ǵٸ� ���.
		for(int i=0;i<num;i++) {
			for(int j=0;j+i<num;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//6.������ ��ĭ�� ä������
		for(int i=0;i<num;i++) {
			for(int j=0;j+i<num;j++) {
				System.out.print("*");
			}
			for(int k=0;k<i;k++) {
				System.out.print("0");
			}
			System.out.println();
		}
		sc.close();

	}
}
