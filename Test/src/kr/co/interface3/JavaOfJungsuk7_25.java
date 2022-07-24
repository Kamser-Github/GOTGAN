package kr.co.interface3;

public class JavaOfJungsuk7_25 {

	public static void main(String[] args) { 
		//iv²¨³»¿À±â
		Outer out = new Outer();
		Outer.Inner out2 = out.new Inner();
		System.out.println(out2.iv);
	}
}

class Outer {
	class Inner {
		int iv = 100;
	}
}