package day0719a;

//import Ÿ�������� �ۼ�
import java.util.ArrayList;
import day0719b.Subject01;
/*
	���� �ڵ� ��ǥ
	1. ���
	2. super���
	3. import ���
	4. ���� ���


*/
public class Student01 {
	//�л� ��ȣ
	private static int count;
	//�л� ����
	private String name;
	private int id;
	private int totalScore;
	private double avg;
	
	//����迭�߰��غ���
	ArrayList<Subject01> studentSubject;
	
	//������ �����
	public Student01() {
		this("ȫ�浿");
	} // �������� ����Ʈ ������
	public Student01(String name) {
		this.name = name;
		id = ++count;
		//��ü�迭 �ʱ�ȭ�ϱ�
		studentSubject = new ArrayList<Subject01>();
	}
	
	//getter
	public int getTotalScore() { return totalScore; }
	public double getAvg() { return avg; }
	public String getName() { return name+id; }
	
	//setter
	public void setTotal(int num) {totalScore = num;}
	public void setAvg(double num) {avg = num;}

	//�л��� ��� ������ ����� ���� �߰��ϱ�.
	public void addScore(String subject,int score) {
		//������ �޼ҵ带 ����ϱ����� ������ ��ȯ
		Subject01 sub = new Subject01(subject,score);
		studentSubject.add(sub);
	}
	
	//���� ���ϴ� �ż��� �����
	public void addTotal() {
		for(Subject01 a : studentSubject) {
			totalScore+=a.getScore();
		}
	}
	
	// ��� ���ϴ� �ż��� �����
	public void addAvg(){
		if(totalScore!=0) {
			avg = (double)totalScore/studentSubject.size();
		}
		else return;
	}
	
	//�л� ��ü���� ����غ���
	public void printStudentInfo() {
		if(totalScore==0) return;
		System.out.printf("\n�л� �̸� : %s\n"
						+ "�л� ��ȣ : %4d\n"
						+ "�л� ���� : %4d\n"
						+ "�л� ��� : %4f\n"
				,name,id,totalScore,avg);
	}
	
	//�л��� ��� ������ ���� ��� ����ϱ�
	public void showStudentSubject() {
		System.out.println("�л� �̸� : "+name);
		System.out.println("�л� ��ȣ : "+id);
		for(Subject01 a : studentSubject) {
			//toString�� ��������.
			System.out.println(a);
		}
		
	}
}//class end
