package day0714;

public class ArrayPractice03 {

	public static void main(String[] args) {

		//자바의 정석 예제 5-3연습문제.
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		 //(1) . 알맞은 코드를 넣어 완성하시오
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("sum=" + sum);

	}// main end
}// class end
