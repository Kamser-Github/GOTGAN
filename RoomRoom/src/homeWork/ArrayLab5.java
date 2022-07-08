package homeWork;

public class ArrayLab5 {
	public static void main(String[] args) {

		int[] arr = new int[10];
		char[] crr = new char[10];
		String arrDir = "";
		String crrDir = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 26) + 1;
			crr[i] = (char) (arr[i] + 64);

			arrDir += arr[i];
			crrDir += crr[i];

			if (i == arr.length - 1)
				break;

			arrDir += ",";
			crrDir += ",";

		}

		System.out.println(arrDir);
		System.out.println(crrDir);

	}

}
