package kr.co.interface2;

public class Triangle extends Face{
	
	public Triangle(int height,int width) {
		setHeight(height);
		setWidth(width);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getHeight() ; i++) {
			for(int j=0; j<getHeight()-1-i ; j++) {
				point.markSpace();
			}
			for(int j=0; j<(i+1)*2-1 ; j++) {
				point.markDot();
			}
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "삼각형입니다.";
	}
	@Override
	public double getArea() {
		return Math.round((double)calcArea()/2*10)/10.0;
	}
	
}
