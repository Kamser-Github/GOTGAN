package kr.co.stream;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
public class InputStreamReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		try(InputStreamReader isr = new InputStreamReader( new FileInputStream("c:/iotest/sample2.txt"))){
			//보조 스트림 안에 기반스트림을 넣고 업그레이드를 해준다.
			//바이트를 > 문자로 변환해주는 보조 스트림
			//InputStreamReader
			//원래 바이트만 지원데는 System.in
			
			int i = 0;
			while((i=isr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		br.readLine();//한줄 한줄 다 읽어준다.
		//Reader라서 BefferReader로 감쌀수있다.
	}
}
