package kr.co.interfacee;

//상속 구현 같이하게되면 상속먼저 하면된다.
public class Rectangle extends Shape implements Plane2D {
	
	private int height;
	private int width;
	
	public Rectangle(int height,int width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public void draw() {
		for(int i=0 ; i<height ; i++) {
			for(int j=0 ; j<width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "사각형";
	}
	
	@Override
	public void getArea() {
		System.out.println("사각형의 면적은 : "+height * width);
	}
}
