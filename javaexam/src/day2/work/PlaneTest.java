package day2.work;

public class PlaneTest {
	
	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane("C40",1000);
		printInfo(plane);
		System.out.println("   [100 운항]");
		for(Plane a : plane) {
			a.flight(100);
		}
		printInfo(plane);
		System.out.println("   [200 주유]");
		for(Plane a : plane) {
			a.refuel(200);
		}
		printInfo(plane);
	}
	
	public static void printInfo(Plane[] list) {
		System.out.printf("%10s\t%10s","Plane","fuelSize\n");
		System.out.println("---------------------------------");
		for(Plane a : list) {
			System.out.printf("%9s\t%8d\n",a.getPlaneName(),a.getFuelSize());
		}
		System.out.println();
	}
	
}
