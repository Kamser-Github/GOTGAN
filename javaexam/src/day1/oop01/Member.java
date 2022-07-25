package day1.oop01;

import java.awt.event.ActionEvent;

public class Member {
	//변수선언
	public String name,account,passwd;
	public int birthyear;
	
	public static void main(String[] args) {
		
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		
		//생성자 초기화
		m1.name = "피카츄";
		m1.account = "피카츄";
		m1.passwd = "백만볼트";
		m1.birthyear = 1985;
		
		m2.name = "파이리";
		m2.account = "파이리";
		m2.passwd = "불꽃발사";
		m2.birthyear = 1985;
		
		m3.name = "꼬북이";
		m3.account = "꼬북이";
		m3.passwd = "물대포";
		m3.birthyear = 1985;
		
		System.out.printf("회원1 : %s(%s,%s,%d)\n",m1.name,m1.account,m1.passwd,m1.birthyear);
		System.out.printf("회원2 : %s(%s,%s,%d)\n",m2.name,m2.account,m2.passwd,m2.birthyear);
		System.out.printf("회원3 : %s(%s,%s,%d)\n",m3.name,m3.account,m3.passwd,m3.birthyear);
		
		//생성자가 왜 생겼는지 몸으로 이해하게 되었다.
	}
}

