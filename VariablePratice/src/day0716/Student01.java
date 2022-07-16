package day0716;

public class Student01 {
	
	static int studentID = 1000;
	String studentName;
	int studentNumber;
	Subject01 math;
	Subject01 korea;
	
	Student01(String studentName,int studentNumber){
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		studentID++;
		math = new Subject01();
		korea = new Subject01();
	}
	
	void setMath(int score) {
		math.subjectName = "����";
		math.score = score;
	}
	
	void setKorea(int score) {
		korea.subjectName = "����";
		korea.score = score;
	}
	
	void showStudentInfo() {
		System.out.println("�л� ID : "+studentID);
		System.out.println("�л� �̸� : "+studentName);
		System.out.println("�л� ��ȣ : "+studentNumber);
	}
	
	public int getTotal() {
		int result = math.score + korea.score;
		return result;
	}
	
	public double getAve(int totalScore) {
		double result = (double)totalScore/2;
		return result;
	}
	
	
}

class Subject01 {
	
	String subjectName;
	int score;
	
}