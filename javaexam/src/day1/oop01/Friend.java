package day1.oop01;

public class Friend extends Person {
	
	private String phoneNum,email;
	
	Friend(String name,String phoneNum,String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+"\t"+phoneNum+"\t"+email;
	}
}
