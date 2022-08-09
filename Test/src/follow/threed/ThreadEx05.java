package follow.threed;

public class ThreadEx05 {
	
	static long startTime = 0;
	
	public static void main(String args[]) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0 ; i<300 ; i++) {
					System.out.print("|");
				}
				System.out.println("소요시간 2: "+(System.currentTimeMillis() - ThreadEx05.startTime));
			}
		});
		
		
		thread.start();
		startTime = System.currentTimeMillis();
		for(int i=0 ; i<300 ; i++) {
			System.out.print("-");
		}
		
		System.out.print("소요시간 1:"+(System.currentTimeMillis() - ThreadEx05.startTime));
	}
}

