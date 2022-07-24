package test01;
import kr.co.interface6.*;
public class AppTest01 {
	
	public static void main(String[] args) {
		
		App app = new ExpressBust();
		app.setRegion("서울", 5, 5);
		app.setRegion("대구", 15, 15);
		app.setRegion("부산", 25, 25);
		
		Available lee = new ExpressBust();
		Available kang = new Subway();
		Available pack = new MugunghwaLake();
		Kakao ka = new Kakao();
		ka.show(lee, 0, 2);
	}
}
