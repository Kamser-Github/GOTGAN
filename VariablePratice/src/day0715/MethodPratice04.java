package day0715;

import java.util.Scanner;

public class MethodPratice04 {
	
	//���� ���ϴ� �żҵ� �����.
	static int calcTot(int[] num) {
		int sum = 0;
		for(int a : num) {
			sum += a;
		}
		return sum;
	}//calcTot end
	
	//��� �������ϴ� �żҵ� �����.
	static double calcAve(int sum,int[] num) {
		double avg = 0.0;
		avg = (double)sum/num.length;
		return avg;
	}
	
	//�ְ����� ���ϴ� �żҵ� �����
	
	static int calcMax(int[] num) {
		int max = num[0];
		for(int i=1 ; i<num.length ; i++) {
			if(max<num[i]) {
				max = num[i];
			}
		}
		return max;
	}
	
	//������ ���ϴ� �޼ҵ� �����
	
	static int calcMin(int[] num) {
		int min = num[0];
		for(int i=1 ; i<num.length ;i++) {
			if(min>num[i]) {
				min = num[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		//���� ���ϴ� �żҵ� �����.
		
	
		
	//����1) �л����� �Է��Ͽ� int�� �迭 scores�� �����ϰ�, 
	//����, ���, �ְ�����, ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// �� �л��� ������ �Է��ϴ� �κ��� �޼ҵ�� ����ÿ�. �޼ҵ��: inputScore
	// ����, ���, �ְ�����, ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����ÿ�.
	// �޼ҵ��: calcTot, calcAve, calcMax, calcMin
		
		//1.�л��� �Է��� int�� �迭 �����
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� ���� �Է��ϼ���.");
		int[] scores = new int[sc.nextInt()];
		
		//2.�л��� ��ŭ ���� �ֱ�.
		for(int i=0 ; i<scores.length ; i++) {
			scores[i] = (int)(Math.random()*90)+10;
		}
		
		
		//3.�ż��� ���
		System.out.println(calcTot(scores)); //327
		
		System.out.println(calcAve(calcTot(scores), scores));
		
		System.out.println(calcMax(scores));
		
		System.out.println(calcMin(scores));
		
		
		sc.close();
	}

}
