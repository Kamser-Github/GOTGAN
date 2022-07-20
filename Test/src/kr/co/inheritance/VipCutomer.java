package kr.co.inheritance;

public class VipCutomer extends GoldCustomer01{
	
	
	public VipCutomer(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("VIP");
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
		super.giveBenefit();
		System.out.println("20% ���� �ߺ� ���� ����");
	}
	//4.������ ���� ����
	@Override
	public void tellQnA() {
		System.out.println("���� ������ ��ȣ 1234");
	}
}
