package day0719b;

	//���� ���� ���ؿ�����
public class Subject01 {
	
	private String name;
	private int score;
	
	//������ �����
	public Subject01() {
		this("�������",0);
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
	
	//�����̸�,������ ���� ���
	public String toString() {
		return "���� : "+name+"\n���� : "+score;
	}
	
}
