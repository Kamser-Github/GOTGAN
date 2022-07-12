package day2;

import java.util.Scanner;

public class IfSwitchPractice {
	public static void main(String[] args) {
		
		/*801
		정수를 입력받아 출력하고 음수이면 minus라고 출력
		
		int num = sc.nextInt();
			
		System.out.println(num);
		if(num < 0 ) {
			System.out.println("minus");
		}
		
		
		802
		비만수치 "몸무게 + 100 - 키"
		비만수치가 0보다 크면 "Obesity" 출력
		
		int bmi,height,weight;
		
		height = sc.nextInt();
		weight = sc.nextInt();
		bmi = weight+100-height; 
		
		if(bmi>0) {
			System.out.println(bmi);
			System.out.println("Obesity");
		}
		
		
		803
		20살 이상이면 "성인"
		20살 미만이면 몇년후에 성인이 되는지 출력
		
		
		int age = sc.nextInt();
		if(age < 20) {
			System.out.println(20-age+"years");
		}else {
			System.out.println("성인");
		}
		
		805
		두 개의 실수를 입력 받아 
		모두 4.0 이상이면 "A", 
		모두 3.0 이상이면 "B", 
		아니면 "C" 라고 출력하는 프로그램을 작성하시오.​
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		char grade;
		if문은 범위가 큰거부터 작은순으로 내려가는게 좋다고 생각된다.
		따라서 A<3.0 || B<3.0
		 A<4.0 && B<4.0
		 그외
		
		if(num1<3.0 || num2<3.0) {
			grade = 'C';
		}else if (num1<4.0&&num2<4.0){
			grade = 'B';
		}else {
			grade = 'A';
		}
		
		내가 생각하는 If문은
		첫 if 조건문에서 반대되는 영역을 쪼개는것.
		 
		처음 if 조건이였던
		num1<3.0 || num2<.30 가
		첫번째 조건식이였으면 반대는 범위는
		num1>=3 || num2 >=3이 두개로 나누어진걸
		b등급과 a등급으로 나누어야한다.
		따라서 여기서 b등급을 먼저 구간을 잘라내면
		나머지는 계산하기가 쉬울거라고 생각한다.
		
		
		if(num1<3.0 || num2 <3.0) {
			grade = 'C';
		}else if(num1<4.0||num2<4.0) {
			이 다음 else if부터는 무조건 둘다 3.0이상이다.
			따라서 이때에는 둘중 하나라도 4.0미만이면 b로 뺀다.
			grade = 'B';
		}else
			grade = 'A';
		System.out.println(grade);
		
		
		806
		성별,나이 입력
		성인 ,아이 , 성별 4가지로 나누어 출력
		
		
		System.out.println("성별과 나이를 입력하세요.");
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		String human;
		
		if(sex=='M'||sex=='남') {
			human = (age < 18)?"Boy":"MAN";
		}else
			human = (age <18)?"Girl":"Woman";
		
		System.out.println(human);
		둘중에 하나일때는 IF문보다 삼항연산자가 낫다.
	
		
		809
		3개의 정수를 입력 받아 삼항연산자를 이용하여 
		입력 받은 수들 중 최솟값을 출력하는 프로그램을 작성하시오
		
		
		System.out.println("세개의 정수를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int minNum ;
		
		if(num1>num2) {
			minNum = (num2>=num3)?num3:num2;
		}else {
			minNum = (num1>=num3)?num3:num1;
		}
		
		System.out.println(minNum);
		
		
		810
		두 정수를 받아 큰수에서 작은수를 빼세요
		
		System.out.print("두 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int result = (num1>num2)?num1-num2:num2-num1;
		
		System.out.println(result);
		
	
		정수를 입력 받아 0이면 "zero", 
		양수이면 "plus", 
		음수이면 "minus"라고 출력하는 프로그램을 작성하시오.​ 
		
		
		int num = sc.nextInt();
		String result;
		
		if(num>0) {
			result = "plus";
		}else if(num<0) {
			result = "minus";
		}else result= "zero";
		
		System.out.println(result);
		*/
		Scanner sc = new Scanner(System.in);
		
		//812
		/*
		400으로 나누어 떨어지면 "윤년(leap year)​"이다.

		4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 "윤년(leap year)​"이다.

		나머지는 모두 "평년(common year)​"이다. ​*/
		
		int years = sc.nextInt();
		String year;
		
		if(years%400==0) {
			year = "윤년";
		}else if(years%4==0&&years%100!=0) {
			year = "윤년";
		}else {
			year = "평년";
		}
		
		System.out.printf("입력하는 %d년은 %s입니다",years,year);
		sc.close();
	}
}
