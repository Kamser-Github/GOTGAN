package k220719;

public class SuperTest01 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.method(); //child method
		Child c = new Child();
		c.method(); //child method
		
		//p.method2(); // �̰� �ƺ�
		//c.method2(); // �̰� �Ƶ�
		
		//���� static�ż���� Ŭ������.�żҵ�� ȣ���ؾ�
		//������ �Ȼ����.
		/*����,�ڼ��� �������� ���������� Ÿ�Կ� ���� ���󰣴�.
		 * ������ �ż���� �������̵��� �Ǿ� ���� ȣ���� �ص� �ڼղ��ΰ���.
		 * ����ƽ�ż���� ���������� ���� �޶����Ƿ� Ŭ������.�ż���
		 * �� ȣ���ؾ��Ѵ�.
		 */
	}
}

class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parant Method");
	}
	
	static void method2() {
		System.out.println("�̰� �ƺ���");
	}
}


class Child extends Parent{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
	static void method2() {
		System.out.println("�̰� �Ƶ��̰�");
	}
}