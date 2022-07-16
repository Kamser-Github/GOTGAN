package day0716;

public class StudentTest01 {
	
	public static void main (String[] args) {
		
		Student01 lee = new Student01("lee", 100145 )	;
		lee.setKorea(50);
		lee.setMath(75);
		
		int result = lee.getTotal();
		System.out.println(lee.getTotal());
		
		System.out.println(lee.getAve(result));
		
	}
}
