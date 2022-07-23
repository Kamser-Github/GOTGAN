package kr.co.interface2;

public abstract class Shape {
	
	//도형을 그려보자.
	Point point = new Point();
	public abstract void draw();
	public abstract String toString();
	
	public void play() {
		draw();
		System.out.println("\n"+toString());
	}
	
}
