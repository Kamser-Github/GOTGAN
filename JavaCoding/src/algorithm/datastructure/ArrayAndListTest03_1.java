package algorithm.datastructure;

import java.util.Scanner;

public class ArrayAndListTest03_1 {
	
	public static void main(String[] args) {
		
		/*
		 Q1)N개의 숫자가 공백없이 써있다.이 숫자를 모두 합해 출력하는 프로그램을 만드시오
		 첫번째 줄에는 숫자의 개수 1<= N <=100;
		 두번째 줄에는 숫자 N개가 공백없이 주어진다.
		 
		 long타입도 19자리를 넘어가면 계산이 불가능하다.
		 이 숫자를 담는 방법은 문자형 밖에 없고,
		 문자형을 다시 char으로 배열로 나누어서
		 ch값을 정수형으로 다시 변환하면된다;
		 
		 3.슈도코드 작성해보기
		 N값 입력을 받고
		 N을 문자형으로 바꾸고
		 문자형을 char배열로 변환하고
		 char배열을 하나씩 꺼내서
		 정수형으로 바꾸면서
		 sum이라는 정수타입 변수에 담아
		 리턴을 한다. 
		 -------위에 처럼 하는게 아니다----
		 N값 입력받기
		 길이 N의 숫자를 입력받아 String형 변수 sNum에 저장
		 sNum을 다시 char[]형 변수 cNum에 변환해서 저장
		 int형 변수 sum선언
		 for(cNum.길이만큼 반복){
		 각 자릿값을 정수형으로 변환후 sum에 누적저장
		 }
		 sum출력
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자의 개수를 입력:");
		int num = sc.nextInt();
		System.out.print("숫자 n을 입력 :");
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i=0; i<cNum.length ; i++) {
			sum += cNum[i]-48;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
