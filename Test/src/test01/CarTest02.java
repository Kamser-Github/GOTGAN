package test01;

import java.io.IOException;
import kr.co.interface4.*;

public class CarTest02 {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("��� �̵��Ͻðڽ��ϱ�?");
		System.out.println("C : �ڵ����� �̵�");
		System.out.println("T : ���߱������� �̵�");
		System.out.println("W : �ɾ �̵�");
		System.out.println("B : �����ŷ� �̵�");	
		
		int ch = System.in.read();
		Guiding gui = null; //�ϴ� null�� �������� ����Ҹ� �ʱ�ȭ ���ش�.
		while(gui==null) {
			switch(+ch) {
			case +'C': case +'c':
				gui = new Car();
				break;
			case +'T': case +'t':
				gui = new Trans();
				break;
			case +'W': case +'w':
				gui = new Walking();
				break;
			case +'B': case +'b':
				gui = new Bicycle();
				break;
			default :
				System.out.println("�ٽ� �Է����ּ���");
			}
		}
		gui.findLoad();
		gui.InformTime();
	}
}
