package kr.co.abstractex;

public class ManualCar extends Car {
	
	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
	
	public void changeGear() {
		System.out.println("속도 변환을 위해 기어를 바꿉니다.");
	}
}
