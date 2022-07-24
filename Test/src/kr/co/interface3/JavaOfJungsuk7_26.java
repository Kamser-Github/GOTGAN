package kr.co.interface3;

public class JavaOfJungsuk7_26 {

	public static void main(String[] args) {
		Outer3 out3 = new Outer3();
		Outer3.Inner inner = out3.new Inner();
		inner.method1();
	}
}

class Outer3 {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println("   value : "+value);
			System.out.println(" this.value : "+this.value);
			System.out.println("Outer.this.value : "+Outer3.this.value);
		}
	} // Inner클래스의 끝 } // Outer클래스의 끝
}