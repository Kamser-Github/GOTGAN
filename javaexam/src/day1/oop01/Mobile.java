package day1.oop01;

public abstract class Mobile {
	
	private String mobileName;
	private int batterySize;
	private String osType;
	
	Mobile(){}
	Mobile(String mobileName,int batterySize,String osType){
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public abstract void operate(int time);
	public abstract void charge(int time);
	
	//getter
	public int getBatterySize() {
		return batterySize;
	}
	public String getMobileName() {
		return mobileName;
	}
	public String getOsType() {
		return osType;
	}
	
	//setter
	public void setBatterySize(int time) {
		batterySize=time;
	}
	
}
