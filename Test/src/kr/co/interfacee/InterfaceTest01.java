package kr.co.interfacee;

public class InterfaceTest01 {
	public static void main(String[] args) {
		//�������̽��� ���ٸ�
		//A�� B�� ���� ȣ���Ҷ�
		//�ʿ��Ѱ� B�� ��������
		//1.�ش� Ŭ������ �ʱ�ȭ �ؼ� ����ְų�
		//2.���������� ����ͼ� ���ų�.
		
		A02 a = new A02();
		//B02 b = new B02();
		//a.method(b);
		//a.method(new B02()); �ΰ���
		//a.method(new C02()); ��ӹ��� �ֵ� �ǰ�
		
		//�޼ҵ��� ������ ��ü�ϰ������
		//A�޼ҵ��� �Ű����� Ÿ�Ե� �ٲ���ϰ�
		//���ڷ� �ִ� ��������Ÿ�Ե� �����ؾ��Ѵ�.
		
		//�׷��� �������̽��� �߰� �ٸ������� �ϸ� ����������.
		
		a.method(new B02());
		a.method(new C02());
		
		//�������̽��� ������ �ֵ��� ��� ������.
	}
}

class A02{
	public void method(D02 d) {
		d.method();
	}
}

class B02 implements D02{
	public void method() {
		System.out.println("�߾�");
	}
}

class C02 extends B02 implements D02{
	public void method() {
		System.out.println("����ȣ");
	}
	
}

interface D02{
	public abstract void method();
}