package day1;


public class VariablePractice2 {
	
	public static void main(String[] args) {
		
		//scanner가 오류나서 지웠다.
	
		
		//748
		//2개의 문자열을 입력받아서 첫 번째 문자열 2번, 
		//두 번째 문자열 3번을 연결해서 출력하는 프로그램을 작성하시오.
		
//		String str1,str2;
//		
//		System.out.print("두번 입력될 문장을 입력하세요");
//		str1 = sc.nextLine();
//		
//		System.out.print("세번 입력될 문장을 입력하세요");
//		str2 = sc.nextLine();
//		
//		System.out.printf("%s%s%s%s%s",str1,str1,str2,str2,str2);
//		
//		
		
		//next() 와 nextLine()의 차이를 알았다.
		//line엔터치기전까지를 한 문자열로보고
		//next는 스페이스바를 누른순간 문자열이 끝이난다.
		//다른 사람들은 어떻게 풀었는지 보고싶은데..
		//구글에 검색해도 안나온다.
		
		//749번
		//국어, 영어, 수학, 컴퓨터 과목의 점수를 입력받아서 
		//총점과 평균을 구하는 프로그램을 작성하시오. 
		//(단, 평균의 소수점 이하는 버림한다.) 
		//나는 안버린다. 둘째자리에서 반올림하겟다.
//		
//		int kor,eng,mat,com,sum;
//		double avg;
//		
//		System.out.print("국어 점수를 입력하세요");
//		kor = sc.nextInt();
//		System.out.print("영어 점수를 입력하세요");
//		eng = sc.nextInt();
//		System.out.print("수학 점수를 입력하세요");
//		mat = sc.nextInt();
//		System.out.print("컴퓨터 점수를 입력하세요");
//		com = sc.nextInt();
//		
//		sum = kor+eng+mat+com;
//		//두번째 자리에서 반올림을 해보겠다.
//		avg = (double)sum/4;
//		
//		System.out.printf("sum %d%navg %.1f",sum,avg);
		
		//750
		//두 정수를 입력받아서 나눈 몫과 나머지를 
		//다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
		//35 / 10 = 3 ... 5
//		
//		int num1 ,num2;
//		
//		System.out.print("두 정수를 입력하세요");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		
//		
//		System.out.printf("%d / %d = "+num1/num2+"..."+num1%num2,num1,num2);
//		
		
		//751
		//직사각형의 가로와 세로의 길이를 입력받은 후 
//		가로의 길이는 5 증가시키고, 
//		세로의 길이는 2배하여 저장한 후 
//		가로의 길이, 세로의 길이, 넓이를 
//		차례로 출력하는 프로그램을 작성하시오.
		
//		int width,length,area;
//		
//		System.out.print("가로 세로 길이를 차례대로 입력하세요");
//		width = sc.nextInt()+5;
//		length = sc.nextInt()*2;
//		area = width*length;
//		
//		System.out.printf("width = %d%nlength = %d%narea = %d",width,length,area);
		
		//752
		/*두 수를 입력받아 첫 번째 수를 1 증가시킨 후 두 수를 출력하고, 
		 * 다음에는 두 번째 수를 1 감소시킨 후 
		 * 다시 두 수를 출력하는 프로그램을 작성하시오.
		 */
		
//		int number1,number2;
//		
//		System.out.print("두 수를 차례대로 입력하세요");
//		number1 = sc.nextInt();
//		number2 = sc.nextInt();
//		
//		System.out.printf("%d %d%n%d %d",++number1,number2,number1,--number2);
		
		//입력 예 10 ,15
		//출력 11 15 
		//   11 14
		
		/*753
		오빠와 여동생의 바둑 급수를 입력받아
		(입력시에 물어보는 문장이 있음에 주의한다), 
		오빠와 여동생의 바둑 급수가 다르면 True, 
		같으면 False를 출력하는 프로그램을 작성하시오.*/
		
//		int brotherGrade,sisterGrade;
//		
//		System.out.print("오빠의 바둑 급수를 입력하세요");
//		brotherGrade = sc.nextInt();
//		System.out.print("여동생의 바둑 급수를 입력하세요");
//		sisterGrade = sc.nextInt();
//		
//		System.out.print(brotherGrade!=sisterGrade);
		//처음에 !() 이걸로 하려고했는데
		//!=이게 더 보기도 좋고 간단해서 썻다.
		/*
		754
		민수의 키, 민수의 몸무게, 기영이의 키, 기영이의 몸무게를 
		순서대로 입력받아 민수가 키도 크고 몸무게도 크면 True, 
		그렇지 않으면 False를출력하는 프로그램을 작성하시오.*/
//		
//		int minsuHeight,minsuWeight,kiyoungHeight,kiyoungWeight;
//		
//		System.out.print("민수의 키 와 몸무게를 입력하세요");
//		minsuHeight = sc.nextInt();
//		minsuWeight = sc.nextInt();
//		
//		System.out.print("기영의 키 와 몸무게를 입력하세요");
//		kiyoungHeight = sc.nextInt();
//		kiyoungWeight = sc.nextInt();
//		
//		System.out.println(minsuHeight>kiyoungHeight&&kiyoungWeight<minsuWeight);
		

	}
	
}
