package day0716;

public class ArrayPractice01 {
	public static void main(String[] args) {
		
		//��� ����
		
		//1.�迭 ���� ���
		int[] num = new int[5];
		num[0] = 5;
		//�迭�� �⺻�� �����϶��� ���� ������ ������
		int[][] num2 = new int[5][4];
		// num2[3] = {1,2,3,4};
		// �̰� ������ ����
		// num2[0~4]�� ������ �����̱� ������
		// ���� �迭�� ����� �ʱ�ȭ�� �Ѵ���
		// �ּҰ��� �����ؾ��ϴµ� �� ������ ����
		// ���� ������ �ؾ��ϴ� ������������ ��쿡
		// �ٷ� �����ϴ� ���,�׸��� new �����ڷ� �����ؾ��Ѵ�.
		
		num2[3] = new int[] {1,2,4,5};
		
		//�迭�� ���� 
		//����,���� Ÿ���� �����Ͷ� ������ ����
		//���� = > �ݺ������� ó���ϱⰡ ����.
		
		
		//1.�迭 Ȱ�� - ���հ� ���
		int[] score = new int[10];
		
		//1. �����ϰ� ���� �־ ���հ� ����� ���ϴ� ����
		
		for(int i=0 ; i<score.length ; i++) {
			score[i] = (int)(Math.random()*10)+1;
			//1~10���� �����ϰ� ���ڸ� �־���.
		}
		
		//���ձ��ϱ�
		int sum = 0 ;
		for(int a : score) {
			sum += a;
		}
		System.out.println(sum); //53
		int sum2 = 0;
		for(int i=0 ; i<score.length ; i++) {
			sum2 += score[i];
		}
		System.out.println(sum2); //53
		
		//��� ���ϱ�
		double ave2 = (double)sum/score.length;
		
		//���������� ���غ���.
		int[][] scores = {
				 // ����, ����, ����, ����	
					{93, 93, 92}, // 0�� �л�
					{85, 85, 86}, // 1�� �л�
					{71, 71, 72}, // 2�� �л�
					{68, 68, 67}, // 3�� �л�
					{83, 83, 82}  // 4�� �л�
			};
		
		//����� �Ҽ��������� �迭 ������ ���ؼ� �Ҽ����� ����.
		//���� ��� ����  , ���� ��հ��� ���� ���� 
		
		int[][] totalScores = new int[6][5];
		// �л��� ����, ��� , ����, ��� �̷��� 5��
		// ���������� ���� ����,���,?,��� ��� �̷��� �ؼ� 6,4
		
		//1.�л��� ���� ����ϱ�
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=0 ; j<scores[i].length; j++) {
				totalScores[i][0]+=scores[i][j];
				System.out.print(scores[i][j]+" ");
			}
			System.out.print(totalScores[i][0]);
			System.out.println();
		}
		
		//2.�л��� ��� ����ϱ�
		for(int i=0 ; i<scores.length ; i++) {
			for(int j=1 ; j<2 ; j++) {
				totalScores[i][1]=totalScores[i][0]/scores[i].length;
			}
			System.out.print(totalScores[i][1]+" ");
		}
		System.out.println();
		
		//3.�л� ���� ���ϱ�
		//�л� �̸��� ��� ��ȣ�� ����
		for(int i=0 ; i<scores.length ; i++) {
			totalScores[i][4]=i+1;
			System.out.print(totalScores[i][4]+" ");
		}//1 2 3 4 5 
		System.out.println();
		
		//sort
		for(int i=0 ; i<scores.length-1 ; i++) {
			for(int j=0 ; j<scores.length-1-i ; j++) {
				int tmp;
				if(totalScores[j][0]<totalScores[j+1][0]) {
					tmp = totalScores[j][4];
					totalScores[j][4] = totalScores[j+1][4];
					totalScores[j+1][4] = tmp;
				}
			}
		}
		//���� �̾ƺ���
		for(int i=0 ;i<scores.length ;i++) {
			System.out.print(totalScores[i][4]+" ");
		}
		
	}//main end
}//class end
