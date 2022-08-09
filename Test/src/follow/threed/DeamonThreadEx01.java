package follow.threed;

public class DeamonThreadEx01 {
	
	public static void main(String[] args) {
		
		Alarm alarm = new Alarm();
		alarm.setDaemon(true);
		alarm.start();
		
		for(int i=0 ; i<10 ; i++) {
			if(i == 3) alarm.autoAlarm = true;
			try {
				Thread.sleep(1000);
				System.out.println("졸려서 알람을 끈다");
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("결국 지각했습니다.");
	}
	
}


class Alarm extends Thread{
	
	public boolean autoAlarm = false;
	@Override
	public void run() {
		while(true) {
			try { 
				Thread.sleep(2*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(autoAlarm)
				System.out.println("일어나실 시간입니다.");
		}
	}
}