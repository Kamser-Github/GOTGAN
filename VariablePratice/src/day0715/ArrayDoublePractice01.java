package day0715;

import java.util.Scanner;

public class ArrayDoublePractice01 {

	public static void main(String[] args) {
		
		//�� ������� �ڵ��غ���
		
		//�ζǹ�ȣ 6�ڸ� ��÷�غ���.
		
		//1.�迭���̰� 45�� int�迭 �����.
		int[] loto = new int[45];
		
		//2.�迭�� ���ʴ�� ���� 1���� 45���� �ֱ�
		for(int i=0 ; i<loto.length ; i++) {
			loto[i] = i+1;
		}
		
		//3.����� �־����� Ȯ���غ���
		int count = 0;
		for(int i=0 ; i<9 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.printf("%2d|",loto[count]);
				count++;
			}
			System.out.println();
		}
		
		//4.�迭 ������ �������� �ٲ��.
		for(int i=0 ; i<loto.length ; i++) {
			int random = (int)(Math.random()*45);
			int tmp = loto[i];
			loto[i]	= loto[random];
			loto[random] = tmp;
		}
		
		//5.�� �������� Ȯ���غ���
		System.out.println("������ �ζǹ�ȣ");
		
		for(int i=0 ; i<6 ; i++) {
			System.out.printf("%2d|",loto[i]);
		}
		//�� ���δ�.
		//5.5 ���� �� �ζǹ�ȣ�� ���� �迭�� �����.
		int[] MyLoto = new int[6];
		
		
		//6.���� ���� �ζ� ��ȣ 6���� �Է��Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		/*
		for(int i=0 ; i<6 ; i++) {
			System.out.printf("%d��° �ζǹ�ȣ�� �Է��ϼ���\n.",i+1);
			MyLoto[i] = sc.nextInt();
		}
		*/
		//�� ������� �ϴϰ� ������ ��������.
		//�Է��ϴ� ����� 1~45�� �ƴ϶� �ٸ� ���ڸ� �Է��� ��츦 ���ƴ�.
		/*
		while(true) {
			int i = 0;
			System.out.printf("%d��° �ζǹ�ȣ�� �Է��ϼ���\n.",i+1);
			if(sc.nextInt()>45||sc.nextInt()<1) {
				continue;
			}
			
		}
		*/
		//�� �ٸ� ����.
		//����� �Ȱ��� ��ȣ�� �Ȼ̰� �ؾߵȴ�.
		//�ߺ��� �ȵǰ� �ϴ� �ż��尡 �ʿ��ѰŰ���.
		//1.��ȣ ������ 1~45�� �ƴϸ� �ٽ� �̰��ϱ�.
		//2.��ȣ�� �̾����� �ߺ��� �ƴϰ� �ϱ�.
		//3.���� ��ȣ�� ���� ���� �ζ� ��ȣ ���ϱ�.
		
		//�ϳ��� �غ���.
		int lotoNum = 0;
		int countNum = 0;
		
		while(countNum<6) {
			System.out.printf("\n%d��° �ζǹ�ȣ�� �Է��ϼ���\n",countNum+1);
			lotoNum = sc.nextInt();
			lotoNumber(lotoNum,MyLoto);
			if(lotoNum>45||lotoNum<1)
				continue;
			MyLoto[countNum]=lotoNum;
			countNum++;
		}
		
		//2.�ߺ��� ��� �ٽ� �ǵ��ư���.
		
//		for(int i=0 ; i<MyLoto.length ; i++) {
//			if(lotoNum==MyLoto[i]) {
//				lotoNum=46;
//			}
//		}
		sc.close();
	}//main of end
	public static int lotoNumber(int x,int[] y) {
		for(int i=0 ; i<y.length ; i++) {
			if(x==y[i]) {
				return x=46;
			}
		}
		return x;
	}
}//class of end
