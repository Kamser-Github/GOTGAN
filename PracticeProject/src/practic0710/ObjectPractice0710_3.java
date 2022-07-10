package practic0710;

class Student{
	private int studentAge;
	private String studentName;
	private int score;
	
	public Student(int studentAge,String studentName) {
		this.studentAge = studentAge;
		this.studentName = studentName;
	}
	// 이때 첫번째 생성자를 쓰게되면 score 값에 null이 기본값으로 초기화가 우려된다.
	// 따라서 정적팩토리 메소드를 이용하는 걸 연습해보자.
	
//	public Student(int studentAge,String studentName,int score) {
//		this.studentAge = studentAge;
//		this.studentName = studentName;
//		this.score = score;
//	} 아래와 같이 코드의 중복을 피할수 있게 하면서
	//코드의 안정성과 관리가 용이 해진다.
	
	public Student(int studentAge,String studentName,int score) {
		this(studentAge, studentName);
		this.score = score;
	}
	//아래와 같이 팩토리 메소드를 써서 한다는데.
	// 아직 잘 모르겟다.
	public static Student withScore(int studentAge,String studentName,int score) {
		return new Student(studentAge,studentName,score);
	}
	
	public Student(Person person) {
		this(person.getAge(),person.getName());
	}
}

class Person{
	private int personAge;
	private String personName;
	
	public Person(int personAge, String personName) {
		this.personAge = personAge;
		this.personName = personName;
	}
	
	public String getName() {
		return this.personName;
	}
	
	public int getAge() {
		return this.personAge;
	}
}

public class ObjectPractice0710_3 {

	public static void main(String[] args) {
		
		Person person1 = new Person(30, "kang");
		Student person2 = new Student(person1);
		//이렇게 객체 캡슐화를 통해서 클래스 내에 있는 메소드나 멤버변수를 가릴수 있다.
		//여기서 추가로 score라는 항목을 추가 하고 싶을때
		//코드의 중복을 피하는 방법이 있다
	}

}