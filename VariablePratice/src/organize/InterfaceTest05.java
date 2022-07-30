package organize;

public class InterfaceTest05 {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method1();
		c.method2();
		c.method3();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//interface static 메소드도 같은 사용방법으로 쓰고
		//default메소드는 조상이 우선
		//그리고 자손이 오버라이딩한게 우선이 있다.
		//만약에 인터페이스 끼리 겹친다면 새로 오버라이딩을 하면된다.
	}	
}

class Child extends Parent implements MyInterface,MyInterface2{
	
	public void method1() {
		System.out.println("method() in child");
	}
	//method3를 오버라이딩 안하니까
	//하라고 경고등이 만들어짐
	@Override
	public void method3() {
		System.out.println("둘중에 하나를 가져오지 못하고 새로 오버라이딩");
	}
}

class Parent{
	public void method2(){
		System.out.println("method() in parent");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1 in my interface");
	}
	default void method2() {
		System.out.println("method2 in my interface");
	}
	static void staticMethod() {
		System.out.println("staticMethod in my interface");
	}
	default public void method3() {
		System.out.println("method() in my interface");
	}
}

interface MyInterface2{
	default void method1() {
		System.out.println("method1 in my interface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod in my interface2");
	}
	default public void method3() {
		System.out.println("method() in my interface2");
	}
}