package homeWork;

public class ArrayLab2 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int total = 0;
		String arrDir = "";

		for (int a = 0; a < arr.length; a++) {
			arr[a] = (int) (Math.random() * 17) + 4;
			total += arr[a];
			arrDir += arr[a];
			if (a == arr.length - 1)
				break;
			arrDir += ",";
		}
		System.out.println("모든 원소의 값 : " + arrDir);
		System.out.println("모든 원소의 합 : " + total);

	}

}
