package test01;

import kr.co.interface5.Krail;
import kr.co.interface5.TransApp;
import kr.co.interface5.Available;
public class KrailTest01 {
	
	public static void main(String[] args) {
		Krail sub = new Krail();
		sub.addSubway(Available.SEOUL, "����", 5, 5);
		sub.addSubway(Available.DEAGU, "�뱸", 15, 10);
		sub.addSubway(Available.BUSAN, "�λ�", 25, 20);
		
		sub.choiceSubway(Available.SEOUL, Available.BUSAN);
		sub.payMoney();
		sub.showTakeTime();
		sub.appearScreen();
		
	}
}
