package day0716;

public class BlockTest {
	
	//클래스 초기화가 우선 된다음.
	static {
		System.out.println("static { }");
	}
	//new 연산자로 인스턴스를 생성하면
	//인스턴스 블럭이 먼저 실행되고.
	{
		System.out.println("{ }");
	}
	//마지막으로 생성자가 만들어진다.
	public BlockTest() {     
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		

			System.out.println("BlockTest bt = new BlockTest(); ");
			BlockTest bt = new BlockTest();

			System.out.println("BlockTest bt2 = new BlockTest(); ");
			BlockTest bt2 = new BlockTest();
		}
	}
