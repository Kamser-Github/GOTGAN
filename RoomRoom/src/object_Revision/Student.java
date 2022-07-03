package object_Revision;

public class Student {

	String studentName;
	int studentAge;
	Subject math;
	Subject korea;
	
	public Student(String name,int age) {
		this.studentName = name;
		this.studentAge = age;
		
		math = new Subject("수학");
		korea = new Subject("국어");
	}
	
	public String getName() {
		return studentName;
	}
	
	public int getAge() {
		return studentAge;
	}
	
	public void showInfo() {
		System.out.println(getAge());
		System.out.println(getName());
	}
	
	
	public void setKorea(int score,String name,int room) {
		korea.setScore(score);
		korea.setTeacher(name);
		korea.setRoom(room);
	}
	
	public void setMath(int score,String name,int room) {
		math.setScore(score);
		math.setTeacher(name);
		math.setRoom(room);
	}
	
	public void showMath() {
		math.getRoom();
		math.getScore();
		math.getTeacher();
	}
}
//접근제한자 메모리타입 리턴타입 메소드명(파라미터or아규먼트 -> 매개변수){ 
//명령 

