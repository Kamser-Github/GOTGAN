package day0714;

public class SortPractice02 {
	
	public static void main(String[] args) {
		
		//버블정렬 연습
		
		//1.배열 길이 10인 int[] 배열 만들기.
		int[] ten = new int[10];
		
		//2.배열에 랜덤 두자리 숫자 10~99까지 넣기
		for(int i=0 ; i<ten.length ; i++) {
			ten[i] = (int)(Math.random()*90)+10;
		}
		
		//2.5 정렬전 배열확인
		System.out.println("정렬전 배열");
		
		//3.제대로 들어갔는지 출력해보기
		for(int a : ten) {
			System.out.print(a+" ");
		}
		System.out.println();
		//19 10 42 41 98 82 69 81 71 44 랜덤하게 잘들어감
		
		//4.버블정렬로 연습
		for(int i=0 ; i<ten.length-1 ; i++) {
			boolean flag = false;
			for(int j=0 ; j<ten.length-1-i ; j++) {
				int tmp;
				if(ten[j]>ten[j+1]) {
					tmp = ten[j];
					ten[j] = ten[j+1];
					ten[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		//2.5 정렬후 배열확인
				System.out.println("정렬후 배열");
				
		//5.제대로 정렬했는지 출력해보기
		for(int a : ten) {
			System.out.print(a+" ");
		}
		 /*
		  36 40 79 61 61 83 47 49 15 51 
		  15 36 40 47 49 51 61 61 79 83 
		  
		 */
		
		
	}//main of end
}//class of end
