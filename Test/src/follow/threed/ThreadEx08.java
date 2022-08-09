package follow.threed;

public class ThreadEx08 {
	
	public static void main(String[] args) {
		
		Thread thSpeed5 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0 ; i<300 ; i++) {
					System.out.print("-");
					for(int x=0 ; x<1000000 ; x++);
					//시간 지연을 위해 공회전을 시키는중...
				}
			}
		});
		
		Thread thSpeed7 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0 ; i<300 ; i++) {
					System.out.print("|");
					for(int x=0 ; x<1000000 ;x++);
				}
			}
		});
		
		/*
		setPriority는 상대적인 수치이다.
		1 ,9 두개라도 할지라도
		상대적인거다
		이 우선순위를 들고 자바가 os스케줄러에게 요청하지만
		권고사항일 뿐이라 우선순위가 낮아도 먼저 마무리가 될수잇다.
		
		
		
		*/
		thSpeed7.setPriority(7);
		thSpeed7.start();
		thSpeed5.start();
	}
}
