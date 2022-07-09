package today220709;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x, int y) {

		int num = this.x - x;
		int num2 = this.y - y;
		return Math.sqrt(num * num + num2 * num2);

	}
}

public class JavaOfJungSuk6_7 {
	//// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	// 6-7
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}
}
