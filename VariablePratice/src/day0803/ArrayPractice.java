package day0803;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[][] arr2D = { { 11, 12, 13 }, { 14, 15, 16 } };

		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("arr2D="+ Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr,3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr2="+ Arrays.toString(arr2));
		System.out.println("arr3="+ Arrays.toString(arr3));
		System.out.println("arr4="+ Arrays.toString(arr4));
		System.out.println("arr5="+ Arrays.toString(arr5));
		System.out.println("arr6="+ Arrays.toString(arr6));

		int[] arr7 = new int[5];
		Arrays.fill(arr7,9);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		arr7 = new int[] {1, 2, 3, 4, 5 };
		for(int i : arr7) {
			char[] graph = new char[i];
			System.out.println(new String(graph)+i);
			Arrays.fill(graph,'*');
			System.out.println(new String(graph)+i);
		}
		
	}
}