package follow.threed;

public class ThreadEx03 {
	//이번에는 Thread 클래스 start()의 역할을
	//알아보는 예제이다.
	public static void main(String[] args) {
		
		ThreadRun tr = new ThreadRun();
		//new 연산자는 메모리에 객체를 할당시켜줘서
		//그 객체를 출력하거나 이동하거나 사용할수있게한다.
		
		tr.run();
//		main(ThreadEx03.java:12)
//		run(ThreadEx03.java:18)
		/*새로운 쓰레드가 생성된게 아니라
		 * main쓰레드에서 run이 실행됐을뿐이다.
		 */
	}
}

class ThreadRun extends Thread {
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}