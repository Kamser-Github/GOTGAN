package today220709;
//클래스 변수 초기화와 인스턴스 변수 초기화 연습 2;


class EDIYA2{
	static int count = 0;
	int orderNumber;
	{
		++count;
		orderNumber = count;
	}
	
}


public class JavaOfPractice7 {

	public static void main(String[] args) {
		
		EDIYA2 customer1 = new EDIYA2();
		System.out.println(customer1.count);
		
	
	}
}

