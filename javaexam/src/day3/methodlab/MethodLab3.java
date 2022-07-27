package day3.methodlab;

public class MethodLab3 {
	
	public static int getRandom(int n) {
		return (int)(Math.random()*n)+1;
	}
	public static int getRandom(int n,int n2) {
		return (int)(Math.random()*n2-n)+n+1;
	}
	
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			int tmp=(i>4)? getRandom(10,20) : getRandom(10);
			System.out.print(tmp+" ");
			if(i==4) System.out.println();
			
		}
	}
}
