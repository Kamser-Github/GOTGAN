package k220719;

public class SuperTest02 {
	
	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		Child1  c1 = new Child1();
	
		System.out.println("p.x = " + p1.x);
		p1.method();
		System.out.println();
		System.out.println("c.x = " + c1.x);
		c1.method();
		
		//�����غ���.
		//p1.x = 100
		//c1.x = 200
		//p1.�޼ҵ�� c1���� ������
		//c1�� �޼ҵ�� 1.x = 100�̶�� �����ߴµ� 200�̴�
		//���� �ν��Ͻ� ���� x�� this.x�̱� ������
		//this�� ������ �����ϹǷ� 200�� ����
	}
}


class Parent1{
	int x = 100;
	
	void method() {
		System.out.println("�ƺ���");
	}
}

class Child1 extends Parent1{
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);  // this.x�� ����.
		System.out.println("super.x=" + super.x);
		System.out.println("this.x="  + this.x);
	}
}