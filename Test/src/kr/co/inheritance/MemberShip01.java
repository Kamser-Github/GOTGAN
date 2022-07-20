package kr.co.inheritance;

public abstract class MemberShip01 {
	
	private static int id;
	private int count;
	private String name;
	private int age;
	private char gender;
//	private double discountRate;
//	private double accrualRate;
	private String grade;
	
	//������
	public MemberShip01(String name,int age,char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		id = ++count;
	}
	
	//getter
	
	
	//setter
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	//��޺� ����
	//1.���η��� �ٸ���.
	public abstract double giveDisCountRate();
	
	//2.�������� �ٸ���.
	public abstract double giveAccrualRate();
	
	//3.�ִ� ������ �ٸ���.
	public abstract void giveBenefit();
	
	//4.������ ���� ����
	public abstract void tellQnA();
	
	//5.ȸ�� ���� ���
	public String toString() {
		return  "\nȸ�� ��ȣ : "+id+
				"\nȸ�� �̸� : "+name+
				"\nȸ�� ���� : "+age+
				"\nȸ�� ���� : "+gender+
				"\nȸ�� ��� : "+grade;
	}
}
