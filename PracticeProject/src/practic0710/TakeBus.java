package practic0710;

public class TakeBus {
	
	int money;
	int busNumber;
	int passengerCount;
	
	public TakeBus(int number) {
		this.busNumber = number ;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스 "+busNumber + "번의 승객은 총"+ passengerCount +"명이고 "
				+ "\n수입은 "+money + "입니다.");
	}

}