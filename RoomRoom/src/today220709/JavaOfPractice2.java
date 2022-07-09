package today220709;
//인스턴스 생성과 사용 
public class JavaOfPractice2 {

	public static void main(String[] args) {
		
		Hamberger bergerKing = new Hamberger();
		bergerKing.price = 1000;
		bergerKing.name = "whaper";
		bergerKing.picle();
		
		
	}
}

class Hamberger{
	
	String name;
	boolean picle;
	int price;
	
	void picle() { picle = !picle; }
}


