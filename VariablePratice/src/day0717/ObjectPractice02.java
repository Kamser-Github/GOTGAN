package day0717;

public class ObjectPractice02 {
	
	public static void main(String[] args) {
		
		Passenger1 lee = new Passenger1("lee", 4500);
		Passenger1 kang = new Passenger1("kang", 3500);
		
		Bus1 bus1311 = new Bus1(1311, 2650);
		Bus1 bus472	= new Bus1(472,1250);
		Sub1 sub2line = new Sub1(2,1250);
		Sub1 subKTX = new Sub1(10,4500);
		
		lee.take(bus472);
		lee.take(subKTX);
	}

}

//1.�������� ������ �ٸ���
//2.����ö ���� ������ �ٸ���
//3.�մ��� ���� ���� ��츦 �־�ڽ��ϴ�.

class Bus1{
	int busNumber;
	int price;
	int money;
	int bus1Person;
	
	Bus1(){}
	Bus1(int busNumber,int price){
		this.busNumber = busNumber;
		this.price = price;
	}
	
	public void takeBus1() {
		bus1Person++;
		money += price;
	}
}

class Sub1{
	int SubLine;
	int price;
	int money;
	int sub1Person;
	
	Sub1() {}
	Sub1(int SubLine,int price){
		this.SubLine = SubLine;
		this.price = price;
	}
	
	public void takeSub1() {
		sub1Person++;
		money += price;
	}
	
}

class Passenger1{
	String name;
	int money;
	
	Passenger1(String name,int money){
		this.name = name;
		this.money = money;
	}
	
	public void take(Bus1 bus) {
		if(money<bus.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
		money -= bus.price;
		bus.takeBus1();
		System.out.println(bus.price+"���� �Դϴ�.");
		}
	}
	
	public void take(Sub1 sub) {
		if(money<sub.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
		money -= sub.price;
		sub.takeSub1();
		System.out.println(sub.price+"���� �Դϴ�.");
		}
	}
}