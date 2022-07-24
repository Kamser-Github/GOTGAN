package kr.co.abstract01;

public abstract class Car implements Coverable,startable,driveable,stopable,turnOffable{
	
	private String name;
	private int num1;
	private int num2;
	//생성자
	public Car(String name,int num1,int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}
	//getter
	public String getName() { return name; }
	
	//interface
	@Override
	public void changeCover() {
		String color = "";
		switch(num1) {
		case RED:
			color = "레드";
			break;
		case BLUE:
			color = "파랑";
			break;
		case WHITE:
			color = "하양";
			break;
		default:
			color = "검정";
		}
		System.out.println("선택하신 색상은 "+color);
	}
	public void checkGear() {
		switch(num2) {
		case AUTO:
			System.out.println("자동으로 기어가 변속됩니다.");
		case MANUAL:
			System.out.println("기어는 수동으로 바꺼야합니다.");
		}
	}
	
}

interface startable{
	void start();
}
interface driveable{
	void drive();
}
interface stopable{
	void stop();
}
interface turnOffable{
	void turnOff();
}