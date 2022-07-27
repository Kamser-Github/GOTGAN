package day3.methodlab;

import java.util.Random;

public class MethodLab2 {
	
	public static int method(int num1,int num2) {
		
		return (int)Math.sqrt((num1-num2)*(num1-num2));
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0 ; i<5 ; i++) {
			int num1 = (int)(Math.random()*30)+1;
			int num2 = new Random().nextInt(30)+1;
			System.out.printf("%4d와%4d의 차이는 %4d입니다\n",num1,num2,method(num1,num2));
		}
	}
}
