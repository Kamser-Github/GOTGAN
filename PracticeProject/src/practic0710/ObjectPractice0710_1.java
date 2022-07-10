package practic0710;

public class ObjectPractice0710_1 {

	public static void main(String[] args) {

		// 학생 이름을 반환하는 매서드
		Student lee = new Student();
		lee.setStudentName("kang");
		System.out.println(lee.getStudentName());//kang
	}

}

class Student {
	int studentID;
	String studentName ;

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
}

/* 배운거 정리하기
 * 1.클래스는 인스턴스를 생성하면 값이 초기화 된다.
 * 2.멤버변수는 기본값으로 초기화가 되며 지역변수는 사라진다.
 * 3.return은 모든 매서드에 들어있지만
 * 		반환값이 없는 void의 경우에는 안써도 컴파일러가 넣어서 실행한다.
 * 4.int는 0 string null boolean false 로 기본값 초기화된다.
 * 5.클래스 내부에 static이없는 변수나 매서드는
 * 인스턴스 생성후 참조변수를 통해서 값을 바꾸거나 호출할수있다.
 */
