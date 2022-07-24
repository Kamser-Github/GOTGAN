package test01;
import kr.co.interface6.*;
public class AppTest01 {
	
	public static void main(String[] args) {
		
		App app = new ExpressBust();
		app.setRegion("����", 5, 5);
		app.setRegion("�뱸", 15, 15);
		app.setRegion("�λ�", 25, 25);
		
		Available lee = new ExpressBust();
		Available kang = new Subway();
		Available pack = new MugunghwaLake();
		Kakao ka = new Kakao();
		ka.show(lee, 0, 2);
	}
}
