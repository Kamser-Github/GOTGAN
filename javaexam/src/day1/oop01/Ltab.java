package day1.oop01;

public class Ltab extends Mobile {
	
	Ltab(){}
	Ltab(String mobileName,int batterySize,String osType){
		super(mobileName, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		setBatterySize(getBatterySize()-10*time);
	}
	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize()+10*time);
	}
}
