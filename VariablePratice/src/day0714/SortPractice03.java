package day0714;

public class SortPractice03 {
	
	public static void main(String[] args) {
		
		//���� ���� �����ϱ�
		
		//1. int[] �迭 ���̰� 10�� �迭 ����
		int[] ten = new int[10];
		
		//2. �迭�� ������ ���� �ֱ�.
		for(int i=0 ; i<ten.length ; i++) {
			ten[i] = (int)(Math.random()*90)+10;
		}
		//2.5 ������ �迭 ���
		System.out.println("������ �迭");
		
		//3. �迭�� �� ���� Ȯ��
		for(int a : ten) {
			System.out.print(a+" ");
		}
		
		//4.�������ķ� �迭 �����ϱ�
		for(int i=0; i<ten.length-1 ; i++) {
			//ó������ ������ �����ٸ� 4���̱⿡ 1�� ����.
			for(int j=i+1 ; j<ten.length ; j++) {
				//j=0�ϴ� 4�� ���ƾ��ϱ� �����̴�.
				int tmp;
				if(ten[i]>ten[j]) {
					tmp = ten[i];
					ten[i] = ten[j];
					ten[j] = tmp;
				}
			}
		}
		//5.������ ����ϱ�
		System.out.println("\n���� ���� ��");
		
		//6.�迭 ����ϱ�
		for(int a : ten) {
			System.out.print(a+" ");
		}
		
		//�� ���� �Ǿ���.
		
	}//main of end
}//class of end
