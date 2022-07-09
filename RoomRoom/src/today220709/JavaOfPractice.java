package today220709;

public class JavaOfPractice {

	public static void main(String[] args) {

		/*
		 * 자바의 정석 7/8일 배열 복습겸 문제풀기
		 */

		// 5-3 배열 arr에 담긴 모든 값을 더하는 프로그램
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		for(int s : arr) sum += s;
		System.out.println(sum);
		// for의 사용 방법을 물어본거같다.

		// 5-4 2차원 배열에 담긴 총합과 평균을 구하는 프로그램만드시오

		int total = 0;
		float average = 0;
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30},
				{40,40,40,40,40}
		};
		for(int i = 0 ; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j ++) {
				total += arr[i][j];
				average += 1.0;
			}
		}
		average = total / average;
		System.out.println("total = "+ total);
		System.out.println("average = "+ average);
		
//		//5-5 1~9사이로 랜덤숫자끼리 3자리 숫자를 만드시오
//		//중복이 되지않은
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			//-- 아래부터 코드 작성하시오 ;
			//j는 인덱스인듯하다.
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		for(int a : ball3) System.out.print(a+"");
		
		
		// 5-6 동전 거슬러 주기 프로젝트
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		System.out.println("money=" + money);
		for(int i=0;i<coinUnit.length;i++) {
			
			System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i] );
			money %= coinUnit[i];
			
		}

		// 5-7 동전의 갯수를 추가했다 5개씩 밖에 없는상태이고
		// 동전으로 해결못한 경우 , 동전이 남은 경우를 나타내시오.
		int money = 3510;
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			coinNum = money / coinUnit[i];
			if (coinNum > 5) {
				money = money - coinUnit[i] * 5;
				coin[i] = 0;
				coinNum = 5;
				} else {
				money %= coinUnit[i];
				coin[i] -= coinNum;
			}

			System.out.println(coinUnit[i] + " 원 : " + coinNum);
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다 .");
			System.exit(0); // . 프로그램을 종료한다
		}
		System.out.println("= 남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " 원:" + coin[i]);
		}
		// 디버깅을 하면서 coinNum의 갯수를 수정해야된다는걸 잊었다.

		// 5-8 answer 읽어서 갯수만큼 *을 찍어준다.
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		for (int i = 0; i < answer.length; i++) {
			switch (answer[i]) {
				case 1:
					counter[0]++;
					continue;
				case 2:
					counter[1]++;
					continue;
				case 3:
					counter[2]++;
					continue;
				default:
					counter[3]++;
			}
		}
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5-9 배열을 90도 시계방향으로 회전시켜라

		char[][] star = { 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', ' ', ' ', ' ' }, 
				{ '*', '*', '*', '*', '*' },
				{ '*', '*', '*', '*', '*' } 
				};
		char[][] result = new char[star[0].length][star.length];
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				result[j][i]=star[star.length-(i+1)][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		// 간단하게 배열순서만 바꾸면되는데
		// 혼자서 올림피아 문제 풀듯이 고민햇다..

		// 5-10 알파벳 암호화 프로그램
		// abc 코드 배열은 a~z
		// num 코드는 0~9까지다
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			//여기 아래부터 작성.
			if( 96 < ch && ch <123 ) {
				result += abcCode[ch-96];
			} else if (47 < ch && ch <58 ) {
				result += numCode[ch-48];
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

		// 간단한 예제 였다

		// 5-11
		// 배열 5*3에서 가로 세로를 합한값으로 아래칸과 옆칸을 채우기
		
		int[][] score = { 
				{ 100, 100, 100 }, 
				{  20,   20,   20 }, 
				{  30,   30,   30 }, 
				{  40,   40,   40 }, 
				{  50,   50,   50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j]=score[i][j];
				result[i][score[i].length]+= score[i][j];
				result[score.length][j] +=score[i][j];
				result[score.length][score[0].length] += score[i][j];
			}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
		//기준만 잡았더니 해결되었다.
		
	}
}