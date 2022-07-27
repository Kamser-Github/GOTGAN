package day3.methodlab;

public class MethodLab4 {
	
	public static int maxNumArray(int[] arr) {
		
		int max = arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			if(max<arr[i]) max=arr[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[][] arrs = {
				{10,20,30},
				{100,500,300,200,400},
				{1,10,3,4,5,8,7,6,9,2}
		};
//		int[] arr1 = {10,20,30};
//		int[] arr2 = {100,500,300,200,400};
//		int[] arr3 = {1,10,3,4,5,8,7,6,9,2};
		
		for(int i=0 ; i<arrs.length ; i++) {
			System.out.println("가장 큰 값은 "+maxNumArray(arrs[i])+"입니다");
		}
		
	}
}
