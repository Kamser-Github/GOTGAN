package kr.co.interface3;

public class Player {
	
	public PlayerLevel[] levels;
	public PlayerLevel level;
	public int i = 0;
	
	
	
	public Player() {
		levels = new PlayerLevel[] {
				new BeginnerLevel(),
				new AdvancedLevel(),
				new SuperLevel()
				};
		level = levels[i];
	}
	//getter
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upperPlayerLevel() {
		level = levels[++i];
	}
	
	public void doGo(int num) {
		level.go(num);
	}
	
}
