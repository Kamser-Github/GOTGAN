package day0715;

import java.util.Scanner;

public class MethodPratice01 {
	
	public static void main(String[] args) {
	// ����1) ���� 1���� ���� 1���� �Է��Ͽ�, ���Ϻ��� ������ �����ﰢ���� �Է��� ���ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// �� ���� ����ϴ� �κ��� �޼ҵ�� ����� ����Ͻÿ�. �޼ҵ��: putChar

	/*
	- �Է�ȭ��
	���� �Է�: 5
	���� �Է�: @

	- ���ȭ��
	@
	@@
	@@@
	@@@@
	@@@@@
	*/
		//1.���� �Է�,�����Է� ��ġ �����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է� : ");
		int num = sc.nextInt();
		
		System.out.println("���ڸ� �Է� : ");
		char ch = sc.next().charAt(0);
		
		//2.�� ���� ����ϴ� �κ��̶�� ���� 
		//1�� �Է��ϸ� 1�� 2�� �Է��ϸ� 2���� ������ �϶�°ſ���.
		
		//3.�Է��� ������ŭ ���� ��µǴ°� ����� �޼ҵ� �߰��ϱ�
		
		for(int i=0 ; i<num ; i++) {
			putChar(i,ch);
			System.out.println();
		}
		
		
		sc.close();
	}
	
	public static void putChar(int n,char ch) {
		for(int i=0 ; i<n+1 ; i++) {
			System.out.print(ch);
		}
	}
	
}
