package kr.co.lambda;

public class LambdaEx03 {
	
	public static Runnable thread1() {
		Runnable run = ()-> System.out.println("사랑해 쓰레드야 !!");
		return run;
	}
	public static void thread2(Runnable run) {
		run.run();
	}
	
	public static void main(String[] args) {
		
		Runnable ruun = new Runnable() {
			@Override
			public void run() {
				System.out.println("사랑해 쓰레드야!");
			}
		};
		
		Runnable ruun2 = ()-> System.out.println("사랑했다 쓰레드야");
		
		Thread thr = new Thread(thread1());
		Thread thr2 = new Thread(ruun);
		Thread thr3 = new Thread(ruun2);
		Thread thr4 = new Thread(()->System.out.println("사랑해! 쓰레드야"));
		
		//이렇게도 가능하다는거고
		//참조변수도없애서 바로 생성자에 붙이면
		new Thread(()->System.out.println("사랑한다고 쓰레드야")).start();
		//위와 같이 가능하고
		//같은 Runnable을 구현하는 방법이 다양하게 되었다
		
	}
}
