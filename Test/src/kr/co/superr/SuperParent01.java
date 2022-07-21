package kr.co.superr;

public class SuperParent01 {
	
	public static void main(String[] args) {
		
		Parent02 p1 = new Parent02();
		Parent02 cp1 = new Child02();
		Parent02 c1 = new Child02();
		Child02 rc1 = new Child02();
		
		p1.methodBark();
		//메소드는 조상클래스가 아니라 인스턴스상속된 매소드를 따라간다.
		cp1.methodBark();
		c1.methodBark();
		
		//static 메소드 확인 참조타입에 있는 스태틱을 따라간다.
		//만약에 참조변수타입에 없으면 안따라 간다.
//		p1.methodTest();
//		cp1.methodTest();
//		c1.methodTest();
//		rc1.methodTest();
		
		//static은 클래스명으로 한다.
		Parent02.methodTest();
		
		//
		rc1.checkPoint();
	}
	
}


class Parent02{
	
	private static int xx= 150;
	private int x = 100;
	
	public void methodBark() {
		System.out.println("부모님꺼");
	}
	
	public static void methodTest() {
		System.out.println("소리 질러");
	}
	
	//getter
	public int getIntX() {return x;}
}

class Child02 extends Parent02{
	
	private static int xx= 350;
	private int x = 200;
	
	
	@Override
	public void methodBark() {
		System.out.println("아들꺼");
	}
	
	public static void methodTest() {
		System.out.println("소리 지르지마 ~");
	}
	//getter
	public int getIntX() {
		return x;
	}
	
	public void checkPoint() {
		System.out.println("x = "+this.getIntX());
		System.out.println("x = "+this.x);
		System.out.println("x = "+super.getIntX());
	}
}