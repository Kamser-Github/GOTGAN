package kr.co.stream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
public class DataInOutStreamTest {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("C:/iotest/data.txt");
			DataOutputStream dos = new DataOutputStream(fos); ){
			//자료형 바이트 만큼 써주기 때문에 바이트만큼 읽어줘야한다.
			dos.write(100);//1byte
			dos.writeInt(100);//4byte
			dos.writeChar('A');
			dos.writeUTF("hELLO");
		} catch ( IOException e ) {
			
		}
		
		try(FileInputStream fis = new FileInputStream("C:/iotest/data.txt");
				DataInputStream dis = new DataInputStream(fis);){
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			//쓴 순서대로 뽑아와야한다.
		}catch(IOException e) {
			
		}
	}
}
