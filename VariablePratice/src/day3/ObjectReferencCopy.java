package day3;

public class ObjectReferencCopy {
		//제일 먼저 이 클래스가
		//메소드 영역에 올라간다.
		//그리고 메인 메소드가 콜스택에 호출된다.
	//메인 클래스 안에 적는 전역변수,멤버변수는
	//맨위에 적으나 맨 아래에 적으나 똑같다.
	//메모리에 할당되는 순간부터 먼저 초기화가 된다.
	public static void main(String[] args) {
		
		Data2 data2 = new Data2();
		//1.Data 타입의 data 변수가 만들어진다.
		//2.new 생성자로 인스턴스가 만들어진다.
		//3.Data() 메소드로 인스턴스가 초기화된다.
		//4.참조변수data 공간에 인스턴스 주소가 저장된다.
		
		System.out.println("현재 data.x의 값은"+data2.x);
		
		change(data2);
		//참조변수가 가르킨 인스턴스 변수의 값을 넣는게 아니라
		//참조변수 자체 즉 인스턴스 주소를 change의 메소드에 인자로 넣엇다.
		//따라서 change는 data를 참조변수로 Data의 x의 값을 변경하였다.
		
		System.out.println("change 이후의 x의값은"+data2.x);
		
	}
	
	static void change(Data2 data2){
		data2.x = 1000;
		System.out.println("change x의값은"+data2.x);
	}
}

class Data2{
	int x;
}