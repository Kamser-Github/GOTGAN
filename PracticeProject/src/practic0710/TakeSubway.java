package practic0710;

public class TakeSubway {

	int LineNumber;
	int passergerCount;
	int money;
	
	public TakeSubway(int number) {
		this.LineNumber = number;
	}
	
	public void take(int money) {
		this.money += money;
		this.passergerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(LineNumber+ "의 승객은 "+passergerCount +"명이고 "
				+ "\n 금일 수익은 "+ money +"입니다");
	}
	
}