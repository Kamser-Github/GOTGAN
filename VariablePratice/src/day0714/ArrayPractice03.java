package day0714;

public class ArrayPractice03 {

	public static void main(String[] args) {

		//�ڹ��� ���� ���� 5-3��������.
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		 //(1) . �˸��� �ڵ带 �־� �ϼ��Ͻÿ�
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		for(int i : arr) {
			sum += i;
		}
		
		System.out.println("sum=" + sum);

	}// main end
}// class end
