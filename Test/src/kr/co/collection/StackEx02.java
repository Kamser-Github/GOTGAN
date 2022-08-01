package kr.co.collection;
import java.util.Stack;

public class StackEx02 {
	
	//스택 이해하기 
	//슈도코드 작성
	//코드 작성 뒤돌아가기 취소하기 만들어보기
	/*
	Stack back 는 new Stack로 저장
	Stack forward도 new Stack으로 저장
	
	main매소드 작성
	
	do("작업행동")
	
	ctrlZ() 뒤로가기
	
	ctzlY() 다시 앞으로 가기
	
	printNow() 현재 작업물 상태 프린트
	
	
	*/
	//현재 작성한걸 취소한걸 모아놓은 stack;
	public static Stack<String> cancleWrite = new Stack<>();
	
	//전에 했던 명령을 취소
	public static Stack<String> cancleOrder = new Stack<>();
	
	//do메소드 작성 
	public static void doWrite(String writeCode) {
		cancleWrite.push(writeCode);
		//작업하는중이기 때문에 복원하기가 불가능하기때문에 비운다.
		if(!cancleOrder.isEmpty())
			cancleOrder.clear();
	}
	
	public static void ctrlZ() {
		//뒤로가기가 비어있지 않으면
		//맨위에껄 빼서 오더취소 배열에 넣는다.
		if(!cancleWrite.empty())
			cancleOrder.push(cancleWrite.pop());
	}
	public static void ctrlY() {
		//복원하기를 누르면
		//복원 배열에서 하나빼서
		//취소하기 배열에 하나 넣는다.
		if(!cancleOrder.empty())
			cancleWrite.push(cancleOrder.pop());
	}
	
	public static void printNow() {
		final int PEEKLIST = cancleWrite.size()-1;
		if(!cancleWrite.empty()) {
			for(int i=PEEKLIST; i>=0 ; i--) {
				System.out.println(cancleWrite.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		
		doWrite("클래스 작성");
		doWrite("변수 선언및 초기화");
		doWrite("디폴트 생성자 작성");
		doWrite("매개변수 필요한 생성자 작성");
		doWrite("디폴트 생성자에 tis");
		
		ctrlZ();
		doWrite("디폴트 생성자에 this()");
		doWrite("클래스에 상속 클래스명 작성");
		ctrlZ();
		ctrlZ();
		printNow();
	}
}
