package day0716;

public class ObjectPractice01 {
	
	public static void main(String[] args) {
		/* 1�ܰ�
		String kangNumber = "108879";
		String kangNo = "195";
		int kangBalance = 15948;
		
		String parkNumber ="84546";
		String parkNo = "15";
		int parkBalance = 5156;
		
		parkBalance -= 200;
		kangBalance += 1500;
		
		System.out.println("--kang����--");
		System.out.println("��ȣ"+kangNumber);
		System.out.println("��ŷ"+kangNo);
		System.out.println("�ڻ�"+kangBalance);
		
		
		�̷��� �ϴϱ� ������ ������ ����
		��� �Ѹ��� �ð� ���� õ�� �ʸ����� �ɼ��� ���������� �����ϱⰡ ��ƴ�.
		���������� ���� ������ �ȴ�.
		
		1.���� 
			- �������̳� �ּ����� �������� ����
			- �ѻ�� �ѻ�� �����ϴ°� �ƴ϶� �Ѳ����� ó���� �ؾ��Ѵ�.
			- ������ ������ �������� �����Ҽ��� �ִ�.
			
			------------------------------
		*/	 
		/*
		2.Ŭ������ ��ü�� ���� ���.
		Bank kang = new Bank();
		kang.balance = 1500;
		kang.no = "1515";
		kang.number = "15649";
		
		System.out.println("---kang ����");
		System.out.println("kang��"+kang.balance);
		System.out.println("kang��"+kang.no);
		System.out.println("kang��"+kang.number);
		
		������1 - Ȯ���� �ʱ�ȭ�� ���� ������ ���� �ʰ� �ִ�.
		������2 - �ƹ��� ������ ������ ������ �� �ִ�.
		
		*/
		Bank kang = new Bank("154878","148",26000);
		kang.getPerson();
	}
}
/*2�� 
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
		//�� ���� Ȯ��
	void getPerson() {
		System.out.println("������ ��ȣ : "+number);
		System.out.println("������ ���� : "+no);
		System.out.println("������ �ܰ� : "+balance);
		
		
		
		
	}
}