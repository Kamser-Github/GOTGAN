package day0714;

public class ArrayPractice04 {

	public static void main(String[] args) {

		//�ڹ��� ���� 5-4 ���հ� ����� ���ϼ���.
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		//���� ����
		int total = 0;
		double ave = 0.0;
		
		//���հ� ��� ����ϱ�
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				total += arr[i][j];
			}
		}
		
		for(int[] i : arr) {
			for(int j : i) {
				total += j;
			}
		}
		ave = (double)total/20;
		
		//����ϱ�
		System.out.printf("���� : %d\n��� : %6.2f",total,ave);
		
		
		
	}// main end
}// class end
