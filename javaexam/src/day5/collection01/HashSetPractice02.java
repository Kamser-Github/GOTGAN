package day5.collection01;
import java.util.HashSet;

public class HashSetPractice02 {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abs");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);
	}
}
class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}