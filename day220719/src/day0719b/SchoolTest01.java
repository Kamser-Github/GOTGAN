package day0719b;
//����Ʈ �����ϱ�
import day0719a.Student01;


public class SchoolTest01 {
	
	public static void main(String[] args) {
		Student01 lee = new Student01("�̼���");
		lee.addScore("����", 95);
		lee.addScore("����", 88);
		lee.addScore("�̼�", 99);
		lee.addScore("����", 65);
		
		//�л� ���� ��������ϱ�
		lee.addTotal();	
		//�л� ���� ��� ���ϱ�.
		lee.addAvg();
		
		//�л��� ��� ������ ���� ����غ���
		lee.showStudentSubject();
		
		//�л� ���� ����غ���
		lee.printStudentInfo();
	}
}
