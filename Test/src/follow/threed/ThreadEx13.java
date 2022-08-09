package follow.threed;

public class ThreadEx13 {
	
	//동기화가 안된 매서드를 사용한 상태
	public static void main(String[] args) {
		
		//공유객체 생성
		ThreadInfoTwo info = new ThreadInfoTwo();
		//쓰레드 생성 A,B
		UserAA userAA = new UserAA();
		UserBB userBB = new UserBB();
		//공유객체 참조값 전달
		userAA.setThreadInfo(info);
		userBB.setThreadInfo(info);
		//출력
		userAA.start();
		userBB.start();
//		UserA 100
//		UserB 50    - 시간이 좀더 걸리지만 확실하게 처리된다.
	}
}
//공유객체를 쓰는 UserA
class UserAA extends Thread {
	
	private ThreadInfoTwo info;
	
	public void setThreadInfo(ThreadInfoTwo info) {
		//이름을 출력하기로 했으니 이름까지 세팅한다.
		this.setName("UserA");
		this.info = info;
	}
	@Override
	public void run() {
		info.setMemory(100);
	}
}
//공유객체를 쓰는 UserB
class UserBB extends Thread {
	
private ThreadInfoTwo info;
	
	public void setThreadInfo(ThreadInfoTwo info) {
		//이름을 출력하기로 했으니 이름까지 세팅한다.
		this.setName("UserB");
		this.info = info;
	}
	@Override
	public void run() {
		info.setMemory(50);
	}
}
class ThreadInfoTwo {
	
	private int memory;
	
	//setter
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try{Thread.sleep(2000);
		} catch (Exception e) {};
		System.out.println(Thread.currentThread().getName()+" "+this.memory);
	}
}