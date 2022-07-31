package algorithm.datastructure;

import java.util.Scanner;

public class BeakJoon1546 {
	
	public static void main(String[] args) {
		/*
		세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 
		일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 
		그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 
		수학점수는 50/70*100이 되어 71.43점이 된다.
		세준이의 성적을 위의 방법대로 새로 계산했을 때, 
		새로운 평균을 구하는 프로그램을 작성하시오.
		//첫번째 입력 , 과목의 개수
		//두번째 입력 , 성적들
		*슈도코드 작성해보기
		int num으로 과목의 개수를 받기
		int[] 형으로 배열 만들기
		총합을 담을 int형 변수 sum
		최고점을 담을 int형 변수 tmp
		for(A[] 길이만큼 반복){
		A[I] 값을 저장
		}
		for(A[] 길이만큼 반복){
		총합과 최고점 구하기
		}
		sout : sum*100/num/tmp;
		*/
		
		Scanner sc = new Scanner(System.in);
		final byte NUM = sc.nextByte();
		int[] scores = new int[NUM];
		long sum = 0;
		long tmp = 0;
		for(int i=0; i<NUM ; i++) {
			scores[i] = sc.nextInt();
		}
		for(int i=0; i<NUM ; i++) {
			if(tmp<scores[i])
				tmp=scores[i];
			sum += scores[i];
		}
		System.out.println((double)sum*100/NUM/tmp);
		sc.close();
	}
}
