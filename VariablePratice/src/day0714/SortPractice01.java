package day0714;

public class SortPractice01 {
	
	public static void main(String[] args) {
		
		int[] a = {50,70,20,10,30};
		int tmp = 0;
		System.out.print("선택 정렬 전 :");
		for(int i=0;i<a.length;i++) {
			System.out.printf("%3d",a[i]);
		}
		System.out.println();
		
		for(int i=0 ; i<a.length-1 ; i++) {
			for(int j=i+1; j<a.length ; j++) {
				if(a[i]>a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			
			
			System.out.print((i+1)+"번째 비교");
			for(int k : a) {
				System.out.print(k+" ");
			}
			System.out.println();
		}//for of end
		
		for(int k : a) {
			System.out.print(k+" ");
		}
	}
}
