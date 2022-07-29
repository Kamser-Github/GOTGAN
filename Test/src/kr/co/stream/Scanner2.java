package kr.co.stream;

import java.util.Scanner;

public class Scanner2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int number = sc.nextInt();
		
		System.out.println(name);
		System.out.println(number);
		
		sc.close();
	}
}
