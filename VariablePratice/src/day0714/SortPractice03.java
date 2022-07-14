package day0714;

public class SortPractice03 {
	
	public static void main(String[] args) {
		
		//선택 정렬 연습하기
		
		//1. int[] 배열 길이가 10인 배열 선언
		int[] ten = new int[10];
		
		//2. 배열에 랜덤한 숫자 넣기.
		for(int i=0 ; i<ten.length ; i++) {
			ten[i] = (int)(Math.random()*90)+10;
		}
		//2.5 정렬전 배열 출력
		System.out.println("정렬전 배열");
		
		//3. 배열에 잘 들어갔나 확인
		for(int a : ten) {
			System.out.print(a+" ");
		}
		
		//4.선택정렬로 배열 정렬하기
		for(int i=0; i<ten.length-1 ; i++) {
			//처음부터 끝까지 돌린다면 4번이기에 1을 뺀다.
			for(int j=i+1 ; j<ten.length ; j++) {
				//j=0일대 4번 돌아야하기 때문이다.
				int tmp;
				if(ten[i]>ten[j]) {
					tmp = ten[i];
					ten[i] = ten[j];
					ten[j] = tmp;
				}
			}
		}
		//5.정렬후 출력하기
		System.out.println("\n선택 정렬 후");
		
		//6.배열 출력하기
		for(int a : ten) {
			System.out.print(a+" ");
		}
		
		//잘 정리 되었다.
		
	}//main of end
}//class of end
