package array_702;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKang = new Student("KANG");
		studentKang.addSubjectList(90, "국어");
		studentKang.addSubjectList(90, "영어");
		studentKang.addSubjectList(90, "미술");
		studentKang.showStudentInfo();
	}
}
