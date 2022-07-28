package day4.jeneric03;

import java.util.LinkedList;
import java.util.Iterator;

class Person {
	
	private String name;
	//������
	public Person(String name){
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
	
}

class Friend extends Person{
	
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
public class LinkedListPractice {
	
	public static void main(String[] args) {
		
		LinkedList<Friend> friend = new LinkedList<>();
		
		friend.add(new Friend("또치","12-45788787","네이버"));
		friend.offer(new Friend("또치","12-45788787","네이버"));
		friend.add(0,new Friend("또치","12-45788787","네이버"));
		
		Iterator<Friend> it = friend.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getInfo());
		}
	}
}
