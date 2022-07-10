package practic0710;

public class ObjectPractice0710_2 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.studentName = "안현수";
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}
}
/*클래스내 멤버 변수를 초기화를 하려면
	생성자를 만들고 참조변수를 통해서 값을 바꾼다.
	매서드도 마찬가지로 static이 안붙은 경우
	Method Area에 저장되어있는게 아니라
	인스턴스 Heap메모리에서 꺼내와야 하기에
	new 연산자로 인스턴스 생성이 필수다.abstract
	*/