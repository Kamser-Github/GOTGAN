package day0714;

public class ArrayPractice05 {

	public static void main(String[] args) {

		//자바의 정석 5-5
		
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		for(int i=0 ; i<ball3.length ; i++) {
			ball3[i] = ballArr[i];
		}
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}// main end
}// class end
