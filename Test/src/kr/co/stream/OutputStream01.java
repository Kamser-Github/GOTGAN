package kr.co.stream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class OutputStream01 {

	public static void main(String[] args) {
		
		byte [] bs = new byte[26];
		byte data = 65;
		for(int i=0; i<bs.length ; i++) {
			bs[i]=data++;
		}
		try(FileOutputStream fos = new FileOutputStream("c:/iotest/sample2.txt")){
			
			fos.write(bs);
			System.out.println();
			fos.write(bs,0,10);
			//아스키값으로 문자를 찍어준다.
			//계속 오버라이딩된디ㅏ.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
