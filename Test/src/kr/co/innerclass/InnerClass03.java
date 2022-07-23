package kr.co.innerclass;

public class InnerClass03 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
		//스태틱은 인스턴스 멤버에 접근 할수가 없다.
		//사용하려면 참조변수를 통해서 접근해야한다,
		InnerClass03 obj1 = new InnerClass03();
		int cv2 = obj1.outerIv;
		//스태틱 변수는 자유롭게 사용가능
		static int cv1 = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			//지역변수는 접근이 불가능하나
			//상수는 상수풀에서 대입 복사 하므로 
			//상수는 접근이 가능하다.
			int liv3 = LV;
		}
	}
}
