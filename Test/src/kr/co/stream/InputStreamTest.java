package kr.co.stream;
import java.io.FileReader;
import java.io.IOException;
public class InputStreamTest {
	
	public static void main(String[] args) {
		
		
		
		try(FileReader fis = new FileReader("c:/iotest/sample2.txt")){
			int i = 0;
			while((i=fis.read() )!=-1) {
				System.out.print((char)i);
				//fis.read()는 다 읽으면 -1이나온다.
				//-1이 아니면 true 되기때문에 계속 돈다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
