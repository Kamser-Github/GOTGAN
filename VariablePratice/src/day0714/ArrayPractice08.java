package day0714;

public class ArrayPractice08 {

	public static void main(String[] args) {

		//빈도수 체크해보기.
		
		//1.배열이 10인 배열 두개 생성한다.
		int[] arr = new int[10];
		int[] arrCount = new int[10];
		
		//2.arr 배열에 중복되기 쉬운 랜덤숫자를 넣는다.
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		
		//3.중복되는 숫자 카운드 해보기.
		for(int i=0 ; i<arr.length ; i++) {
			arrCount[arr[i]]++;
		}
		//arr[i]에 5가 저장되어있으면 count 5번 인덱스에 +1을 한다.
		
		//4.빈도수 체크해보기
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d가 %d개|\n",i,arrCount[i]);
		}
		//가로나 세로로 떨어지는데 안이쁘다.
		//이걸 정사각형 모양으로 출력하고 싶다.
		
		//5.정사각형 모양으로 출력해보기.
		// 순서는 0 3 6 
		//		1 4 7
		//		2 5 8 로 출력하려고 한다.
		
		for(int i=0 ; i<3 ; i++) {
			int num = 0;
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("%d가 %d개|",i,arrCount[num+3*j]);
			}
			System.out.println();
			num++;
		}
		//잘 출력되었다.
		
	}// main end
}// class end
