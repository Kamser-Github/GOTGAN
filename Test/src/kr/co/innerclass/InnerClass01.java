package kr.co.innerclass;


public class InnerClass01 {
	
	class InstanceInner{
		int iv = 100;
//		static int cv= 100; �ȵȴ�. 
//		����ƽ�� �ν��Ͻ��� ������ ���Ŀ� ����� �����Ҽ��� ����.
		final static int CONST = 100; // final�� ���� ����� �����ϴ� , 
		//���Ǯ�� ���� ����Ǿ��ֱ⶧����
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; //����ƽ�� ����� �����ϴ�.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
			//static int cv = 300;
			final static int CONST = 300;
			//CONST�� ����̹Ƿ� ���
			//���Ǯ�� ���� ����Ǿ��־ �������ٰ� �����ϸ��.
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
