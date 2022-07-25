package day1.oop01;

public class MobileTest {
	
	public static void main(String[] args) {
		Ltab lt = new Ltab("Ltab", 500, "ABC-01");
		Otab ot = new Otab("Otab", 1000, "XYZ-20");
		
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		System.out.printf("\n[%d분 충전]\n",10);	
		lt.charge(10);
		ot.charge(10);
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
		System.out.printf("\n[%d분 통화]\n",5);	
		lt.operate(5);
		ot.operate(5);
		printTitle();
		printMobile(lt);
		printMobile(ot);
		
	}
	public static void printMobile(Mobile mobile) {
		String name = mobile.getMobileName();
		int battery = mobile.getBatterySize();
		String os = mobile.getOsType();
		System.out.println(name+"\t\t"+battery+"\t\t"+os);
	}
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\tOS");
		System.out.println("-------------------------------------");
	}
	
}
