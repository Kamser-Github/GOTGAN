package kr.co.interface2;

public class Rectangle extends Face {

	public Rectangle(int height,int width) {
		setHeight(height);
		setWidth(width);
	}
	
	@Override
	public void draw() {
		for(int i=0; i<getHeight() ; i++) {
			for(int j=0; j<getWidth() ; j++) {
				point.markDot();
			}
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "사각형입니다 넓이는 ";
	}
	@Override
	public double getArea(){
		return calcArea();
	}
	
}
