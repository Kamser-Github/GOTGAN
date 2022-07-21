package kr.co.interfacee;

//��� ���� �����ϰԵǸ� ��Ӹ��� �ϸ�ȴ�.
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
		return "�簢��";
	}
	
	@Override
	public void getArea() {
		System.out.println("�簢���� ������ : "+height * width);
	}
}
