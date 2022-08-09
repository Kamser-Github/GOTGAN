package follow.threed;

import javax.swing.JOptionPane;

public class ThreadEx07 {
	
	public static void main(String[] args) throws Exception {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=10 ; i>0 ; i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch(Exception e) {}
				}
			}
		});
		/*
		사용자에게 입력을 받는 시간동안 다른 작업이 돌아간다.
		*/
		thread.start();
		
		String input = JOptionPane.showInputDialog("값을 입력해주세요");
		System.out.println("입력하신값은"+input+"입니다.");
		
	}
}
