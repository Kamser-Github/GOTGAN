package kr.co.interfacee;

public class Point extends Shape{
	
	@Override
	public void draw() {
		System.out.println("*");
	}
	@Override
	public String toString() {
		return "점 하나를 찍습니다.";
	}
}
