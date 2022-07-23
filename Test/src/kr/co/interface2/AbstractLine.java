package kr.co.interface2;

//수직선 그리기
public abstract class AbstractLine extends Shape  {
	//선 변수 추가
	private int line;
	
	//생성자
	public AbstractLine() {}
	
	//getter
	public int getLine() { return line; }
	
	//setter
	public void setLine(int line) {
		if(line<1) {
			System.out.print("다시 입력해주세요");
			return;
		}
		this.line = line;
	}
	public abstract void findLine();
	
}
