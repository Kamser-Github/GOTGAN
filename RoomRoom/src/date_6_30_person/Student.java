package date_6_30_person;

public class Student {
	
	String studentName;
	int studentID;
	
	Subject korea;
	Subject math;
	
	public Student(int id,String name) {
		this.studentID = id;
		this.studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");
		
	}
	public void setSubject(int koreaScore,int mathScore) {
		korea.setScore(koreaScore);
		math.setScore(mathScore);
	}
	
	public void getTotal() {
		int total = korea.score + math.score;
		korea.getSubjectName();
		math.getSubjectName();
		System.out.println(total);
	}
}
