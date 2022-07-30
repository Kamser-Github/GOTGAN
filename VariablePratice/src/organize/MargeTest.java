package organize;

public class MargeTest {
	//key in
	//조건식을 상수로 두고 사용
	//매서드에서 계산식은 private로 숨기기
	//변수명만 봐도 무슨 변수인지 알수있게 하기.
	private static final int MAX_COUNT = 30;
	
	public static void main(String[] args) {
		
		int[] arr = new int[MAX_COUNT];
		for(int i=0; i<MAX_COUNT; i++) {
			//0~MAX_COUNT 범위내의 난수 생성
			arr[i] = (int)(Math.random()*MAX_COUNT);
		}
		
		System.out.println("정렬전 데이터");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("정렬 후 데이터 (오름차순)");
		int[] ascSortedArrayTest = arr.clone();
		MergeSortTest04.sort(ascSortedArrayTest, 0, ascSortedArrayTest.length-1);
		for(int i : ascSortedArrayTest) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
