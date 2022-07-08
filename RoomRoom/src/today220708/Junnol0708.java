package today220708;

public class Junnol0708 {

	public static void main(String[] args) {

		// 정올 1692 비기너 문제
		// 세자리수 곱셈을 하는 계산기를 만들어라

		int number1 = (int) (Math.random() * 300) + 100;
		int number2 = (int) (Math.random() * 300) + 100;
		int total = 0;

		// number1이 위에 숫자고 number2가 아래숫자라고 정하고
		// number2의 일의 자리 ,십의자리 ,백의자리로
		// number1 을 한번씩 곱하는 값과
		// 나머지 두개를 곱한값 그리고 최종 총합을 구하시오
//	
//	int total = 0;
//	int dan = 0;
//	for(int i = 0 ; i < 3 ; i++) {
//		if(number2>10) {
//		dan = number2%10;
//		total +=dan*number1;
//		System.out.println(dan*number1);
//		number2 /= 10;
//		}
//		else {
//			total += number2*number1;
//			System.out.println(number2*number1);
//			System.out.println(total);
//			
//		}
//		}
		// 막상 코드 작성을 하니 하나도 눈에 안들어온다.
		// 이것저것 짜집기로 막 적어낸거같다.

		int[] mult = new int[3];
//	for(int i = 1; i < 4 ; i ++) {
//		mult[i] = number2%10-mult[i-1];
//		mult[i] = number2%(10*10)-mult[i-1]-mult[i-2];
//		mult[i] = number2%(10*10*10)-mult[i-1]-mult[i-2]-mult[i-3];
//		
//		//-----------------
//		mult[i] = number2%10-mult[i-1];
//	}
	int ten = 10;
	for(int i = 0 ; i < mult.length ; i ++) {
		if(i==mult.length-1) {
			mult[i]=number2;
			break;
		}
		mult[i] = number2%ten;
		number2 /= ten;
	}
	for(int i = 1 ; i < mult.length ; i++) {
		mult[i] *= ten;
		ten*=ten;
	}
	for(int s : mult) {
		s = s*number1;
		total +=s;
	}
	System.out.println(total);
//	식이 너무 길다... 어떻게 줄이면 좋을까?

	}
}
