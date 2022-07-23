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
		return "수직선";
	}
	@Override
	public void findLine() {
		System.out.println("길이는 "+getLine());
	}
	
}
