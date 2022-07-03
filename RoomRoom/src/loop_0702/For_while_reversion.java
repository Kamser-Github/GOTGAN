package loop_0702;


public class For_while_reversion {
	
	//while , do - while , for
	//사용방법차이
	
	//while(조건식){};
	//조건식을 만족하는 동안 중괄호{}의 수행문을 반복해서 처리
	
	//1.무한루프 만들기
	
//	while (true) {
//		//..
//		
//	}
	
	//학생의 점수를 받아 수우미양가를 보여주는 프로그램을 만드세요.
	//조건1. 점수가 -1이면 프로그램을 종료합니다.
	
	public static void main(String[] args) {
	
//	int studentScore = 91 ;
//	String studentGrade;
//	while(studentScore != -1) {
//		if(studentScore > 90) {
//			studentGrade = "수";
//			System.out.println(studentGrade);
//			studentScore = -1;
//			}
//		}
//	System.out.println(studentScore);
//	
//	}  // 코딩 실수 : 학생의 점수를 건들면 안됐다
		
	//while 조건식이 안맞으면 {} 의 코드가 실행되지 않는다;
	//if문도 조건이 안맞으면 {} 의 코드가 실행이 되지 않는다;
	//do - while은 한번은 실행이 된다;
//	int i = 5;
//	do {
//		i++;
//		System.out.println(i);
//	} while(i < 5);
	
	//기본 while문이였으면 do{}의 코드는 실행이 한번도 안되지만
	//do while은 한번은 실행이 되기때문에 i = 6이 된다.
//	
//	do {
//		int j = 1;
//		i++;
//		do {
//			System.out.println(i+"i 의 값");
//			System.out.println(j+"j 의 값");
//			System.out.println("---");
//			j++;
//		}while(j<5);
//	} while(i<10);
//		
//	
//	while 조건의 쓸 변수는 밖에서 선언해야한다;
		
		//for ( 초기화 ; 조건 ; 증감 ) { 수행문 ;}
		
//		int i = 0 ;
//		int j = 3 ;
//		for(; ((i=i+10)>9)&&((j=j+2)<8) ; i++,j++) {
//			System.out.println(i+": i의 값");
//			System.out.println(j+": j의 값");
//		}
//		
//		//조건식은 다 들어가진다.
//		
		
		//초기화 식 생략
		
//		int i = 0;
//		for( ; i < 5 ; i++) {
//			//다른곳에서 초기화를 했을경우 생략이 가능하다..는데
//		}
		
//		for (int i = 0; ;i++) {
//			if(i==5) {
//				break;
//			}
//		} //if문과 같이해서 특정 조건에서 멈출수가 있다
		
}
}
