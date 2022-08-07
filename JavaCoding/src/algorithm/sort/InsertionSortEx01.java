package algorithm.sort;

public class InsertionSortEx01 {
	
	public static void main(String[] args) {
		

		/*
		 4.삽입정렬
		 (오름차순)
		 바로 앞 인덱스 값과 비교해서 작으면 옴기고
		 크면 그대로 있는다.
		 
		 선택정렬은 하나씩 다 비교하고
		 버블정렬은 flag로 중간에 멈출수가 있지만 그래도 n^2이고
		 병합정렬은 빅-오 일때도 NlogN이기 때문에 평균값은 낮지만
		 배열을 하나 더 만들면서 복사를 해야하기에 메모리 부담이 있다.
		 삽입정렬은 빅-오 일때 버블정렬과 선택정렬같이 N^2이지만
		 코드가 간결하고 추가 메모리가 드는 부분이 없다.
		 
		 1.특징
		 -구현이 간단함.
		 -값이 같을경우 순서가 보장됨.(같으면 움직이지 않기 때문에)
		 -제자리 정렬이라 추가 배열이 생산이 필요없음
		 -선택,버블보다는 빠르지만 배열이 커지면 효율이 급하게 떨어짐
		 -선택과 비슷하지만 정렬된 앞자리를 비교하고 위치이동이 필요없으면
		 나머지는 비교를 안함.
		 
		 
		 */
		//교보재를 안보고 코드 작성해보기
		/*
		슈도코드 작성
		arr[] = {배열};저장
		int tmp에 기준이 되는 값 저장
		compareIndex는 비교할 값(기준값-1) 저장
		for(i=1,i~arr.length,i증가)
		tmp 에 arr[i]저장
		compareIndex = i-1 ; 비교할 대상 인덱스 할당
		while(comparebIndex>=0 비교할대상이 -1이 아니고
		      	isCompareTo(비교인덱스값,기준값,오름 내림))
			(앞에숫자가 뒤에숫자보다 클때)
			현재 인덱스 = 비교대상 인덱스값 저장 
			[why? tmp에 현재 인덱스값이 저장되어있기때문에 그렇다]
			compareIndex 값 감소;
			계속 반복
		}
		*/
	}
	
	public static void insertionSort(int[] arr,boolean compare) {
		
		//기준 배열값 변수
		int tmp = 0;
		//비교 배열값 인덱스 변수
		int compareIndex = 0;
		
		//기준 인덱스를 i로 잡고 반복문으로 비교
		//선택과 버블과는 다르게 끝까지 비교를 해야한다(<=)
		for(int i=1 ; i<arr.length ; i++) {
			
			tmp = arr[i];//기준값 저장
			compareIndex = i-1; //비교대상(바로 앞 인덱스)
			
			//병합정렬과 비슷하게 앞에있는 배열은 정렬된 상태이기 때문에
			//한칸 앞이 정렬기준에 맞으면 움직일 이유가 없다.
			
			while(compareIndex>=0 && isCompareTo(arr[compareIndex],tmp,compare)) {
				//저장한 값은 기준 값이기 때문에 비교값을 기준값 인덱스에 저장한다.
				//비교값은 계속 바꿔준다.
				arr[compareIndex+1] = arr[compareIndex];
				compareIndex--;
			}
			
			arr[compareIndex+1]=tmp;
		}
		
	}
		
	//main end
	
	private static boolean isCompareTo(int numA,int numB,boolean comparator) {
		//comparator = true면 오름차순 ,false면 내림차순
		//반환값이 boolean이기 때문에 if문을 쓸경우 모든 경우의수에 return을 넣어줘야한다.
		if(comparator) {
			/*
			if(numA < numB) {
				//오름차순 기준으로 뒤에 숫자가 크면 바꿀 이유가 없다.
				return false;
			}
			else {
				return true;
			}
			아래로 간결하게 작성해 보았다.
			*/
			return (numA<numB) ? false : true ;
		}
		else {
			/*
			if(numA < numB) {
				//내림차순 기준으로 뒤에가 더 크면 바꿔야하기때문에
				return true;
			}
			else {
				return false;
			}
			*/
			return (numA<numB) ? true : false ;
		}
	}//isCompareTo end
}
