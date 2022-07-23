package kr.co.interface2;

public class VerticalLine extends AbstractLine {
	
	public VerticalLine(int line) {
		setLine(line);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getLine() ; i++) {
			point.markDot();
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "������";
	}
	@Override
	public void findLine() {
		System.out.println("���̴� "+getLine());
	}
	
}
