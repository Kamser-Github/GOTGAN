package kr.co.innerclass;


public class InnerClass01 {
	
	class InstanceInner{
		int iv = 100;
//		static int cv= 100; 안된다. 
//		스태틱은 인스턴스가 생성된 이후에 사용이 가능할수가 없다.
		final static int CONST = 100; // final이 붙은 상수는 가능하다 , 
		//상수풀에 따로 저장되어있기때문에
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //스태틱은 사용이 가능하다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300;
			final static int CONST = 300;
			//CONST는 상수이므로 허락
			//상수풀에 따로 저장되어있어서 꺼내쓴다고 생각하면됨.
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
