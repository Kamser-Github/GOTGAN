package homeWork;

public class ArrayLab1 {

	public static void main(String[] args) {

		int[] ary = new int[10];

		for (int a : ary)
			System.out.print(a + " ");
		for (int i = 1; i < ary.length + 1; i++)
			ary[i - 1] = 10 * i;

		System.out.println();

		for (int a : ary)
			System.out.print(a + " ");

		System.out.println();

		for (int i = ary.length; i > 0; i--) {
			System.out.print(ary[i - 1] + " ");
		}

		System.out.println();

		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 20 == 0)
				System.out.print(ary[i] + " ");
		}
	}

}
