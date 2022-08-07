package ignorance.jenerics;

class Person {
	private String name;
	//생성자
	public Person(String name) {
		setName(name);
	}
	//getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}
class Student extends Person {
	public Student(String name) {
		super(name);
	}
}
class HighStudent extends Student{
	public HighStudent(String name) {
		super(name);
	}
}
class Worker extends Person {
	public Worker(String name) {
		super(name);
	}
}
class Course<T> {
	
	private String courseName;
	private T[] students;
	
	public Course(String courseName,int capacity){
		setCourseName(courseName);
		students = (T[])(new Object[capacity]);
		//T가 결정되지 않은 상태이기 때문에 new T[capacity]는 안됀다.
		//Object로 받아서 강제로 T[]으로 형변환 시킨다.
	}
	
	//getter / setter
	public String getCourseName() {
		return courseName;
	}
	public T[] getStudents() {
		return students;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void addStudents(T student) {
		final int TOTAL_NUMBER = students.length;
		for(int i=0 ; i<TOTAL_NUMBER ; i++) {
			if(students[i] == null ) {
				students[i] = student;
				break;
			}
		}
	}
}



public class WildCardEx01 {
	//1번
	public static <T extends Student> void registerCourse(Course<T> course){}
	//2번
	public static <T>void registerCourseFree(Course<?> course){}
	//3번
	public static <T> void registerCourseSuper(Course<? super Worker> course){}
	//3번은 studyable을 구현한 클래스여야하고.
	// 
	public static void main(String[] args) {
		
		
		
		//1번 스태틱 지네릭 메서드에서 제한할때. 
		//course<T>라도 Student과 그 자손만 가능하다
		//registerCourse(new Course<Worker>("홍길동",5));
		registerCourse(new Course<Student>("이순신",5));
		//registerCourse(new Course<Person>("이순신",5));
		registerCourse(new Course<HighStudent>("이순신",5));
		//registerCourse(new Course<String>("이순신",5));
		
		//2번 <?>일 경우에는 무엇이든지 다 들어와진다.
		registerCourseFree(new Course<Worker>("홍길동",5));
		registerCourseFree(new Course<Student>("이순신",5));
		registerCourseFree(new Course<Person>("이순신",5));
		registerCourseFree(new Course<HighStudent>("이순신",5));
		registerCourseFree(new Course<Object>("이순신",5));
		registerCourseFree(new Course<String>("이순신",5));
		
		//3번 <? super Worker>
		//Course 생성자를 만든 Worker 포함 그 조상만 가능하다.
		registerCourseSuper(new Course<Worker>("홍길동",5));
		//registerCourseSuper(new Course<Student>("이순신",5));
		registerCourseSuper(new Course<Person>("이순신",5));
		//registerCourseSuper(new Course<HighStudent>("이순신",5));
		registerCourseSuper(new Course<Object>("이순신",5));
		//registerCourseSuper(new Course<String>("이순신",5));
		
		//그러면
		//<T extends Comparable<? super T>>
		/*
		의 뜻은
		T로 들어올수있는 지네릭 타입은 Comparable을 구현하고 있어야하며.
		Comparable<? super T>는
		Comparable을 생성자로 쓴 지네릭타입 T과 그 조상이 들어올수있다.
		예)
		new Comparable(){
			@Override
			compareTo(){
			가 와야 한다는것,
			}
		다른걸로
		Comparator<? super T>는
		Comparator를 생성자로 가져오고 그 타입변수로 T와 그 조상이 들어올수 있다는것
		그럼
		예)
		Comparable Students = new Comparable(){
			@Override
			compare(student o1,student o2){
				if(o1.getAge < o2.getAge){
					return -1 ; 이건 오름차순
					return 1; 이건 내림차순
		*/
	}
}
