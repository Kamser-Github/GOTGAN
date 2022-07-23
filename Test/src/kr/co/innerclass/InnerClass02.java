package kr.co.innerclass;

public class InnerClass02 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	// 인스턴스 멤버간에는 서로 직접 접근이 가능하ㅏㄷ.
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static 멤버는 인스턴스 멤버에 직접접근이 불가능하다.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		InnerClass02 obj3 = new InnerClass02();
		InstanceInner obj1 = obj3.new InstanceInner();
		//클래스 변수가 인스턴스 변수에 접근하려면
		//참조변수를 통해서 접근을 해야하는데
		//참조변수가 클래스니까 클래스 타입에 변수에 담고
		//다시 인스턴스 클래스를 사용하려면 인스턴스 클래스
		//참조변수가 필요하므로
		//인스턴스클래스 타입의 참조변수에 생성자를 선언해야한다.
	}
	
	void instanceMethod() {
		//인스턴스는 자유롭게 접근이 가능하다
		StaticInner obj = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
