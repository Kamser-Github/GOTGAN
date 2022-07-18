package day0718;

import java.util.ArrayList;

public class ArrayTest01 {
	public static void main(String[] args) {
		
	}
}

class Add{
	private int age;
	private String name;
	ArrayList<Sample> sp;
	
	Add(int age,String name){
		this.age = age;
		this.name = name;
		sp = new ArrayList<Sample>();
	}
	
	void add(int score,String name){
		Sample sample = new Sample(score,name);
		sp.add(sample);
	}
}

class Sample{
	
	private int score;
	private String name;
	
	Sample(int score,String name){
		this.score = score;
		this.name = name;
	}
	
	void setScore(int score) {this.score = score;}
	void setName(String name) {this.name = name;}
	
	int getScore() {return score;}
	String getName() {return name;}
}