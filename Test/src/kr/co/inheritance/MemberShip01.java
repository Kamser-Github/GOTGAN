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
	
	//생성자
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
	
	
	//등급별 혜택
	//1.할인률이 다르다.
	public abstract double giveDisCountRate();
	
	//2.적립률이 다르다.
	public abstract double giveAccrualRate();
	
	//3.주는 혜택이 다르다.
	public abstract void giveBenefit();
	
	//4.고객센터 혜택 유무
	public abstract void tellQnA();
	
	//5.회원 정보 출력
	public String toString() {
		return  "\n회원 번호 : "+id+
				"\n회원 이름 : "+name+
				"\n회원 나이 : "+age+
				"\n회원 성별 : "+gender+
				"\n회원 등급 : "+grade;
	}
}
