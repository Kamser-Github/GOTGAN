package day0716;

public class BlockTest {
	
	//Ŭ���� �ʱ�ȭ�� �켱 �ȴ���.
	static {
		System.out.println("static { }");
	}
	//new �����ڷ� �ν��Ͻ��� �����ϸ�
	//�ν��Ͻ� ���� ���� ����ǰ�.
	{
		System.out.println("{ }");
	}
	//���������� �����ڰ� ���������.
	public BlockTest() {     
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		

			System.out.println("BlockTest bt = new BlockTest(); ");
			BlockTest bt = new BlockTest();

			System.out.println("BlockTest bt2 = new BlockTest(); ");
			BlockTest bt2 = new BlockTest();
		}
	}
