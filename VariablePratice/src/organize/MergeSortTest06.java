package organize;

public class MergeSortTest06 {
	
	private static int[] tmpSortedArray;
	//정렬하는 배열을 꺼내는건 public
	public static void sort(int[] arr,int left,int right) {
		tmpSortedArray = new int[arr.length];
		mergeSort(arr,left,right);
		//나머지 계산식은 꺼내지 못하게 한다.
	}
	
	//병합 정렬
	//정렬하는 매서드는 여기 클래스에서만 쓰이게 할거기 때문에 
	//private으로 감추고 여기 내에서만 문제를 해결하면되기때문에
	//다른 경우의수까지 생각을 안해도 된다.
	private static void mergeSort(int[] arr,int left,int right) {
		int mid = 0; //지역변수 초기화는 꼭 ㅐㅎ줘야한다.
		//재귀함수의 조건식
		if(left < right) { //즉 자른 매서드가 두칸 이상이라면
			
			mid = left+(right-left)/2;//Overflow때문이라는데 이유를 모르겟음
			mergeSort(arr,left,mid);//왼쪽 데이터 분할
			mergeSort(arr,mid+1,right); //오른쪽 데이터 분할
			merge(arr,left,mid,right); //더이상 나눌수없을때 합병정렬 시작
			//merge 차례가 어떻게 오는지 궁금했엇는데.
			//결국 함수는 한바퀴를 다돌면 return을 반드시 하기 때문이다.
		}
	}
	
	//정렬하고 합병하기
	private static void merge(int[] arr,int left,int mid,int right) {
		
		//변수 선언하기
		//왼쪽 분할 데이터 인덱스
		int leftIndex = left;
		//오른쪽 분할 데이터 인덱스
		int rightIndex = mid+1;//mid까지는 left쪽에 붙어있다.
		//정렬된 배열의 인덱스
		int sortedIndex = left; //0이 아니라 left인 이유는
		//배열이 나누어질때도 left의 값은 유지가 되고있다.
		//배열이 진짜 두조각으로 나누어지는게 아니라 
		//비교를 할수있을때까지 인덱스는 유지한채 나누고 있는것
		//왼쪽부터 시작될때 배열의 크기는 작지만
		//오른쪽으로 갈수록 배열의 순서를 지켜야하기때문에 배열의 길이도
		//따라서 커져야한다.
		
		//왼쪽 분할 데이터와 오른쪽 분할 데이터 인덱스가
		//둘중 하나라도 끝까지 정렬이 되었으면 나머지는 그대로 붙여넣으면된다.
		while(leftIndex<=mid && rightIndex<=right) {
			if(arr[leftIndex]<arr[rightIndex]) {
				tmpSortedArray[sortedIndex++]=arr[leftIndex++];
			}//오른쪽이 크면 왼쪽 분할데이터의 배열을 넣고
			else {//왼쪽이 크면 오른쪽의 분할 데이터를 넣는다.
				tmpSortedArray[sortedIndex++]=arr[rightIndex++];
			}
		}
		
		if(leftIndex>mid) {
			//왼쪽 분할 배열을 다 정렬햇으면 오른쪽은 그냥 넣는다.
			//왜냐하면 이미다 정렬이 되어있는 상태기 때문이다.
			for(int i=rightIndex ; i<=right ; i++) {
				tmpSortedArray[sortedIndex++]=arr[i];
			}
		}
		else {
			for(int i=leftIndex ; i<=mid ; i++) {
				tmpSortedArray[sortedIndex++]=arr[i];
			}
		}//마찬가지로 오른쪽이 다 넣어져있으면 왼쪽도 그냥 다 붙여넣는다.
		
		//다 넣었으면 정렬된 배열을 다시 원래 정렬에 넣는다.
		for(int i=left ; i<=right ; i++) {
			arr[i]=tmpSortedArray[i];
		}
	}
	
}
