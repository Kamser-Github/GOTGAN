package kr.co.lang;

class MyDate{
	
	int day;
	int month;
	int year;
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	//구현부는 같아야한다.
	public boolean equals(Object obj) {
//		if(!(obj instanceof MyDate)) {
//			return false;
//		}else {
//			MyDate my = (MyDate)obj;
//			if(day==my.day && 
//					month==my.month &&
//						year==my.year) {
//				return true;
//			}else
//				return false;
//		} //위에식은 한눈에 보기 어렵다.
		//논리 연산자는 항상 결과값이 true나 false가 나온다는걸 잊엇다.
		if(obj instanceof MyDate) {
			MyDate my = (MyDate)obj;
			return ( day==my.day&& month==my.month && year==my.year);
		}else
			return false;
	}
}


public class Equals02 {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		
		System.out.println(date1.equals(date2));
		//오버라이딩전 false
		//오버라이딩을해서 true가 나오게 해보자
	}
}
