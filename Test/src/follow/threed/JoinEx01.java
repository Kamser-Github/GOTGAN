package follow.threed;

public class JoinEx01 {
	static long startTime=0;
	
	public static void main(String[] args) {
		
		Thread weapon = new ThreadJoinA();
		Thread shield = new ThreadJoinB();
		weapon.start();
		shield.start();
		
		try {
			weapon.join();
			shield.join();
		} catch (InterruptedException e) {}
			
		System.out.println("전쟁에 나갈 준비가 완료되었습니다 .전하");
		
		
	}
	
	public static void sleep2Sconds() {
		try{Thread.sleep(2*1000);}
		catch(InterruptedException e) {
		}
	}
}

class ThreadJoinA extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			JoinEx01.sleep2Sconds();
			System.out.println("무기를 제작중입니다.");
		}
		System.out.println("○무기 완성○");
	}
}
class ThreadJoinB extends Thread{
	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			JoinEx01.sleep2Sconds();
			System.out.println("방패를 고치고 있습니다.");
		}
		System.out.println("○방패 수리 완료○");
	}
}