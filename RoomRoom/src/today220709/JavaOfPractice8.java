package today220709;
//클래스 변수 초기화와 인스턴스 변수 초기화 연습 3;

class Student {
	static int count = 0;
	int studentID;
	{
		++count;
		studentID = count;
	}

}

public class JavaOfPractice8 {

	public static void main(String[] args) {

		Student lee = new Student();
		System.out.println(lee.studentID);
		Student kang = new Student();
		System.out.println(kang.studentID);
		Student park = new Student();
		System.out.println(park.studentID);

	}
}
