package practic0710;

public class VariablePractice2 {

	public static void main(String[] args) {

		double d = 85.4;
		int score = (int) d;

		System.out.println(score);
		// 소수 점이 사라진다.

		int num1 = 300;
		byte num2 = (byte) num1;
		System.out.println(num2); // 300 이 44로 내려간다.
		// 값손실이 생긴다.

		float f = 9.1234567f;
		double dnum = 9.1234567;
		double dnum2 = (double) f;

		System.out.printf("f =%20.18f\n", f);
		System.out.printf("dnum =%20.18f\n", dnum);
		System.out.printf("dnum2 =%20.18f\n", dnum2);
		/*
		 * f =9.123456954956055000 
		 * dnum =9.123456700000000000 
		 * dnum2=9.123456954956055000
		 *f와 dnum, dnum2에 저장한 값은 같지만.
		 *실제로 나온 값은 다르다.
		 *또하나 %20.18%f 는 총 표시 숫자느 20자 중에서
		 *18자는 소수자리를 표현해달라는거다.
		 */

	}
}
