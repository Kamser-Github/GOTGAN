package kr.co.interface3;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	public void go(int num) {
		run();
		for(int j=0 ; j<num ; j++) {
			jump();
		}
		turn();
		showLevelMessage();
	}
}
