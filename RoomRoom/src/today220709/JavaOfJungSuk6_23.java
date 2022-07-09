package today220709;

public class JavaOfJungSuk6_23 {

	// 주어진 배열중에서 제일 큰 값을 반환한다.
	// 배열이 null이거나 크기가 0인경우 -999999을 반환한다.
	public static int max(int[] arr) {
		if(arr==null || arr.length ==0) return -9999999;
		int maxNum = 0;
		for(int i = 0 ; i < arr.length ; i ++) {
			if(maxNum < arr[i]) maxNum = arr[i];}
		return maxNum;
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 :" + max(data));
		System.out.println("최대값 :" + max(null));
		System.out.println("최대값  :" + max(new int[] {})); // 0 최대값 크기가 인 배열

	}
}
