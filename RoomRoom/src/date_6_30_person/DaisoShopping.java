package date_6_30_person;

public class DaisoShopping {
	
	public static void main(String[] args) {
		Daiso daisoSinchon = new Daiso("SinChon");
		daisoSinchon.setCup(1000, 4, 'R');
		daisoSinchon.setPen(2000, 3, 'R');
		daisoSinchon.setWatch(5000, 1, 'R');
		
		daisoSinchon.showInfo();
		
	}
	
}
