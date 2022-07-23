package kr.co.object;

class Time{
	
	private int hour;
	private int minute;
	private int seconds;
	
	public Time() {}
	
	//getter
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSeconds() {
		return seconds;
	}
	//setter
	public void setHour(int hour) {
		if(isNotHour(hour)) {
			System.out.println("범위를 다시 지정해주세요.");
		}
		this.hour = hour;
		System.out.println(hour+"시 로 저장되었습니다");
	}
	public void setMinute(int num) {
		if(isNotMinuteOrSeconds(num)) {
			System.out.println("범위를 다시 지정해주세요.");
		}
		minute = num;
		System.out.println(num+"분으로 저장되었습니다");
	}
	public void setSeconds(int num) {
		if(isNotMinuteOrSeconds(num)) {
			System.out.println("범위를 다시 지정해주세요.");
		}
		seconds = num;
		System.out.println(num+"초로 저장되었습니다");
	}
	//참거짓메서드
	//이때 아래 메서드는 클래스 내부에서만 돌아가는 매서드 이기때문에
	//굳이 접근 제어자를 public이 아니라 private으로 하는게 좋다.
	/*public*/private boolean isNotHour(int hour) {
		return hour>23 || hour<1 ;
	}
	/*public*/private boolean isNotMinuteOrSeconds(int num) {
		return num>59 || num<1 ;
	}
	
	//모든 정보를 출력해주는 메서드
	public String toString() {
		return "저장된 시간은 "+hour+"시 "+minute+"분 "+seconds+"초 입니다";
	}
	
}

public class TimeTest {
	
	public static void main(String[] args) {
		
		Time t1 = new Time();
		t1.setHour(23);
		t1.setMinute(25);
		t1.setSeconds(26);
		System.out.println(t1.toString());
		System.out.println(t1);
		
	}
}
