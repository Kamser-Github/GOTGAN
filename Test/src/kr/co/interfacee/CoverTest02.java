package kr.co.interfacee;

public class CoverTest02 {
	
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		C01	c = new C01();
		a.method(c);
	}
}

class A01{
	public void method(I01 i) {
		i.method();
	}
}


class B01 implements I01{
	public void method() {
		System.out.println("鹅侩鹅侩");
	}
}

class C01 implements I01{
	public void method() {
		System.out.println("况劳况劳");
	}
}

interface I01{
	void method();
}