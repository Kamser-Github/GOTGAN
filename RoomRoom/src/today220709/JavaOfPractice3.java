package today220709;

//인스턴스 생성과 사용 예제 6-1 연습 2;
public class JavaOfPractice3 {

	public static void main(String[] args) {

		NoteBook thinkPad = new NoteBook();
		thinkPad.price = 560000;
		thinkPad.makser = "lenover";
		thinkPad.inch = 15;
		thinkPad.weight = 1.7;
		
		thinkPad.powerOn();
		thinkPad.bettery();
		thinkPad.f2();
		
	}

}

class NoteBook{
	
	int price;
	String makser;
	double weight;
	int inch;
	boolean power;
	
	
	void powerOn() {power = !power; }
	void f2() {System.out.println("바이오스에 진입합니다");}
	void bettery() { System.out.println(" 배터리를 충전해주세요 "); }
	
}
	

