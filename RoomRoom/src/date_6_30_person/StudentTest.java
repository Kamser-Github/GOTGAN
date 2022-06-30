package date_6_30_person;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentKang = new Student(0415, "kang");
		studentKang.setSubject(50, 50);
		//수업이 여러개일 경우
		//과목 하나 이상을 안들을 경우
		//전체 점수의 평균을 구하기
		studentKang.getTotal();
	}

}
