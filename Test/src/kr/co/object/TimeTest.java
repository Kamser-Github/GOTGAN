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
			System.out.println("������ �ٽ� �������ּ���.");
		}
		this.hour = hour;
		System.out.println(hour+"�� �� ����Ǿ����ϴ�");
	}
	public void setMinute(int num) {
		if(isNotMinuteOrSeconds(num)) {
			System.out.println("������ �ٽ� �������ּ���.");
		}
		minute = num;
		System.out.println(num+"������ ����Ǿ����ϴ�");
	}
	public void setSeconds(int num) {
		if(isNotMinuteOrSeconds(num)) {
			System.out.println("������ �ٽ� �������ּ���.");
		}
		seconds = num;
		System.out.println(num+"�ʷ� ����Ǿ����ϴ�");
	}
	//�������޼���
	//�̶� �Ʒ� �޼���� Ŭ���� ���ο����� ���ư��� �ż��� �̱⶧����
	//���� ���� �����ڸ� public�� �ƴ϶� private���� �ϴ°� ����.
	/*public*/private boolean isNotHour(int hour) {
		return hour>23 || hour<1 ;
	}
	/*public*/private boolean isNotMinuteOrSeconds(int num) {
		return num>59 || num<1 ;
	}
	
	//��� ������ ������ִ� �޼���
	public String toString() {
		return "����� �ð��� "+hour+"�� "+minute+"�� "+seconds+"�� �Դϴ�";
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
