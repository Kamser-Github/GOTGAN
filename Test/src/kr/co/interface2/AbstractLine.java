package kr.co.interface2;

//������ �׸���
public abstract class AbstractLine extends Shape  {
	//�� ���� �߰�
	private int line;
	
	//������
	public AbstractLine() {}
	
	//getter
	public int getLine() { return line; }
	
	//setter
	public void setLine(int line) {
		if(line<1) {
			System.out.print("�ٽ� �Է����ּ���");
			return;
		}
		this.line = line;
	}
	public abstract void findLine();
	
}
