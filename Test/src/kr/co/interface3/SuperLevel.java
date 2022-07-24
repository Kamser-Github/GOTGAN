package kr.co.interface3;

public class SuperLevel extends PlayerLevel {
	
	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}
	@Override
	public void jump() {
		System.out.println("천장에 닿을정도로 점프합니다.");
	}
	@Override
	public void turn() {
		System.out.println("빠르게 턴을 합니다.");
	}
	@Override
	public void showLevelMessage() {
		System.out.println("랭커 입니다.");
	}
}
