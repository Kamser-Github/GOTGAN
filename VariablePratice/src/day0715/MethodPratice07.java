package day0715;

import java.util.Scanner;

public class MethodPratice07 {
	public static int numPower(int x,int y) {
		int total=1;
		for(int i=0 ; i<y ; i++) {
			 total*=x;
		}
		return total;
	}
	
	public static void main(String[] args) {
		/*
		10 ������ �� ���� m�� n�� �Է� �޾Ƽ� m�� n��ŭ �ŵ������Ͽ� ���� ��(mn)�� �����ϴ� �Լ���
		�ۼ��Ͽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (�ŵ����� ������ m**n�� �����ϸ� ���ϳ�,
		�����е��� ������ ���� �ŵ����� �����ڸ� ������� �ʰ� �ۼ��Ͻÿ�)
		*/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�");
		int num = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�");
		int num2 = sc.nextInt();
		
		System.out.println(numPower(num,num2));
		
		sc.close();
	}
}
