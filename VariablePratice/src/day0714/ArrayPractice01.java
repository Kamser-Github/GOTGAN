package day0714;

public class ArrayPractice01 {

	public static void main(String[] args) {
	
		//1���� �迭�� Ȱ��
		//����1)85,93,71,63,82�� ������ �����ϴ� int���� 1���� �迭 scores�� �����ϰ�
		//������ ����� ���Ͻÿ�
		
		//1.int[] �迭 ���� �� �ʱ�ȭ.
		int[] scores = new int[] {85,93,71,63,82};
		//����� ���ÿ� �ʱ�ȭ�� �Ҷ��� new int[]�� ������ ����
		
		//��������
		int total = 0;
		double ave = 0;
		
		//���� ���
		for(int i=0;i<scores.length;i++) {
			total += scores[i];
		}
		
		//��� ���
		ave = (double)total/scores.length;
		//int���� ����̱� ������ ĳ�������� �Ǽ�������;
		
		//���
		System.out.printf("���� : %5d\n��� : %.2f",total,ave);
		
		
		
	}//main end
}//class end
