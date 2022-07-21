package kr.co.interfacee;

public class InterfaceTest01 {
	public static void main(String[] args) {
		//인터페이스가 없다면
		//A가 B를 직접 호출할때
		//필요한건 B의 참조변수
		//1.해당 클래스를 초기화 해서 집어넣거나
		//2.지역변수로 끌고와서 쓰거나.
		
		A02 a = new A02();
		//B02 b = new B02();
		//a.method(b);
		//a.method(new B02()); 두가지
		//a.method(new C02()); 상속받은 애도 되고
		
		//메소드의 내용을 교체하고싶을때
		//A메소드의 매개변수 타입도 바꿔야하고
		//인자로 넣는 참조변수타입도 변경해야한다.
		
		//그러나 인터페이스로 중간 다리역할을 하면 간단해진다.
		
		a.method(new B02());
		a.method(new C02());
		
		//인터페이스를 구현한 애들이 모두 들어가진다.
	}
}

class A02{
	public void method(D02 d) {
		d.method();
	}
}

class B02 implements D02{
	public void method() {
		System.out.println("야얍");
	}
}

class C02 extends B02 implements D02{
	public void method() {
		System.out.println("빠세호");
	}
	
}

interface D02{
	public abstract void method();
}