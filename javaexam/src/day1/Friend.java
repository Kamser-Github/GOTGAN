package day1;

class Person {
	
	private String name;
	//생성자
	public Person(String name){
		this.name = name;
	}
	//매서드
	public String getInfo() {
		return name;
	}
	
}
public class Friend extends Person{
	
	private String phoneNum;
	private String email;
	
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
