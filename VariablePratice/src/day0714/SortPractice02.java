package day0714;

public class SortPractice02 {
	
	public static void main(String[] args) {
		
		//�������� ����
		
		//1.�迭 ���� 10�� int[] �迭 �����.
		int[] ten = new int[10];
		
		//2.�迭�� ���� ���ڸ� ���� 10~99���� �ֱ�
		for(int i=0 ; i<ten.length ; i++) {
			ten[i] = (int)(Math.random()*90)+10;
		}
		
		//2.5 ������ �迭Ȯ��
		System.out.println("������ �迭");
		
		//3.����� ������ ����غ���
		for(int a : ten) {
			System.out.print(a+" ");
		}
		System.out.println();
		//19 10 42 41 98 82 69 81 71 44 �����ϰ� �ߵ�
		
		//4.�������ķ� ����
		for(int i=0 ; i<ten.length-1 ; i++) {
			boolean flag = false;
			for(int j=0 ; j<ten.length-1-i ; j++) {
				int tmp;
				if(ten[j]>ten[j+1]) {
					tmp = ten[j];
					ten[j] = ten[j+1];
					ten[j+1] = tmp;
					flag = true;
				}
			}
			if(!flag) break;
		}
		
		//2.5 ������ �迭Ȯ��
				System.out.println("������ �迭");
				
		//5.����� �����ߴ��� ����غ���
		for(int a : ten) {
			System.out.print(a+" ");
		}
		 /*
		  36 40 79 61 61 83 47 49 15 51 
		  15 36 40 47 49 51 61 61 79 83 
		  
		 */
		
		
	}//main of end
}//class of end
