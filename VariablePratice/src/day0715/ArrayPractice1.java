package day0715;



public class ArrayPractice1 {
	
	public static void main(String[] args) {
		
		//�󵵼� üũ�غ���
		
		//���ڸ� ���� �迭�� �ߺ����� üũ�� �迭�� �����
		
		int[] arr = new int[10];
		int[] arrCount = new int[5];
		
		//arr�迭�� �������� 1~5�� �ִ´�.
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*5)+1;
			//���������� ���� Ȯ���ϱ�
			System.out.print(arr[i]+" ");
		}
		
		//arr�迭�� �ߺ��Ǵ� ���� �����
		
		for(int i=0 ; i<arr.length ; i++) {
			arrCount[arr[i]-1]++;
			//arr �迭���� ���ڰ� ������
			//�� ���� �ڸ��� �⺻���� +1�� ���ش�
			//arr���� ���� ���� ���ڴ� 1�̶� �ε����� -1�ߴ�.
		}
		
		//�ߺ��� �� Ȯ���غ���
		System.out.println();
		for(int a : arrCount) {
			System.out.print(a+" ");
		}
		System.out.println();
		//�ߺ��� ���ڿ� ���� ���� ����غ���
		for(int i=0 ; i<arrCount.length ; i++) {
			System.out.printf("%d:%d|",i+1,arrCount[i]);
		}
		/*
		4 2 3 2 4 4 5 3 3 4 
		0 2 3 4 1 
		1:0|2:2|3:3|4:4|5:1|
		*/
	}//main of end
}//class of end
