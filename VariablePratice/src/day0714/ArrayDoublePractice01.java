package day0714;

import java.util.Scanner;

public class ArrayDoublePractice01 {
	
	public static void main(String[] args) {
		
		/*
		랜덤한 숫자 num을 받아 num*num 배열을 만든다
		그리고 그 배열에 중복이 안되는 숫자를 넣고
		랜덤하게 섞는걸 연습해보기.
		*/
		
		//1.입력받을 Scanner 호출하기
		Scanner sc = new Scanner(System.in);
		
		//2.숫자를 제한한다.
		int num = 0;
		while(true) {
			System.out.printf("%d보다 크고 %d보다 작은수를 입력하세요\n",1,6);
			num = sc.nextInt();
			if(num*num<36) {
				System.out.printf("입력하신 숫자는 %d입니다.\n",num);
				break;
			}
		}
		
		//3.받은 숫자로 배열 만들기
		int[][] arr = new int[num][num];
		
		//4.배열 겹치지 않는 숫자로 초기화;
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = i*num+j+1;
				//1부터 차례대로 입력
			}
		}
		//6.섞기전 배열 출력하기
		for(int[] i : arr) {
			for(int j : i) {
				//그냥 프린트로 하니까 배열이 안이뻐서 printf로 출력하기
				//System.out.print(j+" ");
				System.out.printf("%2d|",j);
			}
			System.out.println();
		}
		
		//6.랜덤한 숫자를 뽑아서 섞기.
		//배열의 인덱스가 0~num-1이기 때문에 랜덤숫자 범위를 정한다.
//		int ramdom1 = (int)(Math.random()*num);
//		int ramdom2 = (int)(Math.random()*num);
		//num = 5 일경우 ramdom은 0~4 사이다.
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				int ramdom1 = (int)(Math.random()*num);
				int ramdom2 = (int)(Math.random()*num);
				int tmp = arr[i][j];
				arr[i][j] = arr[ramdom1][ramdom2];
				arr[ramdom1][ramdom2] = tmp;
			}
		}
		
		//7.섞인 배열 출력해보기
		System.out.println("섞은후 배열입니다.");
		
		for(int[] i : arr) {
			for(int j : i) {
				System.out.printf("%2d|",j);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
