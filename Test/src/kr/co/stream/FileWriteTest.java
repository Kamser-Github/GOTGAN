package kr.co.stream;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteTest {
	
	public static void main(String[] args) {
		
		try(FileWriter fw= new FileWriter("c:/iotest/sample2.txt")){
			
			char[] ch = {'비','오','나','널','해'};
			fw.write("사랑해");
			fw.append('A');
			fw.write(ch);
			fw.append(ch.toString());
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
