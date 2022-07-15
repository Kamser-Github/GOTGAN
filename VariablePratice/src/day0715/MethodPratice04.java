package day0715;

import java.util.Scanner;

public class MethodPratice04 {
	
	//총점 구하는 매소드 만들기.
	static int calcTot(int[] num) {
		int sum = 0;
		for(int a : num) {
			sum += a;
		}
		return sum;
	}//calcTot end
	
	//평균 점수구하는 매소드 만들기.
	static double calcAve(int sum,int[] num) {
		double avg = 0.0;
		avg = (double)sum/num.length;
		return avg;
	}
	
	//최고점수 구하는 매소드 만들기
	
	static int calcMax(int[] num) {
		int max = num[0];
		for(int i=1 ; i<num.length ; i++) {
			if(max<num[i]) {
				max = num[i];
			}
		}
		return max;
	}
	
	//최저점 구하는 메소드 만들기
	
	static int calcMin(int[] num) {
		int min = num[0];
		for(int i=1 ; i<num.length ;i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		//총점 구하는 매소드 만들기.
		
	
		
	//문제1) 학생수를 입력하여 int형 배열 scores를 생성하고, 
	//총점, 평균, 최고점수, 최저점수를 구하는 프로그램을 작성하시오.
	// 각 학생의 점수를 입력하는 부분을 메소드로 만드시오. 메소드명: inputScore
	// 총점, 평균, 최고점수, 최저점수를 구하는 부분을 각각 메소드로 만드시오.
	// 메소드명: calcTot, calcAve, calcMax, calcMin
		
		//1.학생수 입력후 int형 배열 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수를 입력하세요.");
		int[] scores = new int[sc.nextInt()];
		
		//2.학생수 만큼 성적 넣기.
		for(int i=0 ; i<scores.length ; i++) {
			scores[i] = (int)(Math.random()*90)+10;
		}
		
		
		//3.매서드 사용
		System.out.println(calcTot(scores)); //327
		
		System.out.println(calcAve(calcTot(scores), scores));
		
		System.out.println(calcMax(scores));
		
		System.out.println(calcMin(scores));
		
		
		sc.close();
	}

}
