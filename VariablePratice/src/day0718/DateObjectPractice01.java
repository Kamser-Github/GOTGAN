package day0718;
/*
		연습모드
	1.년 월 일 인스턴스 /비정적 필드 작성
	2.요일 계산하는 매서드 추가
	3.계절 추가하는 매서드 추가

*/
class Date01{
	private int year;
	private int month;
	private int day;
	
	//이렇게 this생성자로 중복구문을 줄일수있고
	//실수도 줄인다.
	Date01(){
		this(2022, 1, 1);
	}
	Date01(int year){
		this(year, 1, 1);
	}
	Date01(int year,int month){
		this(year, month, 1);
	}
	Date01(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	//다른 인스턴스를 복사하는 생성자
	Date01(Date01 date){
		this(date.year,date.month,date.day);
	}
	
	//getter
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDay() {return day;}
	
	//setter
	public void setYear(int year) {
		this.year = year;}
	public void setMonth(int month) {
		if(month<1||month>12) return;
		this.month = month;
		}
	public void setDay(int day) {
		if(day<1||day>31) return;
		this.day = day;
		}
	
	//Method
	public int dayofWeek() {
		int y = year;
		int m = month;
		int d = day;
		
		if(m==1 || m==2) {
			y--;
			m+=12;
		}
		return (y + y/4 - y/100 + y/400 +(13*m+8)/5 +d)%7;
	}

	//정보를 출력할때는 정리해서
	public String printDay() {
		String[] week = {"일","월","화","수","목","금","토"};
		return String.format("%4d년 %02d월 %02d일 (%s)", year,month,day,week[dayofWeek()]);
	}

	//날짜를 복사해주는 매서드
//	public Date01 copyDay(Date01 date) {
//		Date01 tmp = new Date01();
		//복사는 하나하나 요소를 넣어줘야해서 불편하다.
	//날짜를 복사하는 생성자

}
public class DateObjectPractice01 {
	public static void main(String[] args) {
		Date01 data01 = new Date01();
		System.out.println(data01.printDay());
	}
}


