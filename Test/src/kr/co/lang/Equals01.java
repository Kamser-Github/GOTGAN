package kr.co.lang;

public class Equals01 {
	
	//equal은 인스턴스 주소를 비교한다.
	//그런데 String이나 Integer는 이미 오버라이딩되어있어서 값을비교한다.
	int x;
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Equals01) {
			Equals01 eq = (Equals01)obj;
			if(x == eq.x) {
				return true;
			}
			else return false;
		}
		return false;
	}
}
