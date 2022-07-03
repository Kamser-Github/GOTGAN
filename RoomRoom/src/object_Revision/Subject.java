package object_Revision;

public class Subject {

	String SubjectName;
	int SubjectScore;
	String SubjectTeacher;
	int SubjectRoom;
	
	public Subject(String name) {
		this.SubjectName = name;
	}
	
	public void setScore (int num) {
		this.SubjectScore = num;
	}
	public void setTeacher (String name) {
		this.SubjectTeacher = name;
	}
	public void setRoom (int num) {
		this.SubjectRoom = num;
	}
	
	public void getScore() {
		System.out.println(SubjectScore);
	}
	public void getRoom() {
		System.out.println(SubjectRoom);
	}
	public void getTeacher() {
		System.out.println(SubjectTeacher);
	}
}
