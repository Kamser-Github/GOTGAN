package kr.co.stream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
	
	public static void main(String[] args) {
		
		byte[] bt = new byte[26];
		byte data = 65;
		for(int i=0; i<bt.length ; i++) {
			bt[i] =data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("c:/iotest/sample2.txt")){
			
			fos.write(bt);
			fos.write('\n');
			fos.write(bt, 5, 10);
			//out 우리가 쓴걸 밖으로 보낸다.
			//in 써있는걸 가져온다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("다 마무리 되었습니다.");
	}
}
