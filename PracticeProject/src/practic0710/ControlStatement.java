package practic0710;


public class ControlStatement {
	
	public static void main(String[] args) {
		
		//for 제어문
		//잊고 있던거만 다시 적고있다.
		
		for(int i = 0 , j = 0;  i < 10  ; i++,j--) {
			
		}
		
		//초기화는 두 타입이 같아야 하며 
		// 증감식도 ,를 이용해서 하나로 연결할수있다.
		
		//재밋는 예제
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <=5 ; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i  , j );
				} else {
					System.out.printf("%5c", ' '); //%c는 문자이다 %s는 문자열
				}
			}
			System.out.println();
		}
		
		int number = 5;
		while(number-- < 0) {
			//이때 number--는 
			//비교연산자 후에 값이 변경된다.
		}
		
		//아직 printf가 어색해서 예제 하나를 더 적어봤다.
		
		int sum = 0;
		int i = 0;
		while((sum += ++i)<100) {
			System.out.printf("%d  - %d%n",i,sum);
		}
		//1~100까지 차례대로 더해서 100이 넘지않은 수를 구하라
		//sum += ++i 이건
		/*i = i+1;
		 * sum = sum + i;
		 * 그후 sum < 100을 비교하는것.
		 * printf("%d - %d%n, i , sum")
		 *%d는 10진법 - 10진법 줄 넘기기 첫째에 i값 두번째에 sum값
		 *계속 연습해보자.
		 */
		
		//3,6,9하는 게임이다.
		//임의의 숫자 1 ~ 100까지 구구단을 하는거다.
		for ( int inum  = 1 ; inum <= 100 ; inum ++) {
			System.out.printf("i = %d ", inum);
			
			int tmp = inum;
			
			do {
				
				//tmp가 3의 배수인지 그리고 0을 제외하기
				if(tmp%10%3==0&& tmp%10!=0) {
					System.out.print("짝");
					
				}
							
			}while ( (tmp /=10) != 0); // tmp를 10으로 나눈 몫이 0이면 멈추겠다.
			System.out.println();
		}
		
	}
}
