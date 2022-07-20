package kr.co.abstractex;

public class NoteBook extends Computer{
	
	public NoteBook() {}
	
	public void display() {
		System.out.println("모니터가 알아서 켜집니다.");
	}
	public void typing() {
		System.out.println("키보드를 누릅니다.");
	}
	
	public void takeWeight() {
		System.out.println("무게가 가벼워 옴기기가 쉽습니다.");
	}
}