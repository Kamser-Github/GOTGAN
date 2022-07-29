package kr.co.stream;
import java.io.FileInputStream;
import java.io.IOException;
public class FileInputSteamTest01 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:/iotest/sample.txt") ){
			byte[] by = new byte[10];
			int i;
			while((i=fis.read(by)) != -1) {
				for(int j=0 ; j<i ; j++) {
					System.out.print((char)by[j]);
				}
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("전부 입력하셨습니다.");
				
	}
}
	
