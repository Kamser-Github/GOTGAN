package kr.co.interface2;

public abstract class Shape {
	
	//������ �׷�����.
	Point point = new Point();
	public abstract void draw();
	public abstract String toString();
	
	public void play() {
		draw();
		System.out.println("\n"+toString());
	}
	
}
