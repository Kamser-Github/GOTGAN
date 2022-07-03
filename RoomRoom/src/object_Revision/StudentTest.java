package object_Revision;

public class StudentTest {
	
	public static void main ( String[] args) {
		
		Student studentKang = new Student("kang", 30);
		studentKang.setKorea(70, "park" , 102);
		studentKang.setMath(90, "park" , 107);
		
		studentKang.showInfo();
		studentKang.showMath();
		
	}

}

