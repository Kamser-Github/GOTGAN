package kr.co.interfacee;

public abstract class Shape {
	
	public abstract void draw();
	public abstract String toString();
	
	public void play() {
		draw();
		System.out.println(toString());
	}
}
