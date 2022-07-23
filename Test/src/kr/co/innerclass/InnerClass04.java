package kr.co.innerclass;
class Outer{
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv =300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerClass04 {
	
	public static void main(String[] args) {
		
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv :"+ii.iv);
		System.out.println(Outer.StaticInner.cv);
		
		//스태틱 내부의 인스턴스 변수는 다시 인스턴스를 선언해서 가져와야한다
		Outer.StaticInner si = new Outer.StaticInner();
		//static은 그냥 접근이 가능한데 iv를 만나려면
		//인스턴스를 생성해서 초기화를 해줘야하고 그러면
		//외부클래스를 생성해서 그 클래스의 내부클래스 타입의 변수에
		//담아서 접근해야한다.
		
	}
}
