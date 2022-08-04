package algorithm.datastructure;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BeakJoon10986 {

	public static void main(String[] args) {

		/*
		 * 슈도코드 작성하기 number 숫자의 길이 divideNum 나눗셈할 수 countNum 누적합 baseArr 원래 배열 count
		 * 나뉜숫자 int[]countNum = 새배열[baseArr+1] StringTokenizer stz = new
		 * StringTokenizer(sc.nextInt()) number,divide 받기 StringTokenizer로 다시 받기
		 * for(i=1부터 i~n까지){ countNum[i] = countNum[i-1]+sc.nextInt(); } for(i=1 i~n까지){
		 * (countNum[i]%divideNum==0)의 개수를 구하고 } for(i=count ; n이 2보다 크거나 같으면){ if(i가
		 * 2보다 같거나 크다면) count는 count+i*(i-1)/2 }
		 */
		Scanner sc = new Scanner(System.in);
		StringTokenizer stz = new StringTokenizer(sc.nextLine());
		int numberLength = Integer.parseInt(stz.nextToken());
		int divideNum = Integer.parseInt(stz.nextToken());
		int count = 0;
		stz = new StringTokenizer(sc.nextLine());
		int[] countNum = new int[numberLength + 1];

		for (int i = 1; i <= numberLength; i++) {
			// 누적합 구해주고
			countNum[i] = countNum[i - 1] + Integer.parseInt(stz.nextToken());
		}
		for (int i = 1; i <= numberLength; i++) {
			// 나머지 0인것 고르기
			if (countNum[i] % divideNum == 0) {
				count++;
			}
		}
		// i가 2까지
		for (int i = count; i >= 2; i--) {
			int addCount = i * (i - 1) / 2;// nC2
			count += addCount;
		}
		System.out.println(count);
		
		sc.close();
	}
}
