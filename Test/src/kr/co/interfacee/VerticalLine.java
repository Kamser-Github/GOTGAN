package kr.co.interfacee;
//����
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
		return "���� ���Դϴ�";
	}
}
