package day0714;

public class ArrayPractice01 {

	public static void main(String[] args) {
	
		//1차원 배열의 활용
		//문제1)85,93,71,63,82의 점수를 저장하는 int형의 1차원 배열 scores를 생성하고
		//총점과 평균을 구하시오
		
		//1.int[] 배열 선언 및 초기화.
		int[] scores = new int[] {85,93,71,63,82};
		//선언과 동시에 초기화를 할때에 new int[]가 생략이 가능
		
		//변수선언
		int total = 0;
		double ave = 0;
		
		//총점 계산
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		
		//평균 계산
		ave = (double)total/scores.length;
		//int끼리 계산이기 때문에 캐스팅으로 실수형변경;
		
		//출력
		System.out.printf("총점 : %5d\n평균 : %.2f",total,ave);
		
		
		
	}//main end
}//class end
