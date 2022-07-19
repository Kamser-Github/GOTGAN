package day0719b;

	//포함 관계 이해연습중
public class Subject01 {
	
	private String name;
	private int score;
	
	//생성자 만들기
	public Subject01() {
		this("과목없음",0);
	}
	public Subject01(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	//private 
	//getter
	public String getName() { return name; }
	public int getScore() { return score; }
	
	//setter
	public void setName(String name) { this.name=name; }
	public void setScore(int score) { this.score=score; }
	
	//교과이름,성적을 같이 출력
	public String toString() {
		return "과목 : "+name+"\n점수 : "+score;
	}
	
}
