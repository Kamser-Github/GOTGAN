package kr.co.innerclass;
class Outer{
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv =300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerClass04 {
	
	public static void main(String[] args) {
		
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv :"+ii.iv);
		System.out.println(Outer.StaticInner.cv);
		
		//����ƽ ������ �ν��Ͻ� ������ �ٽ� �ν��Ͻ��� �����ؼ� �����;��Ѵ�
		Outer.StaticInner si = new Outer.StaticInner();
		//static�� �׳� ������ �����ѵ� iv�� ��������
		//�ν��Ͻ��� �����ؼ� �ʱ�ȭ�� ������ϰ� �׷���
		//�ܺ�Ŭ������ �����ؼ� �� Ŭ������ ����Ŭ���� Ÿ���� ������
		//��Ƽ� �����ؾ��Ѵ�.
		
	}
}
