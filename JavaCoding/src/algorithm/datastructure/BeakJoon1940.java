package algorithm.datastructure;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
public class BeakJoon1940 {
	
	//...코딩문제 풀때 정렬도 만들어서 풀어야하는줄 알았다..
	public static void Sort(int[] arr,int left,int right) {
		//머지 정렬로 정렬해보겠다.
		mergeSort(arr,left,right);
	}
	private static void mergeSort(int[] arr,int left,int right) {
		
		//두개로 나눌때 길이가 2이상일경우에만 분할한다.
		if( left < right ) {
			//중간값을 구해서 좌우로 나눈다.
			int mid = left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			//다 분할이 되서 안나눠지면 병합을 한다.
			merge(arr,left,mid,right);
		}
	}
	
	private static void merge(int[] arr,int left,int mid,int right) {
		
		int leftIndex = left;
		int rightIndex = mid+1;
		int sortedIndex = left;
		int[] sortedArrayTmp = new int[right+1];
		
		//이제 비교를 해보자
		//두 배열을 비교해서 왼쪽이나 오른쪽이 끝보다 커질때까지 한다.
		while(leftIndex<=mid && rightIndex<=right) {
			if(arr[leftIndex]<=arr[rightIndex]) {
				sortedArrayTmp[sortedIndex++]=arr[leftIndex++];
			}
			else {
				sortedArrayTmp[sortedIndex++]=arr[rightIndex++];
			}
		}
		
		//한쪽이 다 들어갔을경우 나머지는 그대로 뒤에 붙여준다.
		if ( leftIndex > mid )
			for(int i=rightIndex ; i<=right ; i++)
				sortedArrayTmp[sortedIndex++]=arr[i];
		else
			for(int i=leftIndex ; i<=mid ; i++)
				sortedArrayTmp[sortedIndex++]=arr[i];
		
		//다 정렬이 끝났으면 정렬된 복사배열을 원조배열에 붙여넣는다.
		for(int i=left ; i<=right ; i++) {
			arr[i]=sortedArrayTmp[i];
		}
		
	}//merge end
	
	
	public static void main(String[] args) throws IOException{
		
		/*
		슈도코드 작성하기
		N(재료의 개수,길이)
		M(갑옷이 되는 번호 = 합)
		for(N만큼 반복){
			재료 배열 저장
		}
		while(i<j){
		//두개가 차이가 하나라도 있을때까지 반복한다
		만들어진 배열 int[] arr;
		arr[i]+arr[j] 크면
		j--
		arr[i]+arr[j] 같으면
		i++ ,j--
		count++
		arr[i]+arr[j] 작으면
		i++
		}
		출력
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer stz = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(stz.nextToken());
		}
		Sort(arr,0,N-1);
		int i=0;
		int j=N-1;
		int count = 0;
		while(i<j) {
			
			if(arr[i]+arr[j]>M) {
				j--;
			}
			else if(arr[i]+arr[j]==M) {
				i++; j--; count++;
			}
			else {
				i++;
			}
		}
		
		System.out.println(count);
		
		br.close();
	}
}

//말 나온김에 만들어서풀어보자
/*
지금까지 공부한 정렬방법은 4개
병합정렬,선택정렬,버블정렬,삽입정렬
병합정렬을 제외하고 빅오는 다 N^2이고
주어진 시간은 2초이기 때문에 병합정렬을 사용해야한다.
*/
