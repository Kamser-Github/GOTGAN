package kr.co.interfacee;
//세로
public class VerticalLine extends AbstractLine {
	
	private int line;
	public VerticalLine(int line) {
		super(line);
	}
	
	@Override
	public void draw() {
		for(int i=0 ; i<getLine() ; i++) {
			System.out.println("*");
		}
	}
	@Override
	public String toString() {
		return "수직 선입니다";
	}
}
