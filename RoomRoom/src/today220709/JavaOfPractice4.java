package today220709;
//인스턴스 생성과 사용  6-2예제
public class JavaOfPractice4 {

	public static void main(String[] args) {

		TV tv1 = new TV();
		
		System.out.println("t1의 채널은 현재 : "+tv1.channel+"번 입니다");
		
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("t1의 채널은 현재 : "+tv1.channel+"번 입니다");
	}
}

class TV{
	
	String color;
	boolean power;
	int channel;
	
	void power() { power =!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}