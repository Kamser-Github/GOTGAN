package kr.co.stream;

import java.io.IOException;
import java.io.FileWriter;
public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("c:/iotest/sample2.txt")) {
			
			fw.write("A");
			char[] ch = {'b','b','a','w'};
			fw.write(ch,0,2); //Abb 
			fw.write("안녕하세요");
			fw.write("100");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
