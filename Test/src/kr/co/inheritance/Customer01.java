package kr.co.inheritance;

public class Customer01 extends MemberShip01	{
	
	
	public Customer01(String name,int age,char gender) {
		super(name,age,gender);
		setGrade("일반");
	}
	//1.할인률이 다르다.
	@Override
	public double giveDisCountRate() {
		return 1;
	}
	//2.적립률이 다르다.
	@Override
	public double giveAccrualRate() {
		return 0;
	}
	//3.주는 혜택이 다르다.
	@Override
	public void giveBenefit() {
		System.out.println("혜택을 준비하겠습니다.");
	}
	//4.고객센터 혜택 유무
	@Override
	public void tellQnA() {
		System.out.println("전용 고객센터가 없습니다.");
	}
}
