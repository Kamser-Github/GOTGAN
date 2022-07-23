package kr.co.innerclass;

public class InnerClass06 {
	
	Object iv = new Object() { void method(){} };
	static Object cv = new Object() { void method() {} };
	
	void myMethod() {
		Object lv = new Object() { void method() {}	};
	}
	
	//익명 클래스
	
}
