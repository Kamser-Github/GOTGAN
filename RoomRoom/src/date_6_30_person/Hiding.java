package date_6_30_person;

class Date {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(1 > day || day >31 ) {
			System.out.println("날짜 오류 입니다.");
		} {this.day = day;}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class Hiding {
	
	public static void main(String[] args) {
		Date myHappy = new Date();
		myHappy.setDay(28);
		myHappy.setMonth(4);
		myHappy.setYear(2022);
		int day = myHappy.getDay();
	}
	
}
