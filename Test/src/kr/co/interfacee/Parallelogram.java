package kr.co.interfacee;

public class Parallelogram extends Shape implements Plane2D{
	
	private int height;
	private int width;
	
	public Parallelogram(int height,int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override //도형찍기
	public void draw() {
		for(int i=0 ; i<height ; i++) {
			for(int k=0 ; k<height-i ; k++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<width ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Parallelogram (width: "+width+",height"+height+")";
	}
	
	@Override
	public void getArea() {
		System.out.println("평행사변형의 면적은 : "+height * width);
	}
}
