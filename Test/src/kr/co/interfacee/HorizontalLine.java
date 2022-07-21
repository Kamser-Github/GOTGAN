package kr.co.interfacee;
//가로
public class HorizontalLine extends AbstractLine {
	
	private int line;
	
	public HorizontalLine(int line) {
		super(line);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getLine() ; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	@Override
	public String toString() {
		return "수평선 입니다";
	}
}
