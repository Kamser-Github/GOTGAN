package day2.work;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane(){}
	public Plane(String planeName,int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	//getter
	public String getPlaneName() { return planeName; }
	public int getFuelSize() { return fuelSize; }
	//setter
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize+=fuel;
	}
	public abstract void flight(int distance);
	
}
