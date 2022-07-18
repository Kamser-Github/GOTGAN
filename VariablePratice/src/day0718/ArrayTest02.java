package day0718;

public class ArrayTest02 {
	public static void main(String[] args) {
		
		ArrayTest02 arr = new ArrayTest02();
		
	}
	
	int add(int a , int b) {
		return a+b;
	}
	
	void add(int a, int b ,int i,int[] c) {
		c[i] = (a>b)? a : b;
	}
}
