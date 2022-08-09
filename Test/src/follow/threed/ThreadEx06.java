package follow.threed;

import javax.swing.JOptionPane;

public class ThreadEx06 {
	
	//싱글 쓰레드경우에 입력받는상황에서는 다른걸 일체 안한다.
	public static void main(String[] args) throws Exception
	{
		String input = JOptionPane.showInputDialog("아무값이나 입력해주세요");
		System.out.println("입력하신 값은"+ input+"입니다.");
		
		for(int i=10; i>0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
		
	}
}
