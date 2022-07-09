package today220709;

public class JavaOfJungSuk6_20 {

	// shuffle 매서드를 작성하시오
	static int[] shuffle(int[] arr) {
		int tmp = 0;
		int shuffle = (int)(Math.random()*10)+1;
		for(int i = 0 ; i <arr.length; i++) {
		tmp	= arr[i];
		arr[i] = arr[shuffle];
		arr[shuffle] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {

		{
			int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			System.out.println(java.util.Arrays.toString(original));
			int[] result = shuffle(original);
			System.out.println(java.util.Arrays.toString(result));
		}

	}
}
