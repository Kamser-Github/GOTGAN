package follow.threed;

//main 쓰레드가 종료가 되어도
//Thread start() 로 보내진 run()은 실행이 된다.
public class ThreadEx02 {
	public static void main(String[] args) throws Exception{
		ThreadException t1 = new ThreadException();
		t1.start();
		/*
		start()매서드가 Thread로 run()을 실행시키고
		run()이 예외를 발생시켜서 main쓰레드를 보낸상태에서
		run()이 나머지 catch를 하는걸 출력하는걸 보여주는 예제이다
		결국 main이 종료가 되어도 계속 실행이 된다는걸 보여준다.
		//run(ThreadEx02.java:20);에서 실행이되었다는걸 보여준다.
		*/
	}
}

class ThreadException extends Thread {
	public void run() {
		throwException();
	}
	public void throwException(){
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}