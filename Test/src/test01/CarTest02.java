package test01;

import java.io.IOException;
import kr.co.interface4.*;

public class CarTest02 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("어떻게 이동하시겠습니까?");
		System.out.println("C : 자동차로 이동");
		System.out.println("T : 대중교통으로 이동");
		System.out.println("W : 걸어서 이동");
		System.out.println("B : 자전거로 이동");	
		
		int ch = System.in.read();
		Guiding gui = null; //일단 null로 참조변수 저장소를 초기화 해준다.
		while(gui==null) {
			switch(+ch) {
			case +'C': case +'c':
				gui = new Car();
				break;
			case +'T': case +'t':
				gui = new Trans();
				break;
			case +'W': case +'w':
				gui = new Walking();
				break;
			case +'B': case +'b':
				gui = new Bicycle();
				break;
			default :
				System.out.println("다시 입력해주세요");
			}
		}
		gui.findLoad();
		gui.InformTime();
	}
}
