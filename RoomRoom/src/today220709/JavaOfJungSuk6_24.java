package today220709;

public class JavaOfJungSuk6_24 {
	// 절대값을 반환해라.
	public static int abs(int num) {

		num = num >= 0 ? num : -num;
		return num;

	}

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + " 의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + " 의 절대값:" + abs(value));
	}
}
