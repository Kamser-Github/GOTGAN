package day2.exception1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHanding1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			// 예외가 발생하면 Exception 객체가 생성되는데
			// 그게 catch로 들어가면서 e가 그 참조 변수가 된다.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			// 예외 상황 자체를 막는게 아니라 상황을 알릴수있고.비정상 종료를 막는다.
			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}
}
