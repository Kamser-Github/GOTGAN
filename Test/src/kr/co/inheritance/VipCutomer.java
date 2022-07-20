package kr.co.inheritance;

public class VipCutomer extends GoldCustomer01{
	
	
	public VipCutomer(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("VIP");
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
		super.giveBenefit();
		System.out.println("20% 할인 중복 쿠폰 증정");
	}
	//4.고객센터 혜택 유무
	@Override
	public void tellQnA() {
		System.out.println("전용 고객센터 번호 1234");
	}
}
