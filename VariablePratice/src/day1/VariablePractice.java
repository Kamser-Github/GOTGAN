package day1;

import java.util.Scanner;

//금일 복습
//첫번째 변수
public class VariablePractice {
	
	public static void main(String[] args) {
		
//		720 : 변수와 입력 자가진단 1
//		정수형 변수에 -100을 대입하여 출력하는 프로그램을 작성하라.​ 
		Scanner sc = new Scanner(System.in);
		//변수 선언
//		int number = -100;
//		System.out.println(number);
		
		//724 : 학교명을 입력받아 문장을 출력시켜라
		/*
		System.out.print("School?");
		String question = sc.nextLine();
		
		System.out.println("당신의 학교는"+question+"입니다.");
		*/
		
//		int number1,number2;
//		
//		System.out.print("Number1?");
//		number1 = sc.nextInt();
//		System.out.print("Number2?");
//		number2 = sc.nextInt();
//		
//		
//		System.out.printf("%d * %d = "+number1*number2+"\n",number1,number2);
//		System.out.printf("%d / %d = "+(int)((double)number1/number2*10+0.05)/10.0+"\n",number1,number2);
		//반올림을 해봤는데 식이 너무 지저분하다.
		//두번째 자리에서 반올림하고싶다.
		//연산을 하면 큰 타입으로 자동형변환이 된다.
		//위에 식을 좀 더 깔끔하게 정리하는 방법이 없을까?
		
//		double garo,sero;
//		
//		System.out.print("가로 길이를 입력하세요");
//		garo = sc.nextDouble();
//		System.out.print("세로의 길이를 입력하세요");
//		sero = sc.nextDouble();
//		
//		System.out.printf("직사각형의 넓이는"+(int)(garo*sero+0.5)+"입니다");
//		//이건 첫번재 자리에서 반올림하고싶다.
//		
		/*
		String sentence1,sentence2,sentence3;
		
		//세문장을 입력받아 그대로 출력하는 프로그램을 만드시오
		System.out.print("문장을 입력하세요");
		sentence1 = sc.next();
		System.out.print("두번째 문장을 입력하세요");
		sentence2 = sc.next();
		System.out.print("마지막 문장을 입력하세요");
		sentence3 = sc.next();
		
		System.out.printf("%s%n%s%n%s%n",sentence1,sentence2,sentence3);
		*/
		
		//728 세개의 정수형 변수에 10 20 30 을 대입후 그 변수를 이용해서
		// 다음과 같이 출력하세요 10 + 20 = 30;
//		
//		int number1 = 10;
//		int number2 = 20;
//		int sum = 30;
//		
//		System.out.printf("%d + %d = %d",number1,number2,sum);
//		
		
		// cm로 변환하는 출력 프로그램을 만드세요.
//		double yard;
//		
//		System.out.print("야드를 입력해주세요");
//		yard = sc.nextDouble();
//		
//		System.out.printf("%f", yard);
//		
		//? 내일 여쭤봐야겟다.
		
		
		
		//연산자 정올 코드 문제.
		//세개의 정수를 질문하는 문장없이 받아서 합계와 평균을 구하는 프로그램
//		int num1,num2,num3,sum;
//		double avg;
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
		//문제는 소수점을 버리라고했지만 연습하는 겸
		//소수 두번째자리에서 반올림하겠다.
		
//		sum = num1+num2+num3;
//		avg = ((double)sum/3*10+0.5)/10;
//		
//		System.out.printf("sum : %d%navg : %3.1f",sum,avg);
		
		//%f 앞에 xx.y
		//xx는 소수점 앞에 숫자 표현할 개수
		//y는 소수점 뒤에 있는 개수를 뜻한다 한번 서봣다.
		
		//741
		//한개의 정수를 받아 출력후 2만큼 증가시킨후 출력
		
//		int num;
//		
//		System.out.print("정수를 입력하세요");
//		num = sc.nextInt();
//		
//		
//		System.out.print(num+"\n"+(num+=2));
//		
		//743
		//두 개의 정수를 입력받아 두 번째 수를 1 감소시킨 후, 
//		두 수의 곱을 새로운 변수에 저장하고, 
//		첫 번째 수를 1 증가시킨 후 각각의 값을 출력하는 프로그램을 작성하시오.
//		
//		int num1,num2,mult;
//		
//		System.out.print("처음 정수를 입력하세요");
//		num1 = sc.nextInt();
//		
//		System.out.print("두번째정수를 입력하세요");
//		num2 = sc.nextInt();
//		
//		mult = --num2*num1++;
//		
//		System.out.printf("%d %d %d",num1,num2,mult);
		
		//744 두 정수 받아 같으면 ture 틀리면 false 두번째 줄은 반대로
		
//		int num1 , num2;
//		boolean semsem;
//		
//		System.out.print("두 정수를 입력하세요");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		semsem = (num1==num2);
//		
//		System.out.print(semsem+"\n"+!semsem);
//		
//		
		//745 두 정수를 입력받아서 4가지 관계연산자를 출력하시오
		
//		int num1,num2;
//		
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		System.out.printf("%d > %d --- "+(num1>num2)+"%n",num1,num2);
//		System.out.printf("%d < %d --- "+(num1<num2)+"%n",num1,num2);
//		System.out.printf("%d >= %d --- "+(num1>=num2)+"%n",num1,num2);
//		System.out.printf("%d <= %d --- "+(num1<=num2)+"%n",num1,num2);
//		
		
		//746 세 변수에 a b c 에 각각 T,T,F를 저장하고
		//연산식 결과를 줄에 순서대로 출력하는 프로그램을 만들어라
//		boolean a = true;
//		boolean b = true;
//		boolean c = false;
		// 시스템을 돌려보기전에
		// 직접 계산해봤다.
//		System.out.println(!a); //false
//		System.out.println(a&&b); //true
//		System.out.println(a||b); // true
//		System.out.println(a&&(b||c)); //true
//		System.out.println(a||(b&&c)); //true
//		System.out.println(!a||(b&&!c)); //true
		
		//정답이다
		/*
		3개의 정수를 입력 받아 첫 번째 수가 가장 크면 True, 
		아니면 False을 출력하고 세 개의 수가 모두 같으면 True, 
		아니면 False를 출력하는 프로그램을 작성하시오.
		*/
		
//		int a,b,c;
//		
//		System.out.print("세 정수를 차례대로 입력하세요");
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		//첫번째 정수가 제일 큰걸 비교해보자.
//		System.out.print(a>b&&a>c);
//		
//		System.out.print("\t");
//		
//		//세 수가 모두 같은지 확인해보자.
//		System.out.print(a==b&&b==c);
//		
		sc.close();
	}
}
