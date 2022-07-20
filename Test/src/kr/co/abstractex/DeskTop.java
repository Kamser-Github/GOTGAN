package kr.co.abstractex;

public class DeskTop extends Computer{
	
	public DeskTop() {}
	
	public void display() {
		System.out.println("모니터는 따로 구매해야합니다.");
	}
	public void typing() {
		System.out.println("키보드는 따로 구매해야합니다.");
	}
	
	public void playGame() {
		System.out.println("게임을 할수있습니다.");
	}
}