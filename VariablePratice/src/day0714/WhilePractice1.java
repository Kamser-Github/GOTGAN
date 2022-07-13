package day0714;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		
		
		//831 반복제어문 1 -while
		
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int width = 0;
		int hight = 0;
		char answer =' ';
		
		while(true) {
			System.out.print("삼각형 높이를 입력하세요 :  ");
			width = sc.nextInt();
			System.out.print("삼각형 너비를 입력하세요 :  ");
			hight = sc.nextInt();
			System.out.println(trigangleArea(width,hight));
			
			System.out.print("계속하시겠습니까?? :  ");
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
