package date_6_30_person;

public class Subject {
	
	int score;
	String subjectName;
	
	public Subject(String name) {
		this.subjectName = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void getSubjectName() {
		System.out.println(this.subjectName);
	}
}
