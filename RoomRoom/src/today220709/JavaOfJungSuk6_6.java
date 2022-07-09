package today220709;

public class JavaOfJungSuk6_6 {
	//// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) {
		// 아래부터 코드 작성
		int a = x - x1;
		int b = y - y1;
		return Math.sqrt(a * a + b * b);

	}

	// 6-6
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));

	}
}
