package today220709;
//인스턴스 생성과 사용  6-2예제
public class JavaOfPractice6 {

	public static void main(String[] args) {

		EDIYA son = new EDIYA();
		son.iceCoffe();
		System.out.println(son.price);
		son.iceJuice();
		System.out.println(son.price);
		
		//이렇게 하니까 메뉴를 바꿀때마다 가격도 바낀다.
	}
}


class EDIYA{
	String menu;
	int price;
	
	public void iceCoffe() {
		this.menu = "iceCoffe";
		this.price = 3500;
		ice();
	}
	
	public void iceJuice() {
		this.menu = "iceJuice";
		this.price = 4500;
		ice();
	}
	
	private void ice() {
		System.out.println("얼음이 들어갑니다.");
	}
	
}