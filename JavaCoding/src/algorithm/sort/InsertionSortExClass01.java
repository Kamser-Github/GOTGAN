package algorithm.sort;
import java.util.Comparator;
public class InsertionSortExClass01 {
	
	public static <T extends Comparable<? super T>> void sort(T[] arr) {
		/*
		extends Comparable<? super T> 뜻은
		Comparable을 구현한 T포함 조상은 다 들어올수 있다는 뜻이다.
		*/
		T tmp = null;
		int compareIndex = 0;
		
		for(int i=1; i<arr.length ; i++) {
			tmp = arr[i];
			compareIndex = i-1;
			
			while(compareIndex >=0 && (arr[compareIndex]).compareTo(tmp)>0) {
				//compareTo는 오브젝트를 비교해서 왼쪽이 크면 1
				//같으면 0 오른쪽이 크면 음수가 나온다.
				//즉 index는 0보다 작으면 안돼고
				//compareIndex 할당값이 tmp보다 크다면 순서를 바꾸겟다는 뜻이다.
				//기본 오름차순 정렬이다.
				arr[compareIndex+1] = arr[compareIndex];
				compareIndex--;
			}
			
			arr[compareIndex+1] = tmp;
		}
	}
	/*
	오버로딩:
		반환타입,매개변수이름은 상관없고
		매개변수 개수와,매개변수 타입이 다를경우 같은 이름의 매서드를 사용할수있다.
	*/
	public static <T> void sort(T[] arr,Comparator<? super T> comp) {
 //public static <T extends Comparator<? super T>> void sort(T[] arr,Comparator<T> comp) {
 //지네릭 메서드에서 제한을 하면 뒤에있는 매개변수는 다 Comparator를 구현해야하는데
 //arr은 구현하지 않았기 때문에 적용이 안됐고 , comp는 기준을 새로 정의 한것이기 때문에
 //comparator를 구현해서 정렬한것이다.
		T tmp = null;
		int compareIndex = 0;
		
		for(int i=1 ; i<arr.length ; i++) {
			tmp = arr[i];
			compareIndex = i-1;
			
			while(compareIndex>=0 && comp.compare(arr[compareIndex], tmp)> 0) {
				//compare 기준이 양수면 순서를 바꾸겠다는건데
				//compare 기준점을 어떻게 바꾸냐에 따라서
				//오름차순이 될수도있고, 내림차순이 될수도 있다.
				arr[compareIndex+1] = arr[compareIndex];
				compareIndex--;
			}
			
			arr[compareIndex+1] = tmp;
		}
		
	}
}
