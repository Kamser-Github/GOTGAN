package organize;

public class InterfaceTest04 {
	
	public static void main(String[] args) {
		
		A2 a2 = new A2();
		a2.methodA();
		System.out.println("main메소드 종료");
	}
}

class A2{
	
	public A2() {
		System.out.println("A2인스턴스 생성");
	}
	
	public void methodA() {
		I2 i2 = InstanceManger2.getInstance();
		i2.method();
		i2.toString();
		System.out.println("methodA() 종료");
	}
}

class B2 implements I2{
	
	@Override
	public void method() {
		System.out.println("현재는 b메소드 입니다");
	}
	@Override
	public String toString() {
		return "클래스 b2";
	}
}

interface I2{
	
	public abstract void method();
}

class InstanceManger2{
	
	public static I2 getInstance() {
		return new B2();
	}
}