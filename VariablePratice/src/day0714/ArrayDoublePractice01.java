package day0714;

import java.util.Scanner;

public class ArrayDoublePractice01 {
	
	public static void main(String[] args) {
		
		/*
		������ ���� num�� �޾� num*num �迭�� �����
		�׸��� �� �迭�� �ߺ��� �ȵǴ� ���ڸ� �ְ�
		�����ϰ� ���°� �����غ���.
		*/
		
		//1.�Է¹��� Scanner ȣ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		//2.���ڸ� �����Ѵ�.
		int num = 0;
		while(true) {
			System.out.printf("%d���� ũ�� %d���� �������� �Է��ϼ���\n",1,6);
			num = sc.nextInt();
			if(num*num<36) {
				System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.\n",num);
				break;
			}
		}
		
		//3.���� ���ڷ� �迭 �����
		int[][] arr = new int[num][num];
		
		//4.�迭 ��ġ�� �ʴ� ���ڷ� �ʱ�ȭ;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = i*num+j+1;
				//1���� ���ʴ�� �Է�
			}
		}
		//6.������ �迭 ����ϱ�
		for(int[] i : arr) {
			for(int j : i) {
				//�׳� ����Ʈ�� �ϴϱ� �迭�� ���̻��� printf�� ����ϱ�
				//System.out.print(j+" ");
				System.out.printf("%2d|",j);
			}
			System.out.println();
		}
		
		//6.������ ���ڸ� �̾Ƽ� ����.
		//�迭�� �ε����� 0~num-1�̱� ������ �������� ������ ���Ѵ�.
//		int ramdom1 = (int)(Math.random()*num);
//		int ramdom2 = (int)(Math.random()*num);
		//num = 5 �ϰ�� ramdom�� 0~4 ���̴�.
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				int ramdom1 = (int)(Math.random()*num);
				int ramdom2 = (int)(Math.random()*num);
				int tmp = arr[i][j];
				arr[i][j] = arr[ramdom1][ramdom2];
				arr[ramdom1][ramdom2] = tmp;
			}
		}
		
		//7.���� �迭 ����غ���
		System.out.println("������ �迭�Դϴ�.");
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.printf("%2d|",j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
