package day0719a;

import java.util.Scanner;

public class GitTest {

	
	public static void main(String[] args) {
		
		//스캐너로 번호를 받아 버블정렬해보자
		
		Scanner sc = new Scanner(System.in);
		
		//입력한 번호를 담을 배열을 선언하기
		int[] bubble = new int[10];
		
		
		//배열에 숫자넣기
		for(int i=0 ; i<10 ; i++) {
			System.out.printf("남은 숫자 : %d ",10-i);
			bubble[i] = sc.nextInt();
		}
		
		//잘 들어갔는지 확인하기
		for(int a : bubble) {
			System.out.print(+a+" ");
		}
		
		//정렬하기
		
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
		//정렬후 출력
		
		for(int i : bubble) {
			System.out.print(i+" ");
		}
		   
		
	}//main of end
}//class of end
