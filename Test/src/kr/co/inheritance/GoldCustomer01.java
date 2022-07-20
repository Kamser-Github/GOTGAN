package kr.co.inheritance;

public class GoldCustomer01 extends Customer01 {
	
	public GoldCustomer01(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("���");
	}
	
	//1.���η��� �ٸ���.
	@Override
	public double giveDisCountRate() {
		return super.giveDisCountRate()-0.05;
	}
	//2.�������� �ٸ���.
	@Override
	public double giveAccrualRate() {
		return super.giveAccrualRate()+0.05;
	}
	//3.�ִ� ������ �ٸ���.
	@Override
	public void giveBenefit() {
		System.out.println("10% �ߺ����� ���� ����");
	}
	//4.������ ���� ����
	@Override
	public void tellQnA() {
		super.tellQnA();
	}
}
