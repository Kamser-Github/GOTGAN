package practic0710;

public class OperatorPractice0710 {

	public static void main(String[] args) {
		
		//1. 연산자는 반드시 값을 반환한다.
		//대입연산자와 변수 없이는 값을 저장할 공간이 없어서 증발하기때문에
		// 변수 = 연산식 이 나와야한다.
		
		/*2.단항 연산자.
		 *  i++;,++i; 단독으로 쓰일경우엔 차이가 없다.
		 *  식이나 메소드에서 쓰일경우 결과값이 다르다.
		 */
		int i = 5;
		i++;
		System.out.println(i); //6
		++i;
		System.out.println(i); //7
		
		int numi = 5 ; int numj = 0;
		numj = numi++;
		System.out.println("j=i++ ; 실행후 , i ="+numi+", j ="+ numj);
		
		numi = 5 ; numj = 0; //다시 초기화
		numj = ++numi;
		System.out.println("j=++i ; 실행후 , i ="+numi+", j ="+ numj);
		
		/* j=i++ ; 실행후 , i =6, j =5
			j=++i ; 실행후 , i =6, j =6
			++ 전위형 : 먼저 값을 증가, 값을 i에 저장 , j에 복사
			후위형++ : 값을 i에 저장,연산을 j에 대입, i의 값이 증가한다
			전위형은
			++i;
			j = i;
			후위형은
			j = i;
			i++;
			라고 이해하면 편하다.
		 */
		
		byte a = 10;
		byte b = 30;
		// byte c = a+b; error
		// 연산을 할경우 자동으로 int로 형 변환 되기대문에 결과값을 byte에 
		// 담을수가 없다.
//		byte c = (byte)(a+b);
		byte c =(byte)(a*b);
		System.out.println(c); //300 -> 44로 값손실이 생겻다.
		
		//오버 플로우 범위를 넘어서다.
		byte over = 127;
		System.out.println(over); //127
		over++;
		System.out.println(over); //-128 자바 primitive는 한계를 넘어서면 최소값으로 한바퀴 돈다.
		//오버 플로우가 발생한 이상 형변환을 해도 바뀌지 않는다.
		
		char c1 = 'a';
		char c2 = c1;
		c2++;
		c2++;
		System.out.println(c2); //c
		//c2++ 와 c2 = c2+1;은 다르다 c2+1은 결과값이 int인데 담는 변수형은 char이기 때문이다;
		
		//이때
		c2 = 'a'+1;
		System.out.println(c2); //b
		//이유는 c2+1는 리터럴끼리 연산이 아니라 값변환이 있지만.
		//'a'+1은 리터럴간의 연산이기때문에 컴파일러가 계산해서 그결과를 대체하기때문이다.
		
		//즉 c2+1은 c2가 무슨 값을 가지고 있는지 미리 계산을 못하지만.
		//'a'+1은 컴파일러가 미리 보고 계산을 할수있기때문에 가능하다.
		
		//나눗셈의 함정
		//사칙연산을 하게 될경우엔 int로 형변환후 계산을 하게되는데.
		//(int)(PI * 1000)/1000f;
		//1.괄호의 PI는 실수형이기 때문에 3141.592F인 상태
		//2.int로 형변환이 되기때문에 3141이 된다.
		//3.다시 1000f 실수형으로 계산하면
		//4. 3.141f 가 최종 값으로 저장된다.
		
		
		//반올림
		
		//(int)(PI * 1000+ 0.5)/1000F;
		//반올림 하고싶은 구간에 0.5를 더하고 정수형으로 소수점이하는 버린다.
		
		
		
		
		
	}
}
