package day0716;

public class ObjectPractice01 {
	
	public static void main(String[] args) {
		/* 1단계
		String kangNumber = "108879";
		String kangNo = "195";
		int kangBalance = 15948;
		
		String parkNumber ="84546";
		String parkNo = "15";
		int parkBalance = 5156;
		
		parkBalance -= 200;
		kangBalance += 1500;
		
		System.out.println("--kang고객님--");
		System.out.println("번호"+kangNumber);
		System.out.println("랭킹"+kangNo);
		System.out.println("자산"+kangBalance);
		
		
		이렇게 하니까 누구나 접근이 쉽고
		사람 한명이 늘고 열명 천명 십만명이 될수록 개개인으로 관리하기가 어렵다.
		개인정보가 쉽게 노출이 된다.
		
		1.단점 
			- 변수명이나 주석으로 개인정보 유출
			- 한사람 한사람 관리하는게 아니라 한꺼번에 처리를 해야한다.
			- 누구나 변수명 변수값을 관리할수가 있다.
			
			------------------------------
		*/	 
		/*
		2.클래스로 객체를 만들어서 사용.
		Bank kang = new Bank();
		kang.balance = 1500;
		kang.no = "1515";
		kang.number = "15649";
		
		System.out.println("---kang 고객님");
		System.out.println("kang님"+kang.balance);
		System.out.println("kang님"+kang.no);
		System.out.println("kang님"+kang.number);
		
		문제점1 - 확실한 초기화에 대한 보장이 되지 않고 있다.
		문제점2 - 아무나 변수의 정보를 변경할 수 있다.
		
		*/
		Bank kang = new Bank("154878","148",26000);
		kang.getPerson();
	}
}
/*2번 
class Bank{
	
	String number;
	String no;
	int balance;
	
	Bank(){}
}
*/

class Bank{
	
	private String number;
	private String no;
	private int balance;
	
	Bank(){}
	public Bank(String number,String no,int balance){
		this.number = number;
		this.no = no;
		this.balance = balance;
	}
	
	void setNumber(String num) {
		number = num;
	}
	
	void setNo(String no) {
		this.no = no;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
		//고객 정보 확인
	void getPerson() {
		System.out.println("고객님의 번호 : "+number);
		System.out.println("고객님의 순위 : "+no);
		System.out.println("고객님의 잔고 : "+balance);
		
		
		
		
	}
}