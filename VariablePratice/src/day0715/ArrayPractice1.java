package day0715;



public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		//빈도수 체크해보기
		
		//숫자를 넣을 배열과 중복수를 체크할 배열을 만든다
		
		int[] arr = new int[10];
		int[] arrCount = new int[5];
		
		//arr배열에 랜덤숫자 1~5를 넣는다.
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*5)+1;
			//넣을때마다 숫자 확인하기
			System.out.print(arr[i]+" ");
		}
		
		//arr배열에 중복되는 숫자 세어보기
		
		for(int i=0 ; i<arr.length ; i++) {
			arrCount[arr[i]-1]++;
			//arr 배열에서 숫자가 나오면
			//그 숫자 자리에 기본값에 +1을 해준다
			//arr에서 제일 작은 숫자는 1이라서 인덱스에 -1했다.
		}
		
		//중복된 수 확인해보기
		System.out.println();
		for(int a : arrCount) {
			System.out.print(a+" ");
		}
		System.out.println();
		//중복된 숫자와 개수 따로 출력해보기
		for(int i=0 ; i<arrCount.length ; i++) {
			System.out.printf("%d:%d|",i+1,arrCount[i]);
		}
		/*
		4 2 3 2 4 4 5 3 3 4 
		0 2 3 4 1 
		1:0|2:2|3:3|4:4|5:1|
		*/
	}//main of end
}//class of end
