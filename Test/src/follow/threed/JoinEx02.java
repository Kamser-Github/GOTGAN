package follow.threed;

public class JoinEx02 {
	
	public static void main(String[] args) {
		TreadJoinEx02 tj = new TreadJoinEx02();
		tj.setDaemon(true);
		tj.start();
		
		int requiredMemory = 0;
		
		for(int i=0 ; i<20 ; i++) {
			requiredMemory = (int)(Math.random()*10)*20;
			
			//사용조건
			if(tj.freeMemory()<requiredMemory ||
					tj.freeMemory()<tj.totalMemory()*0.4){
				tj.interrupt();
			}
			tj.usedMemory += requiredMemory;
			System.out.println("userdMemory:"+tj.freeMemory());
		}
	}
}

class TreadJoinEx02 extends Thread{
	
	final static int MAX_MEMORY=1000;
	int usedMemory = 0;
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(10*1000);
			} catch(InterruptedException e) {
				System.out.println("interrupete 발생");
			}
			gc();
			System.out.println("Garbage Collected,Free Memory:"+freeMemory());
		}
		
	}
	
	public void gc() {
		if(usedMemory<300) usedMemory = 0;
		usedMemory -= 300;
	}
	public int totalMemory(){
		return MAX_MEMORY - usedMemory;
	}
	public int getTotalMemory() { return MAX_MEMORY; }
	public int freeMemory() { return MAX_MEMORY-usedMemory;}
}