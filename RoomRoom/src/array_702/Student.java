package array_702;

import java.util.ArrayList;

public class Student {
	
	static int studentID = 1000;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		Student.studentID++;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubjectList(int subjectScore,String subjectName) {
		
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) {
			System.out.println(s.getSubjectName()+"과목 의 점수는"+s.getSubjectScore());
			total += s.getSubjectScore();	
		}
		System.out.println("총점은 "+total+"입니다");
	}
	
	 
	
	
	

}
