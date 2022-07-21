package kr.co.superr;

public class SuperParent01 {
	
	public static void main(String[] args) {
		
		Parent02 p1 = new Parent02();
		Parent02 cp1 = new Child02();
		Parent02 c1 = new Child02();
		Child02 rc1 = new Child02();
		
		p1.methodBark();
		//�޼ҵ�� ����Ŭ������ �ƴ϶� �ν��Ͻ���ӵ� �żҵ带 ���󰣴�.
		cp1.methodBark();
		c1.methodBark();
		
		//static �޼ҵ� Ȯ�� ����Ÿ�Կ� �ִ� ����ƽ�� ���󰣴�.
		//���࿡ ��������Ÿ�Կ� ������ �ȵ��� ����.
//		p1.methodTest();
//		cp1.methodTest();
//		c1.methodTest();
//		rc1.methodTest();
		
		//static�� Ŭ���������� �Ѵ�.
		Parent02.methodTest();
		
		//
		rc1.checkPoint();
	}
	
}


class Parent02{
	
	private static int xx= 150;
	private int x = 100;
	
	public void methodBark() {
		System.out.println("�θ�Բ�");
	}
	
	public static void methodTest() {
		System.out.println("�Ҹ� ����");
	}
	
	//getter
	public int getIntX() {return x;}
}

class Child02 extends Parent02{
	
	private static int xx= 350;
	private int x = 200;
	
	
	@Override
	public void methodBark() {
		System.out.println("�Ƶ鲨");
	}
	
	public static void methodTest() {
		System.out.println("�Ҹ� �������� ~");
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