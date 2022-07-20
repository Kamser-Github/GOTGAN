package test01;

import kr.co.abstractex.*;
public class CarTest {
	
	public static void main(String[] args) {
		Car mycar = new AICar();
		Car mycar2 = new ManualCar();
		
		mycar.run();
		((AICar)mycar).autoStop();
	}
}
