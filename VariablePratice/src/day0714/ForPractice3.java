package day0714;

import java.util.Scanner;

public class ForPractice3 {

	public static void main(String[] args) {

		// ���� 863 �ݺ����
		// �����ϴ� �����ﰢ��
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int center = 0;
		for(int i=0;i<num*2;i++) {
			if(i<num) {
				center =num-i;
			}else {
				center =i-num+1;
			}
			for(int j=0;j<center ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}