package kr.co.interfacee;
//����
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
		return "���� �Դϴ�";
	}
}
