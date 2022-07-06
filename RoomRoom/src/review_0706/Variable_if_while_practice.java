package review_0706;

import java.sql.SQLOutput;

public class Variable_if_while_practice {
	
	public static void main(String[] args) {
		//자바의 정석
		//3-9
//		char ch = 'z';
//		System.out.println(+'0'); 
//		z - 122
		//a - 97 0- 48
		//Z - 90 9 - 57
		//A - 65 1 = 49
		
		
//		boolean b = ((ch>47&&58>ch)||(ch>65&&ch<90)||(ch>97&&ch122));
		
		//3-10
//		char lowerCase = ( ch < 97 )?( ch + 32 ): ch;
		//대문자가 소문자보다 숫자가 32가 작기때문에
		//a가 소문자 중에서 제일 숫자가 낮기 때문에
		//97보다 작을경우 32를 더해준다.
		
		//4-4
		//연속된 숫자 1 + (-2) + ... 합이 100이될때 몇번 더해야하나
//		int total = 0; // 수 의합
//		int i = 1; // 몇번더하는지 숫자.
//		
//		while(total<100) {
//			if(i%2==0) total -=i;
//			total +=i;
//			i++;
//		} //20
//		int i = 0;
//		int j = 0;
//		
		//4-5 while 문으로 변경
//		while(i<11) {
//			while(j<i+1) {
//				System.out.print("*");
//				j++;
//			}
//			i++;
//			j=0;
//			System.out.println();
//		}
//		
		//4-6
		//주사위 1 ~ 6 , 1~6 에서 두눈의 합이 6이 나오게 하라;
//		for(int i = 1 ; i < 6 ; i++) {
//			
//			for(int j = 1 ; j < 6 ; j++) {
//				if(i+j==6) System.out.print(i  + "+"+j +"="+(i+j)+"\t");
//			}
//			System.out.println();
//			
//		}
		
		//4-7 1~6사이의 임의의 정수를 변수 value에 저장코드 작성
//		int value = (int)(Math.random()*6)+1;
//		System.out.println(value);
		
		//4-8 2x+4y = 10; x,y = int
		//x+2y=5가 되는 값을 구하자;
//		
//		for(int i = 0 ; i<11 ; i++) {
//			for(int j = 0; j < 11 ; j ++) {
//				if(i+2*j==5) System.out.println(i+","+j); 
//			}
//		}
//		
//		String str = "12345";
//		int result = 0;
//		for(int i = 0;i < str.length();i++) {
//			result +=str.charAt(i)-48;
//		
//		}
//		System.out.println(result);
		
	// str에서 인덱스로 문자열을 가져왔을때 char이기 때문에
		// 숫자로 빼줘야한다.
		
		//4-10
//		int num = 12345;
//		int sum = 0;
//		for(int i = 10 ; i < num ; ) {
//			sum += num%i;
//			num /= i;
//			if(num < 10) sum+=num; 
//		}
//		System.out.println(sum);
		
		//문제가 재밋엇다. 굳
		
		//4-11 피보나치 수열 10번째 수는 무엇인가
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//	
//		for(int i = 0;i <8 ; i++) {
//			num3 = num1 + num2;
//
//			num1 = num2;
//
//			num2 = num3;
//
//			System.out.print(","+num3);
//		}
		//답안지를 보고 
		//대입에 대해서 다시 생각하게 되었다.
		//단순히 값을 넣는거라고 생각을 했는데
		//반성하게 되엇다.
		
		//4-12
		//구구단 특정 모양으로 작성
//		int num = 0;
//		for(int i = 1 ; i < 4 ; i ++) {
//			for(int j = 1 ; j < 4 ; j++) {
//					if(i==3)num=7;
//					if(i==2)num=4;
//					if(i==1)num=1;
//				for(int k = 1 ; k < 4 ; k++) {
//					num++;
//					if(i==3&&k==3)continue;
//					System.out.print(num+"*"+""+j+" = "+num*j+"\t");
//					
//				}
//				
//				System.out.println();
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		//4-13 문자열 중에서 숫자가 아닌게 껴있는거 찾기
		
//		String value = "12o45";
//		char ch = ' ';
//		boolean isNumber = true;
//		
//		for(int i=0; i< value.length() ;  i++) {
//			int num = value.charAt(i);
//			isNumber = (47<num&&num<58)?true:false;
//		}
//		
		//4-14 1~100사이 임의의 숫자 answer;
//		int answer = (int)(Math.random()*100+1);
//		int input = 0;
//		int count = 0;
//		java.util.Scanner a = new java.util.Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1~100사이값 입력");
//			input = a.nextInt();
//			if(input > answer) {
//				System.out.println("더 큰 수를 입력하세요");
//			} else if(input == answer) {
//				System.out.println("정답입니다");
//			} else System.out.println("더 작은수를 입력하세요");
//			
//		}while(true);//무한 반복문;
		
		//4-15 회문수를 찾아라!
//		int number = 12321;
//		int tmp = number;
//		
//		int result = 0; //변수 number를 거꾸로 변환해서 담은 변수
//
//		while(tmp!=0) {
//			
//			result += tmp % 10;
//			if(number==result) break;
//			result *= 10;
//			tmp /= 10;
//			
//		}
//		if(number == result) System.out.println("회문수입니다");
//		else System.out.println("회문수가 아입니다");

	}
	
}
