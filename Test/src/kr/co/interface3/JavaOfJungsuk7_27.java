package kr.co.interface3;

public class JavaOfJungsuk7_27 {

	public static void main(String[] args) {
		// iv²¨³»¿À±â
		Outer2.Inner out2 = new Outer2.Inner();
		System.out.println(out2.iv);
	}
}

class Outer2 {
	static class Inner {
		int iv = 200;
	}
}