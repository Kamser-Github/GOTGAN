package day0717;

public class ObjectPractice01 {
	
	public static void main(String[] args) {
		Passenger lee = new Passenger(3500, "lee");
		Passenger kang = new Passenger(13500, "kang");
		
		Bus bus1131 = new Bus(1131);
		Sub sub2line = new Sub(2);
		
		lee.takeBus(bus1131);
		lee.takeSub(sub2line);
		
		kang.takeSub(sub2line);
		lee.takeBus(bus1131);
		
		kang.passInfo();
		lee.passInfo();
		bus1131.showInfo();
		sub2line.showInfo();
	}
}


class Bus{
	int busNum;
	int busPerson;
	int busMoney;
	
	Bus(int busNum){
		this.busNum = busNum;
	}
	
	public void take(int money) {
		busMoney +=money;
		busPerson++;
	}
	
	public void showInfo() {
		System.out.println(busNum+"버스 수입은 : "+busMoney+"\n오늘 탄 손님은 : "+busPerson+"명입니다.");
	}
}

class Sub{
	int subline;
	int subPerson;
	int subMoney;
	
	Sub(int subline){
		this.subline = subline;
	}
	
	public void take(int money) {
		subMoney +=money;
		subPerson++;
	}
	
	public void showInfo() {
		System.out.println(subline+"호선 수입은 : "+subMoney+"\n오늘 탄 손님은 "+subPerson+"명입니다.");
	}
}

class Passenger{
	int passMoney;
	String	name;
	
	Passenger(int money,String name){
		passMoney = money;
		this.name = name;
	}
	
	void takeBus(Bus bus) {
		bus.take(1200);
		passMoney -=1200;
	}
	
	void takeSub(Sub sub) {
		sub.take(1500);
		passMoney -=1500;
	}
	
	public void passInfo() {
		System.out.println(name+"님의 남은 금액은"+passMoney+"입니다.");
	}
}