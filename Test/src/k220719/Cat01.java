package k220719;

public class Cat01 extends Animal01{
	//첫 오류는
	//조상 클래스를 먼저 초기화를 해야
	//자손 클래스 변수가 조상 클래스 변수를 사용할수 있으므로
	//조상 클래스 초기화를 해야하는데
	//디폴트 생성자가없으므로 따로 지정해주거나
	//자손클래스에서 super로 생성해준다.
	private String eatFood;
	
	//생성자 호출
	public Cat01(int size,String name,int price,String eatFood) {
		super(size,name,price); //로 코드 중복을 막아주며
		this.eatFood = eatFood;
	}
	
	//남은 오류는 완성되지 못한 추상클래스를
	//완성시켜서 하나의 클래스 역할을 하던지
	//아니면 또 다른 하나의 추상클래스가 되던지
	@Override
	public void bark() {
		System.out.println("이얏호응");
	}
	@Override
	public void character() {
		System.out.println("물을 싫어합니다.");
	}
	@Override
	public int lifeSpan() {
		return 15;
	}
	public void hateMotion() {
		System.out.println(getName()+"가 씩씩댄다.");
	}
	
	//getter
	public String getFood() { return eatFood; }
	
	//setter
	public void setFood(String food) { eatFood=food; }
	
}
