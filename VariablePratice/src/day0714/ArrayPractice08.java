package day0714;

public class ArrayPractice08 {

	public static void main(String[] args) {

		//�󵵼� üũ�غ���.
		
		//1.�迭�� 10�� �迭 �ΰ� �����Ѵ�.
		int[] arr = new int[10];
		int[] arrCount = new int[10];
		
		//2.arr �迭�� �ߺ��Ǳ� ���� �������ڸ� �ִ´�.
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		
		//3.�ߺ��Ǵ� ���� ī��� �غ���.
		for(int i=0 ; i<arr.length ; i++) {
			arrCount[arr[i]]++;
		}
		//arr[i]�� 5�� ����Ǿ������� count 5�� �ε����� +1�� �Ѵ�.
		
		//4.�󵵼� üũ�غ���
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%d�� %d��|\n",i,arrCount[i]);
		}
		//���γ� ���η� �������µ� ���̻ڴ�.
		//�̰� ���簢�� ������� ����ϰ� �ʹ�.
		
		//5.���簢�� ������� ����غ���.
		// ������ 0 3 6 
		//		1 4 7
		//		2 5 8 �� ����Ϸ��� �Ѵ�.
		
		for(int i=0 ; i<3 ; i++) {
			int num = 0;
			for(int j=0 ; j<3 ; j++) {
				System.out.printf("%d�� %d��|",i,arrCount[num+3*j]);
			}
			System.out.println();
			num++;
		}
		//�� ��µǾ���.
		
	}// main end
}// class end
