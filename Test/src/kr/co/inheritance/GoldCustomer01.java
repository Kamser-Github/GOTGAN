package kr.co.inheritance;

public class GoldCustomer01 extends Customer01 {
	
	public GoldCustomer01(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("골드");
	}
	
	//1.할인률이 다르다.
	@Override
	public double giveDisCountRate() {
		return super.giveDisCountRate()-0.05;
	}
	//2.적립률이 다르다.
	@Override
	public double giveAccrualRate() {
		return super.giveAccrualRate()+0.05;
	}
	//3.주는 혜택이 다르다.
	@Override
	public void giveBenefit() {
		System.out.println("10% 중복할인 쿠폰 증정");
	}
	//4.고객센터 혜택 유무
	@Override
	public void tellQnA() {
		super.tellQnA();
	}
}
