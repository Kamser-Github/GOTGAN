package knowdeeply.thread;

public class ThreadOrganize01 {
	
	//쓰레드는 결국 공유 객체를 사용하게된다
	//공부하다보니 이건 정리해두면 좋을거같아서
	//계속 추가로 정리할 예정이다.
}

//1.Runnable 구현하면서 공유객체 가져오기

//공유객채
class House { }

class MyHome implements Runnable{
	
	House home = new House();
	@Override
	public void run() {
		
		//여기서 홈이 가진걸 사용하면된다.
	}
}

/*Thread A = new Thread(MyHome);
 * 객체 home을 같이 나누어 쓰게되는 상황이 나온다.
 */

//2.클래스 자체가 공유를 할때
class MicrowaveOven {
	public MicrowaveOven(String food) {}
} // 공유객체

class Student extends Thread {
	
	MicrowaveOven gimbab ;
	public Student(MicrowaveOven food) {
		gimbab = food;
	}
}

class Worker extends Thread {
	
	MicrowaveOven hamberger;
	
	public Worker(MicrowaveOven food) {
		hamberger = food;
	}
	
}

/*
그러면 여기서 객체만 넣어주면 된다.

Worker worker = new Worker(new MicrowaveOven(food));
Student student = new Worker(new MicrowaveOven(food));

여기서 좀더 간략하게 start()만 해보고 다시 안쓴다면

new Thread(new Worker(new MicrowaveOven(food))).start();
라는것도 가능해진다

비슷한게 입출력 받는것중에서도
한번에 모아서 쓰면 길다
StringTokenizer stz = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
이렇게 한줄로 입력을 받을수도 있다.





*/