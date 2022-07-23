package kr.co.interface2;

public class HorizontalLine extends AbstractLine {
	
	public HorizontalLine(int line) {
		setLine(line);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getLine() ; i++) {
			point.markDot();
		}
	}
	@Override
	public String toString() {
		return "수평선";
	}
	@Override
	public void findLine() {
		System.out.println("길이는"+getLine());
	}
}
