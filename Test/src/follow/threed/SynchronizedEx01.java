package follow.threed;

public class SynchronizedEx01 {
	
	public static void main(String[] args) {
		
		WithDrawBalance wd = new WithDrawBalance();
		Thread a = new Thread(wd);
		Thread b = new Thread(wd);
		a.start();
		b.start();
	}
	
}
/*
동기화가 없을경우를 연습해보는 예제
둘다 접속을 해서 인출을 하는 쓰레드라면
빼려고하는돈보다 잔고가 적다면
매서드를 실행 할수가 없다

공동객체 은행
출력하는 쓰레드를 구현한 객체

*/
class AcountEx01 {
	private int balance = 1000;
	
	public synchronized int getBalance() {
		return balance;
	}
	
	public synchronized void withDraw(int balance) {
		if(balance<this.balance) {
			this.balance-=balance;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
//출금하는 Runnable
class WithDrawBalance implements Runnable {
	AcountEx01 acc = new AcountEx01();
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int balance = (int)(Math.random()*3+1)*100;
			acc.withDraw(balance);
			System.out.println("출금하였습니다"+acc.getBalance());
		}
	}
}