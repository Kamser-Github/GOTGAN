package practic0711;

public class ArrayPractice {

	public static void main(String[] args) {

		// 총합과 평균

		int sum = 0;
		float average = 0f;

		int[] score = { 100, 80, 90, 80, 55, 30 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		average = sum / (float) score.length;
		// 하나 되새김질
		// 소숫점 자리를 구하고 싶을땐 f를 이용하자.

		// 최대값과 최소값

		int[] sizeNum = { 79, 3, 55, 88, 120, 15, 46 };
		int tmpMax = 0;
		int tmpMin = sizeNum[0];
		for (int i = 0; i < sizeNum.length; i++) {
			if (sizeNum[i] >= tmpMax) {
				tmpMax = sizeNum[i];
			} else if (sizeNum[i] <= tmpMin) {
				tmpMin = sizeNum[i];
			}
		}
		
		System.out.printf("최대값은 %d%n최소값은 %d%n",tmpMax,tmpMin);
		
		//강사 풀이랑 비슷한데 최적화가 안좋았다.
		//최대값과 최소값을 둘다 배열의 첫번째로 잡고 시작했으면
		//한번이라도 반복문이 줄어들어들텐데.
		
		//3.섞기
		
		int[] numArr = new int[10];
		for(int i = 0; i < numArr.length ; i++) {
			numArr[i] = i;
		}
		int randomNum = 0;
		int tmp = 0;
		for(int i = 0 ; i < numArr.length; i++) {
			randomNum = (int)(Math.random()*10);
			tmp = numArr[i];
			numArr[i] = numArr[randomNum];
			numArr[randomNum] = tmp;
		}
		
		for(int a : numArr) {
			System.out.print(a + " ");
		}
		
		//처음에 실수를 했다.
		//Math.random에서 *10하고 +1을 하니까
		//random[10]은 없다고 오류가 떳다.
		//책에서도 배열을 벗어나게 코드를 짜지 말라고 햇다.
		
		
	}
}
