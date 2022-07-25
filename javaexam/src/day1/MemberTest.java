package day1;
class Member{
	public String name;
	public String account;
	public String passwd;
	public int birthYear;
	
	public Member(String name,String account,String passwd,int birthYear) {
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthYear = birthYear;

	}
}

public class MemberTest {
	
	public static void main(String[] args) {
		Member mem1 = new Member("우영우", "woo1","1234", 1987);
		Member mem2 = new Member("정명석", "jung1", "1224", 1985);
		Member mem3 = new Member("이준호", "leeJun", "4478", 1988);
		
		System.out.println("회원1: "+mem1.name+"("+mem1.account+","+
						mem1.passwd+","+mem1.birthYear+")");
		System.out.println("회원2: "+mem2.name+"("+mem2.account+","+
				mem2.passwd+","+mem2.birthYear+")");
		System.out.println("회원3: "+mem3.name+"("+mem3.account+","+
				mem3.passwd+","+mem3.birthYear+")");
	}
}
