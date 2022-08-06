package day6;
import java.util.ArrayList;

class Fruit1 implements Eatable{
	public String toString() { return "Fruit"; }
}

class Apple1 extends Fruit1 { public String toString() { return "apple";}}
class Grape1 extends Fruit1 { public String toString() { return "grape";}}
class Toy1 				    {public String toString() { return "toy"; }}

interface Eatable {}

class FruitBox<T extends Fruit1 & Eatable> extends Box1<T>{}
// 상속이후에 구현은 &로 묶는다.

class Box1<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i);}
	int size() { return list.size();}
	public String toString() { return list.toString();}
}

public class JenericsEx02 {
	
	public static void main(String[] args) {
		
		FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();
		FruitBox<Apple1> appleBox = new FruitBox<Apple1>();
	   //FruitBox<Toy> 	 toyBox   = new FruitBox<Toy>();
		//FruitBox<T> T에 extends Fruit1을한 애들만 들어올수잇다.
		FruitBox<Grape1> grapeBox = new FruitBox<Grape1>();
	  //FruitBox<Grape1> grapeBox = new FruitBox<Apple>();
	  //형제끼리는 될수가 없다.
		
		fruitBox.add(new Fruit1());
		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1());
		appleBox.add(new Apple1());
	  //appleBox.add(new Grape1());//형제끼리는 언제나 불가능하다.
		grapeBox.add(new Grape1());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
		/*
		즉 제네릭 extends 조상일경우
		제네릭 자손들은 들어올수가 있다.
		과일 박스에 사과박스 지네릭 변수를 선언할수있다는것.
		*/
	}
}
