package day0714;

public class ArrayPractice07 {

	public static void main(String[] args) {

		// 국비 연습문제
		// 
		int[][] scores = {
			//	국어 영어 수학
	            {93,93,92},
	            {85,85,86},
	            {71,71,72},
	            {68,68,67},
	            {83,83,82},
							};
		
		//과목 입력
		String[] subject = new String[] {"국어","영어","수학"};
		
		//1.각 학생 총합과 평균 구하기
		
		//학점 배열 만들기
		char[] grade = new char[scores.length];
		
		//학생별 총합 배열
		int[] total = new int[scores.length];
		
		//학생별 평균 배열
		double[] avgs1 = new double[scores.length];
		
		//과목별 총합 배열
		int[] subjectTotal = new int[scores.length];
		
		//과목별 평균 배열
		double[] subjectAvg = new double[scores.length];
		
		//학생별 총합 구하고 저장
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				total[i]+=scores[i][j];
			}
		}
		
		//과목별 총합 저장
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				subjectTotal[j]+=scores[i][j];
			}
		}
		
		//과목별 평균 저장
		for(int i=0 ; i<subjectTotal.length ; i++) {
			subjectAvg[i] = (double)subjectTotal[i]/scores.length;
		}
		
		//학생별 평균 저장
		for(int i=0 ; i<total.length ; i++) {
			avgs1[i] = (double)total[i]/scores[i].length;
		}
		
		//학생별 학점 저장
		for(int i=0 ; i<avgs1.length ; i++) {
			int rate = (int)avgs1[i]/10;
			switch(rate) {
			case 10 : case 9 : 
				grade[i] = 'A';
				break;
			case 8 :
				grade[i] = 'B';
				break;
			case 7 :
				grade[i] = 'C';
				break;
			case 6 :
				grade[i] = 'D';
				break;
			default :
				grade[i] = 'F';
			}
		}
		
		
		//학생 성적 전부 출력하기
		for(int i=0 ; i<scores.length ; i++) {
			//개개인 점수 출력
			System.out.print(i+1+"번 ");
			for(int j=0 ; j<scores[i].length ; j++) {
				System.out.printf("%s: %d |",subject[j],scores[i][j]);
				
			}
			//총합 점수 출력
			System.out.print("총합 :"+total[i]+" |");
			
			//평균 점수 출력
			System.out.printf("평균 : %.1f |",avgs1[i]);
			
			//점수 등급 출력
			System.out.printf("등급 : %c |\n",grade[i]);
			
			//과목별 평균 출력
			if(i+1==scores.length) {
				System.out.print("전체");
				for(int k=0 ; k<scores[k].length ; k++) {
					System.out.printf("%s:%.1f|",subject[k],subjectAvg[k]);
				}
			}
			
			
		}
	
	}// main end
}// class end
