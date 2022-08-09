package algorithm.datastructure;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class BeakJoon1253 {
	
	public static void main(String[] args) throws Exception{
		/*
		백준 1253번 문제
		배열의 길이 N 1~2000;
		수의 범위 절대값< 10억;
		2000*2000이라 n^2이 시간복잡도가 될거같지만
		최종시간 복잡도는 *n이 더해지기때문에
		nlogn의 시간복잡도를 가진 알고리즘을 사용해야함
		주의사항 자기자신을 좋은수 만드는데 포함하면 안된다.
		좋은수란 다른 두 정수의 합이 배열안에 있으면 좋은수라고 한다.
		Q)좋은수'구하기
		
		i,j값을 더해서 크면 j--
		i,j값을 더해서 같으면 count++ 멈춘다 (k는 한번찾으면 상관없어진다)
				이때 조건에 i==k,j==k이면 좋은수 조건에 걸리므로
				i++,j++
		i,j값을 더해서 작으면 i++
		
		*/
		/*
		슈도코드 작성
		N 배열의 길이
		int arr[] = new int[N] 초기화
		for( i 0~N-1 까지 반복)
		arr[]에 배열 받기
		
		arr 정렬하기 
		
		for(k를 0부터 N미만까지 반복)
		arr[k] = find 찾는수
		i=0; 최소값
		j=N-1; 맥스값
		while(i<j) 포인터가 겹치거나 반대가되면 종료
		if(arr[i]+arr[j]==find)
		 i와 j가 하나라도 k와 같으면 안된다.
		 그러면 count++,break로 while문종료
		 그리고 하나라도 k와 겹치면 ++,--
		else if arr[i]+arr[j]>find
			j--하고
		else i++
		while문 반복
		
		★시간복잡도가 아직은 미숙한데 자바에서 제공하는 정렬
		Arrays 최악일경우 n^2
		Collections 최악일경우 nlogn <이걸쓰려면 Comparator를 구현해야함
		그래서 지금음 Arrays를 사용할예정
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//배열 길이 받기
		int N = Integer.parseInt(br.readLine());
		long[] arr = new long[N];
		StringTokenizer stz = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Long.parseLong(stz.nextToken());
		}
		//정렬하기
		Arrays.sort(arr);
		//좋은수 개수 카운트
		int count = 0;
		
		//for문
		for(int k=0 ; k<N ; k++) {
			//최소값(인덱스)
			int i=0;
			//최대값(인덱스)
			int j=N-1;
			//좋은수.
			long find = arr[k];
			
			while(i<j) {
				if(arr[i]+arr[j]==find) {
					if(i!=k && j!=k) {
						count++;
						break;
					} else if (i==k) {
						i++;
					} else if (j==k) {
						j--;
					}
				} else if(arr[i]+arr[j]>find) {
					j--;
				} else {
					i++;
				}
			}//while end
			
		}//for end
		System.out.print(count);
		br.close();
	}//main end
}
