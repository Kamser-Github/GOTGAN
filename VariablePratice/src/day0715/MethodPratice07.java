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
		10 이하의 두 정수 m과 n을 입력 받아서 m을 n만큼 거듭제곱하여 나온 값(mn)을 리턴하는 함수를
		작성하여 다음과 같이 출력하는 프로그램을 작성하시오. (거듭제곱 연산자 m**n을 리턴하면 편하나,
		여러분들의 연습을 위해 거듭제곱 연산자를 사용하지 않고 작성하시오)
		*/ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가수를 입력하시오");
		int num = sc.nextInt();
		System.out.print("지수를 입력하시오");
		int num2 = sc.nextInt();
		
		System.out.println(numPower(num,num2));
		
		sc.close();
	}
}
