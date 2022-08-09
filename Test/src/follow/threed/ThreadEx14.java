package follow.threed;

public class ThreadEx14 {
	
	//지금 연습하는 예제
	//쓰레드의 상태가 여러개이고 중간에 일시정지를 한다.
	//그걸 확인하는 쓰레드를 만들어서 출력창에서 확인해본다.
	
	public static void main(String[] args) {
		
		ThInfo info = new ThInfo(new ThreadA());
		info.start();
		/*	
		 	타겟 쓰레드의 상태 NEW
			타겟 쓰레드의 상태 RUNNABLE
			타겟 쓰레드의 상태 TIMED_WAITING
			타겟 쓰레드의 상태 TIMED_WAITING
			타겟 쓰레드의 상태 TIMED_WAITING
			타겟 쓰레드의 상태 TIMED_WAITING
			타겟 쓰레드의 상태 RUNNABLE
			타겟 쓰레드의 상태 RUNNABLE
			타겟 쓰레드의 상태 TERMINATED
			
			열거형 Enum도 다시한번 되짚어보게 되었다.
			Enum은 크다 작다를 비교하려면 compareTo로 비교하고
			똑같다는 equals나 ==를 써도되지만 ==가 더 빠르다.
		*/
	}
	
}

class ThreadA extends Thread {
	
	@Override
	public void run() {
		
		for(long i=0 ; i<2000000000 ; i++);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {}
		
		for(long i=0 ; i<2000000000 ; i++);
	}
}

class ThInfo extends Thread {
	
	//정보를 볼 쓰레드를 받는다.
	private Thread thread;
	//생성자
	public ThInfo(Thread thread) {
		this.thread = thread;
	}
	
	//
	@Override
	public void run() {
		
		while(true) {
			//쓰레드의 상태를 받는다.
			Thread.State state = thread.getState();
			System.out.println("타겟 쓰레드의 상태 "+state);
			
			if(state == Thread.State.NEW) {
				//타겟쓰레드 상태가 new라면 시작한다.
				thread.start();
			}
			if(state == Thread.State.TERMINATED) {
				//타겟쓰레드 상태가 종료되었으면 같이 종료한다.
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
			
		}
	}
}