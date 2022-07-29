package kr.co.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
public class FileCopyTest {
	
	public static void main(String[] args) {
		
		long milliseconds = 0;
		int len = 0;
		try(FileInputStream fis = new FileInputStream("c:/iotest/sample2.txt");
			FileOutputStream fos = new FileOutputStream("c:/iotest/sampleCopy2.txt",true);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			//8k속도
			//
			milliseconds = System.currentTimeMillis();
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis()-milliseconds;		
		} catch (IOException e) {
			
		}
		System.out.println(len);
		System.out.println(milliseconds);
	}
}
