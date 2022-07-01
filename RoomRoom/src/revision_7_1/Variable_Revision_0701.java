package revision_7_1;

public class Variable_Revision_0701 {

	
	public static void main(String[] args) {
		
		//Variable 변수와 자료형
		//개요 :
		//숫자,문자,논리를 컴퓨터는 어떻게 저장하는가?
		
		//8bit = 1byte;
		//1bit = 2개를 표현
		//3bit = 2의 3승개를 표현
		
		//부호 표시하는 방법
		//숫자는 기본적으로 int 4바이트로 표현 되기 때문에 32자리
		//맨 앞자리는 부호를 표시해야되기때문에 표현수 -1을 한다;
		
		int num = 0B00000000000000000000000000000000; //0
		int num1 = 0B00000000000000000000000000000001; //1
		int minusNum1 = 0B11111111111111111111111111111111; //-1
		//음수를 표현하려면 32자리를 벗어나게 하면 된다;
		
		//Variable;
		//변수를 선언
		
		String KangNam; // 강남은 변수 이름
		
		//강남에 4평집 매매를 하는걸 초기화라고 한다;
	
		KangNam = "편의점";
		
		//메모리에 string 이라는 자료형 변수를 선언하면
		//강남 도시에 4평 땅덩어리를 계약한다
		
		//4평 땅덩어리에 편의점이 들어간다.
		
		//자료형에는 기본 자료형 || reference(참조) 자료형이 있다;
		
		//정수형 integer
		//long = 2int = 4short = 8byte;
		//메모리 즉 땅덩어리를 점점 크게 가져가는데
		//배달집 할건데 100평 월세를 낼 필요는 없다는 뜻;
		//땅덩어리를 계산하기 편하게 "평"으로 하는데
		// 그 단위가 int 즉 4byte이다.
		//long은 int 단위에서 벗어나기 때문에 따로 표시를 해야한다;
		//long = 1561561615616L;
		// 허나 int범위 내에 들어가면 따로 신고를 안해도 된다;
		
		//문자형 자료는 이해되서 넘어감;
		
		//실수자료형 
		
		//부동소수점 방식
		
		double dnum = 1;
		double dnum2 = 1;
		
		for (int i=0 ; i < 1000 ; i++) {
			dnum = dnum+0.1;
			//실수형 자료에 0.1을 천번 더하면 101이 되어야한다
		}
		System.out.println(dnum);
		
		//100.99999999999854 나온다
		//컴퓨터는 밑수를 2로두고 쓰기때문에 0을 표현할수가 없기때문이다;
		
		//자료형 없이 변수 선언하기
		//단 지역변수만 가능하다 ex) 매소드;
//		var num = 10;
//		num = "string";
//		num = 1.1;
//		num = false;
		//처음 초기화 했을때 자료형을 따라간다;
		
		
		//Constant and literal
		//상수 예약어 final 사용
		final int height = 175;
		final int age;
		age = 30;
		//height = 165;
		//age = 29;
		//초기화 이후에 값을 변경할수없다
		//final 찾아가서 초기화를 직접 다시해야한다;
		
		//Literal
		//int,char,boolean 모든 값
		
		//constant pool이라는 특정 메모리 (땅에 저장)
		//기준이 있어야 하기에 정수는 int,실수는 double로 저장
		//변수에 선언되어 대입될때 꺼내쓴다.
		//인스턴스와 다르게 ==사용이 가능하다;
		
		int num10 = 10;
		int num2_10 = 10;
		// num10 == num2_10 => True;
		// 이유는 literal값은 다 constant pool에 저장되기 때문이다;
		
		//형 변환 type conversion;
		
		//방식
		//바꾸고싶은 자료형 앞에 (변수)를 넣는다.
		
		char min = 'M';
		System.out.println((int)min); //숫자로 바꾼다.
		
		//실수를 정수로 바꿀때
		//큰 수가 작은 자료형으로 바꿀때
		//데이터 손실이 생긴다;
		
		double PI = 3.14;
		int PI_ = (int)PI;
		//PI_ 3이 된다;
		
		
		
		
		
		
	}

}
