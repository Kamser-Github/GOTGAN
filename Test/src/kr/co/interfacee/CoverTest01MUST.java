package kr.co.interfacee;

public class CoverTest01MUST {
	public static void main(String[] args) {
		A a = new A();
		I i = new C();
		a.methodB(i);
	}
}
/*
 * A�� B�� �޼��峪 ������ ����� ȣ���Ҷ�
 * ���������� A�� B�� ���������� �޾Ƽ� ȣ�����ϸ�
 * �ż����� ������ ��ü�ϰ� ������ 
 * A�� �Ű������� ���ڷ� ���� �����ڵ� �ٲ����Ѵ�.
 * �������̽��� �̿��ϰ� �Ǹ�
 * A - I    I - B
 * �� ������ �Ǿ��־
 * I�� ����� ���� ��ü���ָ� �ȴ�.
 */


class A{
	
	public void methodB(I i) {
		i.method();
	}
}



interface I {
	public abstract void method();
}

class B implements I{
	
	public void method() {
		System.out.println("�߿�");
	}
}

class C implements I{
	
	public void method() {
		System.out.println("�߿���");
	}
}