package kr.co.abstract01;

public class Avante extends Car {
	
	public Avante(String name,int num1,int num2) {
		super(name,num1,num2);
	}
	@Override
	public void start() {
		System.out.println("�õ��� �մϴ�");
	}
	@Override
	public void drive() {
		System.out.println("�ε巴�� �޸��ϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����ϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
}
