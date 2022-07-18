package day0718;
/*
		�������
	1.�� �� �� �ν��Ͻ� /������ �ʵ� �ۼ�
	2.���� ����ϴ� �ż��� �߰�
	3.���� �߰��ϴ� �ż��� �߰�

*/
class Date01{
	private int year;
	private int month;
	private int day;
	
	//�̷��� this�����ڷ� �ߺ������� ���ϼ��ְ�
	//�Ǽ��� ���δ�.
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
	//�ٸ� �ν��Ͻ��� �����ϴ� ������
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

	//������ ����Ҷ��� �����ؼ�
	public String printDay() {
		String[] week = {"��","��","ȭ","��","��","��","��"};
		return String.format("%4d�� %02d�� %02d�� (%s)", year,month,day,week[dayofWeek()]);
	}

	//��¥�� �������ִ� �ż���
//	public Date01 copyDay(Date01 date) {
//		Date01 tmp = new Date01();
		//����� �ϳ��ϳ� ��Ҹ� �־�����ؼ� �����ϴ�.
	//��¥�� �����ϴ� ������

}
public class DateObjectPractice01 {
	public static void main(String[] args) {
		Date01 data01 = new Date01();
		System.out.println(data01.printDay());
	}
}


