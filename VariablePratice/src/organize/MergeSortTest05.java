package organize;

public class MergeSortTest05 {
	
	//key in하면서 다시 되짚어보기.
	//pubilc static 으로 함수만 보여주기
	public static void sort(int[] arr,int left,int right) {
		margeSort(arr,left,right);
	}
	
	private static void margeSort(int[] arr,int left,int right) {
		
		//병합정렬
		//중앙 인덱스 구하기
		//배열을 나눌수 있을 경우에만 실행
		int mid = 0;
		if(left < right) {
			mid = (left+right)/2;
			margeSort(arr,left,mid);
			margeSort(arr,mid+1,right);
			marge(arr,left,mid,right);
		}
	}
	
	private static void marge(int[] arr,int left,int mid,int right) {
		
		//변수 선언 : 변수명으로 무슨 역할인지 알수있게 하자
		//왼쪽 데이터 부터 시작될 인덱스
		int leftIndex = left;
		//오른쪽 데이터 부터 시작될 인덱스
		int rightIndex = mid+1;
		//복사할 배열 인덱스
		int tmpIndex = left;
		//정렬된 임시 저장 공간 배열
		int[] tmpSortedArray = new int[right+1];
		
		//왼쪽 배열 인덱스가 mid를 넘거나 오른쪽 배열 인덱스가 right를 넘으면
		//나머지는 그대로 붙여 넣으면 된다.
		while(leftIndex<=mid && rightIndex<=right) {
			//오름차순 정렬
			if(arr[leftIndex]<=arr[rightIndex]) {
				tmpSortedArray[tmpIndex++]=arr[leftIndex++];
			}
			else {
				tmpSortedArray[tmpIndex++]=arr[rightIndex++];
			}
		}
		
		//왼쪽 배열을 다 넣었거나 오른쪽 배열을 다 넣었다면
		//남은걸 다 임시 배열에 넣어준다.
		if(leftIndex>mid) {
			for(int i=rightIndex; i<=right; i++) {
				tmpSortedArray[tmpIndex++]=arr[i];
			}
		}
		else {
			for(int i=leftIndex; i<=mid; i++) {
				tmpSortedArray[tmpIndex++]=arr[i];
			}
		}
		
		//다 정리된 배열을 다시 arr배열에 넣어준다.
		//이때 i값이 left인 이유는 int[]배열의 처음지점이 다 다르기 때문이다.
		for(int i=left; i<=right; i++) {
			arr[i]=tmpSortedArray[i];
		}
	}
}
