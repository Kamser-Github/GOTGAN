package k220719;

//�߻� Ŭ������
//�̿ϼ��� Ŭ������.
//�ָ��ϰ� �ϼ��� ���赵��
//������� �ڱ⿡�� �´� �������̵��� �ϰų�
//�� �ٸ� �߻�Ŭ������ �Ǽ� �ٸ� Ÿ���� �ǰų�
//��Ӱ��� �ݴ밡 �Ǵ� �����̴�.

public abstract class Animal01 {
	
	private int size;
	private String name;
	private int price;
	
	public Animal01(int size,String name,int price) {
		this.size = size;
		this.name = name;
		this.price = price;
	}
	
	abstract public void bark();
	abstract public void character();
	abstract public int lifeSpan();
	
	//getter
	public int getPrice() {return price;}
	public String getName() {return name;}
	
	//setter
	public void setPrice(int price) {this.price=price;}
	
}
