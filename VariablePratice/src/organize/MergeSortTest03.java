package organize;

public class MergeSortTest03 {
	
	public static void main(String[] args) {
		
		int[] numArr = {9,1,8,5,4,7,6,3,2};
		//복사 배열 만들기
		//merge 매서드
		//프린트 매서드
		mergeSort(numArr,0,numArr.length-1);
		
		for(int a : numArr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int[] a,int start,int end) {
		
		//복사 배열을 만들기
		tmp = new int[a.length];
		//재귀함수 return 만들기
		if(start==end) return;
		
		//반 지점 변수 만들기
		int mid = start+(end-start)/2;
		
		//재귀 함수 시작
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);//start = mid+1이 된다.
		
		//정렬하면서 병합하기
		merge(a,start,end);
		
	}
	
	public static void merge(int[] arr,int start,int end) {
		
		//병합하기
		int left = start;
		int mid = (start+end)/2;
		int right = mid+1;
		int idx = start;//좌표
		
		//둘다 끝지점을 안넘었을경우에 비교
		if(left<=mid && right<=end) {
			if(arr[left]<arr[right]) {
				tmp[idx++]=arr[left++];
			}else {
				tmp[idx++]=arr[right++];
			}
		}
		//둘중 하나라도 끝지점에 닿았을 경우 
		//나머지 다 넣어주기
		else if(left>mid) {
			while(right<=end) {
				tmp[idx++]=arr[right++];
			}
		}else {
			while(left<=mid) {
				tmp[idx++]=arr[left++];
			}
		}
		//다 넣은후
		for(int i=0 ; i<=end ; i++) {
			arr[i]=tmp[i];
		}
		
	}
	
}
