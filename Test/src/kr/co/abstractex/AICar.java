package kr.co.abstractex;

public class AICar extends Car{
	
	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다");
		System.out.println("자동차가 알아서 주행을 합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
	public void autoStop() {
		System.out.println("위험할경우 급정거 합니다.");
	}
}
