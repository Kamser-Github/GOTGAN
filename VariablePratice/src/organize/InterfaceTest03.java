package organize;

public class InterfaceTest03 {
	
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}
}
/*
참조변수 a가 methodA()를 사용하면
methodA()는 생성자를 사용하지 않고
I를 구현한 클래스의 인스턴스를 리턴받아서
(원래대로 생성자를 만들어서 하면
그에 관련된 참조변수도 하나씩 다 바꿔줘야하는데
그걸 안해도 된다)
i에 참조값을 전달하고
i는 getInstance()로 리턴받은 클래스의 인스턴스가 가진
I를 구현한 매소드를 사용한다.
원래는 인터페이스가 상속을 못받아서 Object 매소드를
사용할수없지만 모든 클래스가 Object를 상속받았기에
i.toString()이 사용이 가능한것이다.
만약에 인스턴스를 바꾸려면 getInstance()만 바꾸거나
I를 구현한 클래스의 인스턴스를 반환해주는 매서드를 다시 만들어서
I i 에 대입해주면 된다.
*/
class A{
	
	void methodA() {
		I i = InstanceManager.getInstance();
		i.methodB();
		System.out.println(i.toString());
	}
}

interface I{
	public abstract void methodB();
}

class B implements I{
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public String toString() {
		return "class B";
	}
}
class InstanceManager{
	public static I getInstance() {
		return new B();
	}
}
