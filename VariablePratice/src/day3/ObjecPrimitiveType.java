package day3;

public class ObjecPrimitiveType {
		//제일 먼저
		//퍼블릭 클래스
		//Object0713이 생성된다.
		//그리고 main메소드가 생기면서
		//콜스택 맨 아래에 메인메소드가 다른 메소드를 호출시킨다.
	public static void main(String[] args) {
		
		Data data = new Data();
		//먼저 메인 콜스택에서
		//data라는 Data 타입의 메모리 공간이 생긴다
		//그후 new연산자로 Data 클래스의 인스턴스가 생성되고
		//Data() 메서드로 초기화가 된다.
		//data 변수에 생성된 인스턴스 주소가 저장된다.0x100
		data.x = 10;
		//인스턴스는 참조변수를 통해서만 접근이 가능한데
		//data 변수로 새로 생성된 인스턴스 x값을 10으로 변경하였다.
		
		System.out.println("data의 x의 값은"+data.x);
		//메인메소드가 print.ln 메소드를 부르면서
		//콜스택 메모리에 메인메소드는 대기로 프린트가 나중에 들어오면서
		//먼저 출력이 된다.
		
		change(data.x);
		//change 메소드로 x의 값을 변경한다.
		//메인메소드 위에 change 메소드가 부른 프린트ln이 작성되고
		//change도 할일이 끝나 리턴하여 여기로 다시 돌아온다.
		
		//다시 d.x의 값이 변경되었는지 확인하기 위해서
		System.out.println(data.x);
		//출력해본다.
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change의 x값은"+x);
	}
}

class Data{int x;}