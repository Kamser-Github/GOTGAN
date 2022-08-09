package algorithm.datastructure;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.IOException;
public class BeakJoon10986 {

	public static void main(String[] args) throws IOException {

		/*
		 슈도코드 작성
		 N 숫자의 개수 입력 
		 M 나눌려는 수 입력
		 int[] countNum에 나머지0값 저장
		 (A+B)%C == 0;
		 A%C+A%C == 0;
		 구간 별로 나머지가 0일경우
		 (B-A)%C == 0;
		 B%C - A%C == 0; B%C == A%C 인구간도 찾고
		 nC2로 각 나머지구간의 합을 구해서 더하면된다.
		 */
		Scanner sc = new Scanner(System.in);
		StringTokenizer stz = new StringTokenizer(sc.nextLine());
		int numberLength = Integer.parseInt(stz.nextToken());
		int divideNum = Integer.parseInt(stz.nextToken());
		int[] countNum = new int[divideNum];
		stz = new StringTokenizer(sc.nextLine());
		//누적 합과 나머지 구하기
		int sum = 0;
		for(int i=0; i<numberLength ; i++) {
			sum = (sum+Integer.parseInt(stz.nextToken()))%divideNum;
			countNum[sum]++;
			//나머지 0부터 divideNum-1까지 
		}
		
		//count = countNum[0] 나눳을경우 0인 경우
		long count = countNum[0];
		
		for(int i=0 ; i<divideNum ; i++) {
			count+=(long)countNum[i]*(countNum[i]-1)/2;
		}
		
		System.out.println(count);

		sc.close();
	}
}
