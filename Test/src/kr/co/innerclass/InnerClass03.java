package kr.co.innerclass;

public class InnerClass03 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		//����ƽ�� �ν��Ͻ� ����� ���� �Ҽ��� ����.
		//����Ϸ��� ���������� ���ؼ� �����ؾ��Ѵ�,
		InnerClass03 obj1 = new InnerClass03();
		int cv2 = obj1.outerIv;
		//����ƽ ������ �����Ӱ� ��밡��
		static int cv1 = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			//���������� ������ �Ұ����ϳ�
			//����� ���Ǯ���� ���� ���� �ϹǷ� 
			//����� ������ �����ϴ�.
			int liv3 = LV;
		}
	}
}
