package k220719;

public class Dog01 extends Animal01 {
	
	private int age;
	
	//������
	public Dog01(int size,String name,int price,int age	) {
		super(size,name,price);
		this.age = age;
	}
	
	//�̿ϼ��� �߻� Ŭ����
	@Override
	public void bark() {
		System.out.println("����");
	}
	@Override
	public void character() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public int lifeSpan() { return 20; }
	
	public void happyMotion() {
		System.out.println(getName()+"�� ������ ����");
	}
	
	//getter
	public int getAge() {return age;}
	
	//setter
	public void setAge(int age2) { age = age2;}
	
	
}
