package day3.methodlab;

public class MethodLab6 {
	//65 90
	public static char[] alphaArray(int[] arr) {
		char[] alp = new char[arr.length];
		for(int i=0 ; i<alp.length ; i++) {
			alp[i]=(char)(arr[i]+64);
		}
		return alp;
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = MethodLab3.getRandom(26);
		}
		for(char a : alphaArray(arr)) {
			System.out.print(a);
		}
		
	}
}
