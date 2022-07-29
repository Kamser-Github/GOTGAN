package kr.co.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamTest01 {
	
	public static void main(String[] args) {
		
		FileReader fis = null;
		int i = 0;
		try {
			
			fis = new FileReader("c:/iotest/sample.txt");
			while ( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("end");
		
	}//main end
}
