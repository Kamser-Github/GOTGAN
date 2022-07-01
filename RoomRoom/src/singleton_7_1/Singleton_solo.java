package singleton_7_1;

import java.util.Calendar;

public class Singleton_solo {
	

	public static void main(String[] args) {
	/*instance를 하나로 만들고 싶을 경우;
	SingletonPractice oner1 = new SingletonPractice();
	
	SingletonPractice oner2 = new SingletonPractice();
	*/
	
	SingletonPractice oner = SingletonPractice.getFaker();
	SingletonPractice keria = SingletonPractice.getFaker();
	
	System.out.println(oner);
	System.out.println(keria);
	//@372f7a8d 저장된 메모리값이 같다.
	//호출하는 메모리 위치가 같다;
	
	//singleton type Calendar;
	
	Calendar time = Calendar.getInstance();
	System.out.println(time.getTime());
	
	}
	
	

}