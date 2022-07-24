package test01;

import kr.co.interface3.*;
public class PlayerTest01 {
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
//		p1.doGo(1);
		p1.upperPlayerLevel();
		p1.doGo(2);
		p1.upperPlayerLevel();
		p1.doGo(3);
		
	}
}
