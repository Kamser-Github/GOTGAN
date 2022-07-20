package k220719;

public class Cat01 extends Animal01{
	//ù ������
	//���� Ŭ������ ���� �ʱ�ȭ�� �ؾ�
	//�ڼ� Ŭ���� ������ ���� Ŭ���� ������ ����Ҽ� �����Ƿ�
	//���� Ŭ���� �ʱ�ȭ�� �ؾ��ϴµ�
	//����Ʈ �����ڰ������Ƿ� ���� �������ְų�
	//�ڼ�Ŭ�������� super�� �������ش�.
	private String eatFood;
	
	//������ ȣ��
	public Cat01(int size,String name,int price,String eatFood) {
		super(size,name,price); //�� �ڵ� �ߺ��� �����ָ�
		this.eatFood = eatFood;
	}
	
	//���� ������ �ϼ����� ���� �߻�Ŭ������
	//�ϼ����Ѽ� �ϳ��� Ŭ���� ������ �ϴ���
	//�ƴϸ� �� �ٸ� �ϳ��� �߻�Ŭ������ �Ǵ���
	@Override
	public void bark() {
		System.out.println("�̾�ȣ��");
	}
	@Override
	public void character() {
		System.out.println("���� �Ⱦ��մϴ�.");
	}
	@Override
	public int lifeSpan() {
		return 15;
	}
	public void hateMotion() {
		System.out.println(getName()+"�� �������.");
	}
	
	//getter
	public String getFood() { return eatFood; }
	
	//setter
	public void setFood(String food) { eatFood=food; }
	
}
