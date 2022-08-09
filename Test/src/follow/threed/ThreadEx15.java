package follow.threed;

public class ThreadEx15 {
	//join의 역할 이해하기
	//join은 이게 끝날때까지 기다린다는 의미
	//배달음식 기다렸다가 배달기사가 출발하는것처럼
	
	public static void main(String[] args) {
		
		FoodStore wonMom = new FoodStore();
		wonMom.start();
		
		System.out.println(wonMom.getFood());
		//계속 기다리라고 나온다.
		
		try { wonMom.join();
		} catch (InterruptedException e) {}
		System.out.println(wonMom.getFood());
		//바로 족발이 나온다.
		
		//join은 해당 쓰레드를 일시정지시키는게 아니라
		//그게 해결될때까지 호출한 쓰레드가 기다리겠다는 의미이다.
	}
}


class FoodStore extends Thread {
	
	private int waitTime;
	private String food = "기다리세요";
	@Override
	public void run() {
		
		for(int i=0 ; i<=10000000 ; i++) {
			waitTime = i;
			if(i==10000000)
				food = "족발";
		}
	}
	
	public String getFood() {
		return food;
	}
}