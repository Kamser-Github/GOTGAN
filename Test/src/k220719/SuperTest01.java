package k220719;

public class SuperTest01 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method(); //child method
		Child c = new Child();
		c.method(); //child method
		
		//p.method2(); // 이게 아빠
		//c.method2(); // 이게 아들
		
		//따라서 static매서드는 클래스명.매소드로 호출해야
		//오류가 안생긴다.
		/*조상,자손의 변수값은 참조변수의 타입에 값을 따라간다.
		 * 하지만 매서드는 오버라이딩이 되어 누가 호출을 해도 자손꺼로간다.
		 * 스태틱매서드는 참조변수에 따라 달라지므로 클래스명.매서드
		 * 로 호출해야한다.
		 */
	}
}

class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parant Method");
	}
	
	static void method2() {
		System.out.println("이게 아빠고");
	}
}


class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
	static void method2() {
		System.out.println("이게 아들이고");
	}
}