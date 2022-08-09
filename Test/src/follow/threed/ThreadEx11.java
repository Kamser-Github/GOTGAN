package follow.threed;

public class ThreadEx11 {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=10 ; i++) {
			Thread thread = new TestThread("thread"+i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
//10번이 평균 순위가 높긴하다
//동영상 강의에서는 10번이 항상 위던데
//노트북 사양이 좋아서 그런가보다
class TestThread extends Thread {
	
	public TestThread(String str) {
		setName(str);
	}
	
	@Override
	public void run() {
		for(int i=0 ; i<2000000000 ; i++) {
		}
		System.out.println(getName());
	}
}