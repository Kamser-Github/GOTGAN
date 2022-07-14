package day0714;

public class ArrayPractice04 {

	public static void main(String[] args) {

		//자바의 정석 5-4 총합과 평균을 구하세요.
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		//변수 선언
		int total = 0;
		double ave = 0.0;
		
		//총합과 평균 계산하기
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				total += arr[i][j];
			}
		}
		
		for(int[] i : arr) {
			for(int j : i) {
				total += j;
			}
		}
		ave = (double)total/20;
		
		//출력하기
		System.out.printf("총합 : %d\n평균 : %6.2f",total,ave);
		
		
		
	}// main end
}// class end
