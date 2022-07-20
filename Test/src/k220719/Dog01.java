package k220719;

public class Dog01 extends Animal01 {
	
	private int age;
	
	//생성자
	public Dog01(int size,String name,int price,int age	) {
		super(size,name,price);
		this.age = age;
	}
	
	//미완성된 추상 클래스
	@Override
	public void bark() {
		System.out.println("컹컹");
	}
	@Override
	public void character() {
		System.out.println("물을 좋아합니다.");
	}
	@Override
	public int lifeSpan() { return 20; }
	
	public void happyMotion() {
		System.out.println(getName()+"가 꼬리를 흔든다");
	}
	
	//getter
	public int getAge() {return age;}
	
	//setter
	public void setAge(int age2) { age = age2;}
	
	
}
