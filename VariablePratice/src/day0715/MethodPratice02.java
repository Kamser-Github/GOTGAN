package day0715;

import java.util.Scanner;

public class MethodPratice02 {
	
	static int calcMax(int numA,int numB,int numC) {
		
		int max = numA;
		if(max<numB) {
			max = numB;
			}
		if(max<numC) {
			max = numC;
		}
		//���⼭ else�� ���� �ڿ� �ִ� ������ ���ϱ⶧����
		//�ٷ� ��� ���ư��鼭 üũ�Ѵ�.
		return max;
	}

	
	public static void main(String[] args) {
	//����1) ���� 3���� �Է��Ͽ�, �� �߿��� �ִ밪�� �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// �ִ밪�� ���ϴ� �κ��� �޼ҵ�, �ּҰ��� ���ϴ� �κ��� �޼ҵ�� �ۼ��Ͻÿ�.
	// �޼ҵ��: calcMax, calcMin
		
		//1. ���� 3�� �Է��ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���~");
		int numA = sc.nextInt();
		System.out.println("������ �Է����ּ���~");
		int numB = sc.nextInt();
		System.out.println("������ �Է����ּ���~");
		int numC = sc.nextInt();
		
		//2.�ִ밪�� ���Ͻÿ�
		calcMax(numA,numB,numC);
		
		
		sc.close();
	}
	
	//2.�ִ밪 ���ϴ� �żҵ�
	
}
