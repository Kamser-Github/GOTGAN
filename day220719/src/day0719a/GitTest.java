package day0719a;

import java.util.Scanner;

public class GitTest {

	
	public static void main(String[] args) {
		
		//��ĳ�ʷ� ��ȣ�� �޾� ���������غ���
		
		Scanner sc = new Scanner(System.in);
		
		//�Է��� ��ȣ�� ���� �迭�� �����ϱ�
		int[] bubble = new int[10];
		
		
		//�迭�� ���ڳֱ�
		for(int i=0 ; i<10 ; i++) {
			System.out.printf("���� ���� : %d ",10-i);
			bubble[i] = sc.nextInt();
		}
		
		//�� ������ Ȯ���ϱ�
		for(int a : bubble) {
			System.out.print(+a+" ");
		}
		
		//�����ϱ�
		
		sc.close();
		for(int i=0 ; i<bubble.length-1 ; i++) {
			boolean flag = false;
			for(int j=0 ; j<bubble.length-i-1 ; j++) {
				if(bubble[j]>bubble[j+1]) {
					int tmp = bubble[j];
					bubble[j] = bubble[j+1];
					bubble[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		System.out.println();
		//������ ���
		
		for(int i : bubble) {
			System.out.print(i+" ");
		}
		   
		
	}//main of end
}//class of end
