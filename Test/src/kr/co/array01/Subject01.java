package kr.co.array01;


//과목
public class Subject01 {
	
	private String name;
	private int score;
	
	//생성자 초기화
	public Subject01(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}
