package kr.co.interfacee;

public abstract class AbstractLine extends Shape {
	
	private int line;
	
	public AbstractLine(int line) {
		this.line = line;
	}
	
	public int getLine() {return line;}
}
