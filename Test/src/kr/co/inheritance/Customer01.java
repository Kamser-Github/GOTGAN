package kr.co.inheritance;

public class Customer01 extends MemberShip01	{
	
	
	public Customer01(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("�Ϲ�");
	}
	//1.���η��� �ٸ���.
	@Override
	public double giveDisCountRate() {
		return 1;
	}
	//2.�������� �ٸ���.
	@Override
	public double giveAccrualRate() {
		return 0;
	}
	//3.�ִ� ������ �ٸ���.
	@Override
	public void giveBenefit() {
		System.out.println("������ �غ��ϰڽ��ϴ�.");
	}
	//4.������ ���� ����
	@Override
	public void tellQnA() {
		System.out.println("���� �����Ͱ� �����ϴ�.");
	}
}
