package follow.threed;

public class JoinEx03 {
	//생각하고 코딩하기
	/*
	가비지컬렉터를 구현하는 쓰레드를 작성
	join을 활용하여 작업하는 시간을 주자.
	가비지 컬렉터 역할 쓰레드
	int 사용하고있는 메모리값.
	int 메모리 최대치 
	Daemon쓰레드는 불러준 쓰레드가 완료되면 같이 완료되기때문에
	while문으로 계속 반복한다.
	run() 오버라이딩 해야하고
	메인스레드가 불러주지 않아도 10초마다 반복한다.
	가비지컬렉서 메소드는
	사용하고있는 메모리에 값을빼고
	그 값이 0보다 작으면 0으로 초기화한다.
	*/
	public static void main(String[] args) {
		
		ThreadJoinEx03 gc = new ThreadJoinEx03();
		gc.setDaemon(true);
		gc.start();
		
		int requiredMemory = 0;
		
		for(int i=0; i<20 ; i++) {
			requiredMemory = (int)(Math.random()*10+1)*20;
			//사용하고 있는 메모리
			if(gc.freeMemory()<requiredMemory 
					|| gc.freeMemory() < gc.totalMemory()*0.4) {
				gc.interrupt();
				//작업할 시간을 준다
				try {
					gc.join(100);
				} catch (InterruptedException e) {}
			}
			
			gc.setUsedMemory(requiredMemory);
			System.out.println("가비지 컬렉터 작동후 사용가능한 메모리: "+gc.freeMemory());
			
		}
	}
}

class ThreadJoinEx03 extends Thread {
	
	private int MAX_MEMORY = 1000;
	private int usedMemory = 0;//사용중 메모리
	
	@Override
	public void run() {
		//일단 10초 대기
		while(true) {
			try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				System.out.println("가비지 컬렉터 개시");
			}
			gc();
			System.out.println("가비지컬렉터가 실행되었습니다.남은 메모리 : ");
		}
	}
	
	private void gc() {
		if(usedMemory<300) {
			usedMemory=0;
			return;
		}
		usedMemory -= 300;
	}
	
	public int totalMemory() { return MAX_MEMORY ; }
	public int freeMemory() { return MAX_MEMORY-usedMemory; }
	public void setUsedMemory(int memory ) { usedMemory+=memory; }
}
