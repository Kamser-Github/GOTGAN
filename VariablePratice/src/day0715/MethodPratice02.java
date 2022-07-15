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
		//여기서 else를 쓰면 뒤에 있는 문장을 안하기때문에
		//바로 계속 돌아가면서 체크한다.
		return max;
	}

	
	public static void main(String[] args) {
	//문제1) 정수 3개를 입력하여, 그 중에서 최대값과 최소값을 구하는 프로그램을 작성하시오.
	// 최대값을 구하는 부분을 메소드, 최소값을 구하는 부분을 메소드로 작성하시오.
	// 메소드명: calcMax, calcMin
		
		//1. 정수 3개 입력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요~");
		int numA = sc.nextInt();
		System.out.println("정수를 입력해주세요~");
		int numB = sc.nextInt();
		System.out.println("정수를 입력해주세요~");
		int numC = sc.nextInt();
		
		//2.최대값을 구하시오
		calcMax(numA,numB,numC);
		
		
		sc.close();
	}
	
	//2.최대값 구하는 매소드
	
}
