package day3;

public class ArrayObject0713 {
	
	public static void main(String[] args) {
		
		Suty[] people = new Suty[3];
		//Suty 객체배열 타입의 people이라는 변수가 생겼다.
		//new 연산자로 객체배열 3칸짜리를 만들었고
		//객체의 기본값인 null로 초기화 되어있다.
		//즉 people 변수 저장소에 객체배열 3칸짜리 주소만 들어있는것.
		
		
		
		
		for(int i = 0 ; i<people.length; i++) {
			people[i] = new Suty();
		}
		
		//내용물이 아무것도 없는데
		//객체참조 변수에 배열 3칸짜리 주소를 넣었고.
		//배열 칸 마다 인스턴스를 초기화해서 각 방에 주소값을 넣어줬다.
		
		//people에는 people[] 배열의 객체 주소가 들어잇고
		//people[i]에는 people 인스턴스 주소가 저장되어잇다.
		
		
	}
}
class Suty{
	int x;
}