package day3;

public class ArrayObject0713 {
	
	public static void main(String[] args) {
		
		Suty[] people = new Suty[3];
		//Suty ��ü�迭 Ÿ���� people�̶�� ������ �����.
		//new �����ڷ� ��ü�迭 3ĭ¥���� �������
		//��ü�� �⺻���� null�� �ʱ�ȭ �Ǿ��ִ�.
		//�� people ���� ����ҿ� ��ü�迭 3ĭ¥�� �ּҸ� ����ִ°�.
		
		
		
		
		for(int i = 0 ; i<people.length; i++) {
			people[i] = new Suty();
		}
		
		//���빰�� �ƹ��͵� ���µ�
		//��ü���� ������ �迭 3ĭ¥�� �ּҸ� �־���.
		//�迭 ĭ ���� �ν��Ͻ��� �ʱ�ȭ�ؼ� �� �濡 �ּҰ��� �־����.
		
		//people���� people[] �迭�� ��ü �ּҰ� ����հ�
		//people[i]���� people �ν��Ͻ� �ּҰ� ����Ǿ��մ�.
		
		
	}
}
class Suty{
	int x;
}