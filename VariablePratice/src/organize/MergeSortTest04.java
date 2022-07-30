package organize;

public class MergeSortTest04 {
	//Key in
	public static void sort(int[] arr,int left,int right) {
		mergeSort(arr,left,right);
	}
	
	private static void mergeSort(int[] arr,int left,int right) {
		int mid = 0; // 지역변수는 초기화를 하고 시작
		if(left< right) {
			mid = (left + right)/2; //데이터 리스트의 중앙 인덱스를 구함
			mergeSort(arr,left,mid);//mid기준으로 왼쪽으로 분할
			mergeSort(arr,mid+1,right); //mid기준으로 오른쪽 분할
			merge(arr,left,mid,right); //정복 및 결합 과정 진행
		}
	}
	
	private static void merge(int[] arr,int left,int mid,int right) {
		//분할된 왼쪽 리스트의 시작점 변수
		int leftIndex = left;
		//분할된 오르쪽 리스트의 시작점 변수
		int rightIndex = mid+1;
		//정렬된 데이터가 저장될 인덱스
		int sortedIndex = left;
		//정렬된 데이터를 임시로 저장할곳
		int[] tmpSortedArray = new int[right+1];
		//+1 이유 length니까!
		
		//분할된 왼쪽 리스트의 인덱스가 mid까지 온 경우 왼쪽 정렬 완료
		//분할된 오른쪽 리스트의 인덱스가 right까지 온 경우 오른쪽 정렬 완료
		//즉, 왼쪽 또는 오른쪽 둘중 하나라도 정렬이 완료된 경우 반복문을 나간다.
		
		while(leftIndex<=mid && rightIndex<=right) {
			//오름차순 조건문
			if(arr[leftIndex]<=arr[rightIndex]) {
				tmpSortedArray[sortedIndex++]=arr[leftIndex++];
			}
			else {
				tmpSortedArray[sortedIndex++]=arr[rightIndex++];
			}
		}
		
		//왼쪽 정렬이 다 정렬된 경우 오른쪽 데이터들의 남은 부분들 다 옴겨야함
		if(leftIndex > mid) {
			for(int i=rightIndex; i<=right; i++) {
				tmpSortedArray[sortedIndex++]=arr[i];
			}
		}
		else {
			for(int i=leftIndex; i<=mid; i++) {
				tmpSortedArray[sortedIndex++]=arr[i];
			}
		}
		//원래 배열에 정렬된 데이터를 덮에 씌움
		for(int i=left; i<=right; i++) {
			arr[i]=tmpSortedArray[i];
		}
	}
}
