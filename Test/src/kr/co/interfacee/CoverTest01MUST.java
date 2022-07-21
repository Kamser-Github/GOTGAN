package kr.co.interfacee;

public class CoverTest01MUST {
	public static void main(String[] args) {
		A a = new A();
		I i = new C();
		a.methodB(i);
	}
}
/*
 * A가 B의 메서드나 변수나 등등을 호출할때
 * 직접적으로 A가 B의 참조변수를 받아서 호출을하면
 * 매서드의 내용을 교체하고 싶을때 
 * A의 매개변수와 인자로 들어가는 생성자도 바꺼야한다.
 * 인터페이스를 이용하게 되면
 * A - I    I - B
 * 로 연결이 되어있어서
 * I랑 연결된 곳만 교체해주면 된다.
 */


class A{
	
	public void methodB(I i) {
		i.method();
	}
}



interface I {
	public abstract void method();
}

class B implements I{
	
	public void method() {
		System.out.println("삐용");
	}
}

class C implements I{
	
	public void method() {
		System.out.println("삐용띠용");
	}
}