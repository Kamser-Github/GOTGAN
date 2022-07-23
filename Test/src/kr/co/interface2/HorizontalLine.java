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
		return "����";
	}
	@Override
	public void findLine() {
		System.out.println("���̴�"+getLine());
	}
}
