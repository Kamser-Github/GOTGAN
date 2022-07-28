package day4.jeneric02;

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

public class FriendTestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Friend> friend = new LinkedList<Friend>();
		friend.add(new Friend("김밥천지","02-777-6666","네이버"));
		friend.add(new Friend("메머드 커피","02-777-6666","네이버"));
		friend.add(new Friend("김치찌개나라","02-777-6666","네이버"));
		friend.add(new Friend("알탕","02-777-6666","네이버"));
		friend.add(new Friend("피자 알볼로","02-777-6666","네이버"));
		
		for(Friend fri : friend) {
			System.out.println(fri.getInfo());
		}
	}
}
