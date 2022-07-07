package reveiw_0707;

public class For_while_0707 {

	public static void main(String[] args) {
			//정올 반복제어문 125:
			//정수를 입력받아 1부터 정수까지 차례대로 출력하는 프로그램 만들어라;
			/*
			int number125 = (int)(Math.random()*40)+1; // 1~40 랜덤정수
			for(int i = 1 ; i < number125+1 ; i++) {
				System.out.println(i);
			}
			*/
			//정올 126:
			//정수 랜덤으로 받아 중간에 0이 나올경우 중단하고 홀/짝수 총 계를 구해라;
			
			 // 1~40
//			int odd  = 0;
//			int even = 0;
//			
//			while(true) {
//				int number126 = (int)(Math.random()*41);
//				//임의의 숫자 0 ~ 40을 받는다.
//				if(number126==0) break;
//				else if(number126%2==0) even+=1;
//				else odd+=1;
//			}
//			System.out.println("odd : "+odd+"\neven : "+even);
			
			//정올 127 :
			//랜덤 숫자 주어짐 0~100사이인 숫자는 총합과 평균을 구함
			//평균은 소수 둘째자리에서 반올림;
			/*
			int count = 0;
			double total = 0;
			double round = 0;
			while(true) {
				
				int number127 = (int)(Math.random()*200);
				if(0<number127 && number127 < 101) {
					count++;
					total += number127;
				}else break;
				
				}
			if(total!=0) round = ((int)(total/count*10+0.5))/10;
			System.out.println("sum : "+ (int)total+"\n"+"avg : "+ round);
			*/
			//정올 128 임의의 숫자를 받아 0이면 정지 3의 배수,5의 배수를 제외한
			//숫자의 갯수를 구하라
			/*
			int count = 0;
			while(true) {
				int number128 = (int)(Math.random()*30);
				if(!(number128%3==0 || number128%5==0)) count++;
				else if (number128==0) break;
			}
			System.out.println(count); 
			//3의배수와 5의 배수를 제외한 나머지가 경우의 수가더 많기에
			//먼저 카운트를 하고 그 이후 0을 먼저 찾아내어 함수를 나가는게 제일 빠른다.
			*/
			//정올 129 
			//높이 와 밑변을 정수로 받고 넓이는 둘째자리에서 반올림을 한후
			//계속 다른 정수를 받아 넓이를 구할건지 안할건지 선택을 받고 진행하는 함수
			/*
			int base,height = 0;
			while(true) {
				base = (int)(Math.random()*10)+1; //1~10 랜덤숫자
				height = (int)(Math.random()*10)+1;
				double Trianglewidth = (base*height)/2; //넓이 구하는 공식
				System.out.println(Trianglewidth);
				int choice = (int)(Math.random()*2); // Y || N
				if(choice == 0)break;
			}
			*/
			// 반복 제어문 2
			// 131 - 100이하의 정수 두개를 받아 그 사이의 숫자를 나열하기
			/*
			int num1 =  (int)(Math.random()*101);
			int num2 = (int)(Math.random()*101); //0부터 100까지.
			int littleNum = (num1 <= num2)? num1 : num2;
			
			for( ; littleNum <= num2 ; littleNum++) {
				System.out.println(littleNum);
			}
			*/  //먼저 삼항 연산자로 작은수를 구하면 금방 해결되는 문제다.
			
			// 137 -행과 열에 하나씩 정수를 받아 다음과 같이 출력되도록 하시오
			//행은 1부터 해당 숫자까지 적고
			//열은 그 첫행의 배수의 갯수를 출력하시오
			/*
			int hang =  (int)(Math.random()*10)+1; //임의의 숫자 1 ~ 10
			int ten = (int)(Math.random()*10)+1;
			for( int i = 1 ; i < hang+1 ; i ++) {
				
					for( int j = 1 ; j <ten+1 ; j++) {
						System.out.print(i * j+"\t");
					}
					System.out.println();
					
			} // 첫 for문은 행으로 계산하고 두번째 for문은 열로 계산했다.
			*/
			// 비기너 문제로 넘어가보자
			// 1303 - 사각형의 높이 n과 너비 m을 입력받은 후 n행 m열의 사각형 형태로 1부터 
			// n*m번까지 숫자가 차례대로 출력되는 프로그램을 작성하시오 n,m범위는 1~100이다
		/*
		int height = (int)(Math.random()*100)+1;
		int weight = (int)(Math.random()*100)+1;
		//높이는 행 첫번째 for문 너비는 열 두번째 for문 으로 정햇다
		int number = 1;
		for(int i = 0; i < height ; i ++) {
			for(int j = 0 ; j < weight ; j++) {
				System.out.print(number+++"\t");
			}
			System.out.println();
		}
		*/
		//1307 - 정수 n 정사각형을 출력하시오
		// (0,0)이 마지막 (n-1,n-1)이 처음 
		//정수는 1~ 5;
		/*
		int n = (int)(Math.random()*5)+1;
		int alp = 'A'+n*n-1;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print((char)(alp-n*j));
			}
			System.out.println();
     		alp--;
		}
		for 반복문을 쓸때에는 i행과 j열이 어떻게 커지는지 알면 쉽게 해결할수있다는걸
		몸소 깨달았다.
		*/
}
}
