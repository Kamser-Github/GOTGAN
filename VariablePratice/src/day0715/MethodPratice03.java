package day0715;

import java.util.Scanner;

public class MethodPratice03 {

	static int calcMax(int[] ran) {
		int max = 0;
		for(int i=1 ; i<ran.length ; i++) {
			max = ran[0];
			if(max<ran[i]) {
				max = ran[i];
			}
		}
	return max;
	}
	
	public static void main(String[] args) {
		
		//�ִ밪,�ּҰ��� ���ϱ�
		//������ �ѵΰ��� �ƴ϶� �迭�� �Է��Ҷ�
		
		//1.���� ���ϴ� ��ŭ �Է��ϱ�
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*30)+10;
		int[] arr = new int[random];
		for(int i=0 ; i<arr.length ; i++) {
			int n = (int)(Math.random()*80)+10;
			arr[i] = n;
		}
		
		//2.�ִ밪 �޼ҵ� �����.
		System.out.println(calcMax(arr));
		
		//3.����غ���
		
		sc.close();
	}

}
