package kr.co.stream;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamTest01 {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("c:/iotest/sample2.txt")){
			
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs))!=-1) {
				for(int j=0 ; j<i ;j++) {
					System.out.print((char)bs[j]);
				}
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				//10개씩 읽을때 남은 곳은 그대로 출력된다.
				//처음읽은것이 1 2 3 4 5 6 7 8 9 10
				//두번째읽은것 A B C D E
				//실제로출력은 A B C D R 6 7 8 9 10
				//저장된 값이 그대로 출력된다
				//따라서 하나씩 불러와서 출력하거나
				//API를 잘읽고 필요한 매서드를 가져와야한다.
				System.out.println();
			}
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
