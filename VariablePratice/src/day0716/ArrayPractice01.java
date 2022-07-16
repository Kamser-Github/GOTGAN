package day0716;

public class ArrayPractice01 {
	public static void main(String[] args) {
		
		//기억 복습
		
		//1.배열 선언 방법
		int[] num = new int[5];
		num[0] = 5;
		//배열이 기본형 변수일때는 값을 넣을수 있으나
		int[][] num2 = new int[5][4];
		// num2[3] = {1,2,3,4};
		// 이건 오류가 난다
		// num2[0~4]는 참조형 변수이기 때문에
		// 새로 배열을 만들고 초기화를 한다음
		// 주소값을 저장해야하는데 그 과정이 없다
		// 따라서 참조를 해야하는 참조변수같은 경우에
		// 바로 선언하는 방법,그리고 new 생성자로 대입해야한다.
		
		num2[3] = new int[] {1,2,4,5};
		
		//배열의 장점 
		//순서,같은 타입의 데이터라 관리가 쉬움
		//순서 = > 반복문으로 처리하기가 좋다.
		
		
		//1.배열 활용 - 총합과 평균
		int[] score = new int[10];
		
		//1. 랜덤하게 숫자 넣어서 총합과 평균을 구하는 연습
		
		for(int i=0 ; i<score.length ; i++) {
			score[i] = (int)(Math.random()*10)+1;
			//1~10까지 랜덤하게 숫자를 넣었다.
		}
		
		//총합구하기
		int sum = 0 ;
		for(int a : score) {
			sum += a;
		}
		System.out.println(sum); //53
		int sum2 = 0;
		for(int i=0 ; i<score.length ; i++) {
			sum2 += score[i];
		}
		System.out.println(sum2); //53
		
		//평균 구하기
		double ave2 = (double)sum/score.length;
		
		//이차원에서 구해보기.
		int[][] scores = {
				 // 국어, 영어, 수학, 총점	
					{93, 93, 92}, // 0번 학생
					{85, 85, 86}, // 1번 학생
					{71, 71, 72}, // 2번 학생
					{68, 68, 67}, // 3번 학생
					{83, 83, 82}  // 4번 학생
			};
		
		//평균은 소수점이지만 배열 연습을 위해서 소수점을 버림.
		//총점 평균 순위  , 과목별 평균과목별 총점 순위 
		
		int[][] totalScores = new int[6][5];
		// 학생별 총점, 평균 , 순위, 등급 이렇게 5명
		// 마지막에는 과목별 총점,평균,?,평균 등급 이렇게 해서 6,4
		
		//1.학생별 총점 계산하기
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length; j++) {
				totalScores[i][0]+=scores[i][j];
				System.out.print(scores[i][j]+" ");
			}
			System.out.print(totalScores[i][0]);
			System.out.println();
		}
		
		//2.학생별 평균 계산하기
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=1 ; j<2 ; j++) {
				totalScores[i][1]=totalScores[i][0]/scores[i].length;
			}
			System.out.print(totalScores[i][1]+" ");
		}
		System.out.println();
		
		//3.학생 순위 정하기
		//학생 이름이 없어서 번호를 지정
		for(int i=0 ; i<scores.length ; i++) {
			totalScores[i][4]=i+1;
			System.out.print(totalScores[i][4]+" ");
		}//1 2 3 4 5 
		System.out.println();
		
		//sort
		for(int i=0 ; i<scores.length-1 ; i++) {
			for(int j=0 ; j<scores.length-1-i ; j++) {
				int tmp;
				if(totalScores[j][0]<totalScores[j+1][0]) {
					tmp = totalScores[j][4];
					totalScores[j][4] = totalScores[j+1][4];
					totalScores[j+1][4] = tmp;
				}
			}
		}
		//순위 뽑아보기
		for(int i=0 ;i<scores.length ;i++) {
			System.out.print(totalScores[i][4]+" ");
		}
		
	}//main end
}//class end
