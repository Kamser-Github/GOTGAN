package kr.co.abstract01;

public class Avante extends Car {
	
	public Avante(String name,int num1,int num2) {
		super(name,num1,num2);
	}
	@Override
	public void start() {
		System.out.println("시동을 켭니다");
	}
	@Override
	public void drive() {
		System.out.println("부드럽게 달립니다.");
	}
	@Override
	public void stop() {
		System.out.println("브레이크로 멈춥니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
}
