package day0714;

public class ArrayPractice07 {

	public static void main(String[] args) {

		// ���� ��������
		// 
		int[][] scores = {
			//	���� ���� ����
	            {93,93,92},
	            {85,85,86},
	            {71,71,72},
	            {68,68,67},
	            {83,83,82},
							};
		
		//���� �Է�
		String[] subject = new String[] {"����","����","����"};
		
		//1.�� �л� ���հ� ��� ���ϱ�
		
		//���� �迭 �����
		char[] grade = new char[scores.length];
		
		//�л��� ���� �迭
		int[] total = new int[scores.length];
		
		//�л��� ��� �迭
		double[] avgs1 = new double[scores.length];
		
		//���� ���� �迭
		int[] subjectTotal = new int[scores.length];
		
		//���� ��� �迭
		double[] subjectAvg = new double[scores.length];
		
		//�л��� ���� ���ϰ� ����
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				total[i]+=scores[i][j];
			}
		}
		
		//���� ���� ����
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length ; j++) {
				subjectTotal[j]+=scores[i][j];
			}
		}
		
		//���� ��� ����
		for(int i=0 ; i<subjectTotal.length ; i++) {
			subjectAvg[i] = (double)subjectTotal[i]/scores.length;
		}
		
		//�л��� ��� ����
		for(int i=0 ; i<total.length ; i++) {
			avgs1[i] = (double)total[i]/scores[i].length;
		}
		
		//�л��� ���� ����
		for(int i=0 ; i<avgs1.length ; i++) {
			int rate = (int)avgs1[i]/10;
			switch(rate) {
			case 10 : case 9 : 
				grade[i] = 'A';
				break;
			case 8 :
				grade[i] = 'B';
				break;
			case 7 :
				grade[i] = 'C';
				break;
			case 6 :
				grade[i] = 'D';
				break;
			default :
				grade[i] = 'F';
			}
		}
		
		
		//�л� ���� ���� ����ϱ�
		for(int i=0 ; i<scores.length ; i++) {
			//������ ���� ���
			System.out.print(i+1+"�� ");
			for(int j=0 ; j<scores[i].length ; j++) {
				System.out.printf("%s: %d |",subject[j],scores[i][j]);
				
			}
			//���� ���� ���
			System.out.print("���� :"+total[i]+" |");
			
			//��� ���� ���
			System.out.printf("��� : %.1f |",avgs1[i]);
			
			//���� ��� ���
			System.out.printf("��� : %c |\n",grade[i]);
			
			//���� ��� ���
			if(i+1==scores.length) {
				System.out.print("��ü");
				for(int k=0 ; k<scores[k].length ; k++) {
					System.out.printf("%s:%.1f|",subject[k],subjectAvg[k]);
				}
			}
			
			
		}
	
	}// main end
}// class end
