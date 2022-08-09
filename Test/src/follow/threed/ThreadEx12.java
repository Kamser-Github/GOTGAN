package follow.threed;

public class ThreadEx12 {
	
	//동기화가 안된 매서드를 사용한 상태
	public static void main(String[] args) {
		
		//공유객체 생성
		ThreadInfo info = new ThreadInfo();
		//쓰레드 생성 A,B
		UserA userA = new UserA();
		UserB userB = new UserB();
		//공유객체 참조값 전달
		userA.setThreadInfo(info);
		userB.setThreadInfo(info);
		//출력
		userA.start();
		userB.start();
		//UserA 50 > 100이 아니라 덮어씌워진다.
		//UserB 50
	}
}
//공유객체를 쓰는 UserA
class UserA extends Thread {
	
	private ThreadInfo info;
	
	public void setThreadInfo(ThreadInfo info) {
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
class UserB extends Thread {
	
private ThreadInfo info;
	
	public void setThreadInfo(ThreadInfo info) {
		//이름을 출력하기로 했으니 이름까지 세팅한다.
		this.setName("UserB");
		this.info = info;
	}
	@Override
	public void run() {
		info.setMemory(50);
	}
}
class ThreadInfo {
	
	private int memory;
	
	//setter
	public void setMemory(int memory) {
		this.memory = memory;
		try{Thread.sleep(2000);
		} catch (Exception e) {};
		System.out.println(Thread.currentThread().getName()+" "+this.memory);
	}
}