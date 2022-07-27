package day3.methodlab;

public class MethodLab1 {
	
	static void method(char ch,int times) {
		
		for(int i=0 ; i<times ; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		method('@', 3);
	    method('%', 4);
	    method('A', 5);
	    method('가', 3);

	}
}	
