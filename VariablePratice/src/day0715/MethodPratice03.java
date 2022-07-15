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
		
		//최대값,최소값을 구하기
		//정수가 한두개가 아니라 배열로 입력할때
		
		//1.정수 원하는 만큼 입력하기
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random()*30)+10;
		int[] arr = new int[random];
		for(int i=0 ; i<arr.length ; i++) {
			int n = (int)(Math.random()*80)+10;
			arr[i] = n;
		}
		
		//2.최대값 메소드 만들기.
		System.out.println(calcMax(arr));
		
		//3.출력해보기
		
		sc.close();
	}

}
