package day3;

public class ObjectReferencCopy {
		//���� ���� �� Ŭ������
		//�޼ҵ� ������ �ö󰣴�.
		//�׸��� ���� �޼ҵ尡 �ݽ��ÿ� ȣ��ȴ�.
	//���� Ŭ���� �ȿ� ���� ��������,���������
	//������ ������ �� �Ʒ��� ������ �Ȱ���.
	//�޸𸮿� �Ҵ�Ǵ� �������� ���� �ʱ�ȭ�� �ȴ�.
	public static void main(String[] args) {
		
		Data2 data2 = new Data2();
		//1.Data Ÿ���� data ������ ���������.
		//2.new �����ڷ� �ν��Ͻ��� ���������.
		//3.Data() �޼ҵ�� �ν��Ͻ��� �ʱ�ȭ�ȴ�.
		//4.��������data ������ �ν��Ͻ� �ּҰ� ����ȴ�.
		
		System.out.println("���� data.x�� ����"+data2.x);
		
		change(data2);
		//���������� ����Ų �ν��Ͻ� ������ ���� �ִ°� �ƴ϶�
		//�������� ��ü �� �ν��Ͻ� �ּҸ� change�� �޼ҵ忡 ���ڷ� �־���.
		//���� change�� data�� ���������� Data�� x�� ���� �����Ͽ���.
		
		System.out.println("change ������ x�ǰ���"+data2.x);
		
	}
	
	static void change(Data2 data2){
		data2.x = 1000;
		System.out.println("change x�ǰ���"+data2.x);
	}
}

class Data2{
	int x;
}