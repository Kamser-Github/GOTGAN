package day0714;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		
		
		//831 �ݺ���� 1 -while
		
		Scanner sc = new Scanner(System.in);
		//���� ����
		int width = 0;
		int hight = 0;
		char answer =' ';
		
		while(true) {
			System.out.print("�ﰢ�� ���̸� �Է��ϼ��� :  ");
			width = sc.nextInt();
			System.out.print("�ﰢ�� �ʺ� �Է��ϼ��� :  ");
			hight = sc.nextInt();
			System.out.println(trigangleArea(width,hight));
			
			System.out.print("����Ͻðڽ��ϱ�?? :  ");
			answer = sc.next().charAt(0);
			if(answer!='Y'&&answer!='y'){
				break;
			}
		}
		
		
		
		
		sc.close();
	}

	private static double trigangleArea(int width, int hight) {
		return (double)Math.round((double)width*hight/2*10)/10;
	}
}
