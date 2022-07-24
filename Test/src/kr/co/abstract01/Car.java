package kr.co.abstract01;

public abstract class Car implements Coverable,startable,driveable,stopable,turnOffable{
	
	private String name;
	private int num1;
	private int num2;
	//������
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
			color = "����";
			break;
		case BLUE:
			color = "�Ķ�";
			break;
		case WHITE:
			color = "�Ͼ�";
			break;
		default:
			color = "����";
		}
		System.out.println("�����Ͻ� ������ "+color);
	}
	public void checkGear() {
		switch(num2) {
		case AUTO:
			System.out.println("�ڵ����� �� ���ӵ˴ϴ�.");
		case MANUAL:
			System.out.println("���� �������� �ٲ����մϴ�.");
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