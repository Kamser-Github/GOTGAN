package kr.co.interface3;

public class AdvancedLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("속도를 내며 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("점프는 아직 못합니다/");
	}
	@Override
	public void turn() {
		System.out.println("뒤돌기는 아직 못합니다/");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("중급자 등장");
	}
	
}
