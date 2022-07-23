package kr.co.interface2;

public class Parallelogram extends Face{
	
	public Parallelogram(int height,int width) {
		setHeight(height);
		setWidth(width);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getHeight() ; i++) {
			for(int j=0 ; j<getHeight()-1-i ; j++) {
				point.markSpace();
			}
			for(int j=0 ; j<getWidth() ; j++) {
				point.markDot();
			}
			System.out.println();
		}
		
	}
	@Override
	public String toString() {
		return "평행사변형 입니다." ;
	}
	@Override
	public double getArea() {
		return calcArea();
	}
}
