package kr.co.interface6;

public interface Available {
	
	int SEOUL = 0;
	int DEAGU = 1;
	int BUSAN = 2;
	
	//�����, ������ ����
	void choiceLocation(int num1,int num2);
	//�Ÿ� ����ϱ�
	void calcDistance();
	//�Ÿ��� ��� ����ϱ�
	int calcPrice();
	//�Ÿ��� �ð� ����ϱ�
	int calcTheTime();
	//��ü ���� �����ֱ�
	void showInfo();
	
}
