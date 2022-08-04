package algorithm.datastructure;

import java.util.Scanner;
public class BeakJoon2018 {
	
	public static void main(String[] args) {
		
		//연속된 자연수의 합 구하기
		/*
		슈도코드 작성하기
		변수 N저장
		startIndex = 1;
		endIndex =1;
		sum = 1;
		count = 1;
		while(endIndex!=N){
		if(sum==N){
		count 증가
		endIndex 한칸이동
		sum값 변경
		}else if(sum > N){
		sum 값 변경
		start인덱스 증가
		else {
		endIndex 한칸이동
		sum값 변경
		*/
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int startIndex=1;
		int endIndex=1;
		int sum=1;
		int count=1;
		while(endIndex!=N) {
			if(sum==N) {
				count++;
				endIndex++;
				sum+=endIndex;
			} else if (sum > N) {
				sum-=startIndex;
				startIndex++;
			} else {
				endIndex++;
				sum+=endIndex;
			}
		}
		System.out.println(count);
		
	}
}
