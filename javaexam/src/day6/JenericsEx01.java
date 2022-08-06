package day6;
import java.util.ArrayList;

class Fruit					{ public String toString() { return "Fruit";}}
class Apple extends Fruit 	{ public String toString() { return "apple";}}
class Grape extends Fruit	{ public String toString() { return "grape";}}
class Toy					{ public String toString() { return "toy";}}

class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item)		{ list.add(item);}
	T get(int i)			{ return list.get(i);}
	int size()				{ return list.size();}
	public String toString(){ return list.toString();}
}


public class JenericsEx01 {
	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		//지네릭 클래스는 생성할때 타입변수를 정해야한다.
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
	  //Box<Grape> grapeBox = new Box<Fruit>();
	  //에러 발생. 타입변수는 상속과 상관없이 같아야한다.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());//ok 형변환이 가능하다. 참조변수가 T item
		
		appleBox.add(new Apple());//ok
	  //appleBox.add(new fruit());//에러발생 조상이 자손의 참조변수로는 안된다.
	    
		toyBox.add(new Toy());//자기 자신만가능
	  //toyBox.add(new Apple()); 에러발생
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		/*
		[Fruit, apple]
		[apple]
		[toy]
		*/
		//지네릭 클래스는 생성할때 타입변수를 정확히 지정해줘야하며
		//자손 객체일지라도 타입변수가 다르면 형변환이 불가능하다.
	}
}
