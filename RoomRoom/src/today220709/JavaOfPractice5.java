package today220709;
//블럭 초기화
class Product{
	
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {}
}

/*먼저 count가 선언되고 이 그이후에 0으로 초기화;
 * 클래스 블럭이 없으니까 인스턴스 블럭으로 내려가고
 * 카운트가 추가 되며 , 시리얼넘버에 할당된다.
 * 이 카운트는 인스턴스를 생성할때마다 초기화가 된다.
 */

public class JavaOfPractice5 {
	
	public static void main(String[] args) {

		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호는 "+p1.serialNo);
		System.out.println("p1의 제품번호는 "+p2.serialNo);
		System.out.println("p1의 제품번호는 "+p3.serialNo);
	}
	
}