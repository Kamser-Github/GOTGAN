package follow.threed;

public class ThreadEx10 {
	
	public static void main(String[] args) {
		
		//다양한 방법으로 쓰레드 만들어보기
		//2번 생성자로 대입해서 만들기
		Thread threadNew = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0 ; i<2 ; i++) {
					System.out.println("threadNew를 호출시킨 쓰레드 "+Thread.currentThread().getName());
					try {
						ThreadSon.sleep(500);
					} catch (Exception e) {};
				}
			}
		});
		
		Thread son = new ThreadSon("son");
		
		
		System.out.println("son을 호출시킨 쓰레드"+Thread.currentThread().getName());
		son.start();
		/*
		son.start() 매서드를 누가 실행시켜주는거냐 를 알고싶은데 여기서 왜 
		println을 실행시킨 Thread의 이름을 알아서 머하지 싶었는데
		결국 println을 실행시킨다는건
		그아래 메소드인 son.start()를 실행시킨 Thread도 같은 애라는 것
		그래서 위에 print를 실행시킨 Thread의 이름을 호출한것.
		*/
		System.out.println("new을 호출시킨 쓰레드"+Thread.currentThread().getName());
		threadNew.start();
	}
}
//1.쓰레드 자손으로 만들기
class ThreadSon extends Thread{
	
	public ThreadSon(String str) {
		super(str);
	}
	@Override
	public void run() {
		for(int i=0 ; i<2 ; i++) {
			System.out.println("ThreadSon의 이름 " + getName());
			System.out.println("ThreadSon를 호출시킨 쓰레드 "+Thread.currentThread().getName());
			try {
				ThreadSon.sleep(500);
			} catch (Exception e) {};
		}
	}
}

