package kr.co.stream;
import java.util.Scanner;
public class ScannerTest01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int num = sc.nextInt();
		//구분자를 두고 읽는다.
		System.out.println(name);
		System.out.println(num);
		
		sc.close();
	}
}
