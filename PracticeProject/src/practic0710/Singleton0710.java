package practic0710;

public class Singleton0710 {

	private static Singleton0710 instance = new Singleton0710();

	private Singleton0710() {

	}

	public static Singleton0710 getInstance0710() {
		if (instance == null)
			instance = new Singleton0710();
		return instance;
	}

	public static void main(String[] args) {
		
		Singleton0710 myPratice = Singleton0710.getInstance0710();
		Singleton0710 myPratice2 = Singleton0710.getInstance0710();
		System.out.println(myPratice == myPratice2);
	}

}