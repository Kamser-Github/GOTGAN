package day4.jeneric01;
import java.util.LinkedList;
class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}

}

class Friend extends Person {

	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	@Override
	public String getInfo() {
		return super.getInfo() + "\t" + phoneNum + "\t" + email;
	}
}

public class FriendTestLinkList {

	public static void main(String[] args) {
		
		LinkedList<Friend> friends = new LinkedList<Friend>();
		
		friends.add(new Friend("기영이","123456","네이버"));
		friends.add(new Friend("기철이","121256","다음"));
		friends.add(new Friend("땡구","122356","구글"));
		friends.add(new Friend("아영이","122316","야후"));
		friends.add(new Friend("땡칠이","1234523","이젠"));
		
		System.out.println("이름\t전화번호\t이메일");
		System.out.println("-------------------------");
		for(Friend a : friends) {
			System.out.println(a.getInfo());
		}
	}
}
