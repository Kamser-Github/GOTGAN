package algorithm.sort;
import algorithm.sort.InsertionSortEx01;
public class SortTest01 {
	
	private static final int MAX_NUMBER = 30;
	
	public static void main(String[] args) {
		
		int[] arr = new int[MAX_NUMBER];
		
		//난수 대입
		for(int i=0; i<MAX_NUMBER ; i++) {
			arr[i] = (int)(Math.random()*MAX_NUMBER)+1;
		}
		
		//정렬전 출력
		System.out.println("= 삽입정렬 전 배열 =");
		int[] insertionCloneArray = arr.clone();
		for(int a : insertionCloneArray) {
			System.out.print(a+" ");
		}
		System.out.println();
		/*
		= 삽입정렬 전 배열 =
		14 2 3 15 2 8 24 7 21 9 22 8 25 26 27 14 20 3 19 10 16 28 4 3 17 13 7 8 26 16  
		*/
		
		//오름차순 정렬
		InsertionSortEx01.insertionSort(insertionCloneArray, true);
		System.out.println("= 삽입정렬 오름차순 =");
		for(int a : insertionCloneArray) {
			System.out.print(a+" ");
		}
		System.out.println();
		//1 2 3 5 6 6 8 9 11 12 14 14 15 15 23 23 23 25 25 25 26 26 27 27 27 27 28 30 30 30
		
		//내림차순 정렬
		InsertionSortEx01.insertionSort(insertionCloneArray, false);
		System.out.println("= 삽입정렬 내림차순 =");
		for(int a : insertionCloneArray) {
			System.out.print(a+" ");
		}
	}
}
