package singleton_7_1;

public class SingletonPractice {
	
	private SingletonPractice() {}
	//외부에서 호출하지 못하게 하겠다.
	
	private static SingletonPractice faker = new SingletonPractice();
	//private 이유
	//null or 값이 변경되면 안되기때문이다;
	//단 하나의 값을 공유할거기 때문에 static을 넣어준다
	//가져다 쓰게 만들기위해 get()을 만든다;
	
	public static SingletonPractice getFaker() {
		if(faker == null) {
			faker = new SingletonPractice();
		}
		//instance 값이 없다면 만들어준다;
		return faker;
	}
	//객체를 외부에서 가져다 쓸수있다;
	//가져다 쓸려고했는데 매서드가 일반 매서드라서
	//객체를 생성하고서도 계속 불러야한다;
	//객체를 생성하지 않고도 부르는 방법은 static
	
}
