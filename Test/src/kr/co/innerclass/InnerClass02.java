package kr.co.innerclass;

public class InnerClass02 {
	
	class InstanceInner{}
	static class StaticInner{}
	
	// �ν��Ͻ� ��������� ���� ���� ������ �����Ϥ���.
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		//static ����� �ν��Ͻ� ����� ���������� �Ұ����ϴ�.
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		InnerClass02 obj3 = new InnerClass02();
		InstanceInner obj1 = obj3.new InstanceInner();
		//Ŭ���� ������ �ν��Ͻ� ������ �����Ϸ���
		//���������� ���ؼ� ������ �ؾ��ϴµ�
		//���������� Ŭ�����ϱ� Ŭ���� Ÿ�Կ� ������ ���
		//�ٽ� �ν��Ͻ� Ŭ������ ����Ϸ��� �ν��Ͻ� Ŭ����
		//���������� �ʿ��ϹǷ�
		//�ν��Ͻ�Ŭ���� Ÿ���� ���������� �����ڸ� �����ؾ��Ѵ�.
	}
	
	void instanceMethod() {
		//�ν��Ͻ��� �����Ӱ� ������ �����ϴ�
		StaticInner obj = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}
