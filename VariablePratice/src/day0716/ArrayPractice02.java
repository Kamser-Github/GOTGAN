package day0716;

public class ArrayPractice02 {
	
	public static void main(String[] args) {
		
		//�ִ밪�� �ּҰ� ���ϱ�
		int[] num = new int[10];
		
		for(int i=0 ; i<num.length ; i++) {
			num[i] = (int)(Math.random()*90)+10;
			System.out.print(num[i]+" ");
		}
		System.out.println();
		//25 46 32 95 55 13 11 99 14 45 
		
		for(int i=0 ; i<num.length ; i++) {
			if(num[0] < num[i]) {
				num[0] = num[i];
			}
			if(i==num.length-1) {
				System.out.println(num[0]);
			}
		}
		
		
	}

}
