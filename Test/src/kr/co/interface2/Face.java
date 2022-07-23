package kr.co.interface2;

public abstract class Face extends Shape implements Plane2D {
	
	private int height;
	private int width;
	
	public Face() {}
	
	//getter
	public int getHeight() { return height; }
	public int getWidth() { return width; }
	
	//setter
	public void setHeight(int num) {
		if(isNaturNumber(num)) {
			System.out.print("다시 입력해주세요");
			return;
		}
		height = num;
	}
	public void setWidth(int num) {
		if(isNaturNumber(num)) {
			System.out.print("다시 입력해주세요");
			return;
		}
		this.width = num;
	}
	
	//isNaturNumber
	public boolean isNaturNumber(int num) {
		return num<1;
	}
	
	//calcArea
	public double calcArea() {
		return height*width;
	}
}
