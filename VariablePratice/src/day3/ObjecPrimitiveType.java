package day3;

public class ObjecPrimitiveType {
		//���� ����
		//�ۺ� Ŭ����
		//Object0713�� �����ȴ�.
		//�׸��� main�޼ҵ尡 ����鼭
		//�ݽ��� �� �Ʒ��� ���θ޼ҵ尡 �ٸ� �޼ҵ带 ȣ���Ų��.
	public static void main(String[] args) {
		
		Data data = new Data();
		//���� ���� �ݽ��ÿ���
		//data��� Data Ÿ���� �޸� ������ �����
		//���� new�����ڷ� Data Ŭ������ �ν��Ͻ��� �����ǰ�
		//Data() �޼���� �ʱ�ȭ�� �ȴ�.
		//data ������ ������ �ν��Ͻ� �ּҰ� ����ȴ�.0x100
		data.x = 10;
		//�ν��Ͻ��� ���������� ���ؼ��� ������ �����ѵ�
		//data ������ ���� ������ �ν��Ͻ� x���� 10���� �����Ͽ���.
		
		System.out.println("data�� x�� ����"+data.x);
		//���θ޼ҵ尡 print.ln �޼ҵ带 �θ��鼭
		//�ݽ��� �޸𸮿� ���θ޼ҵ�� ���� ����Ʈ�� ���߿� �����鼭
		//���� ����� �ȴ�.
		
		change(data.x);
		//change �޼ҵ�� x�� ���� �����Ѵ�.
		//���θ޼ҵ� ���� change �޼ҵ尡 �θ� ����Ʈln�� �ۼ��ǰ�
		//change�� ������ ���� �����Ͽ� ����� �ٽ� ���ƿ´�.
		
		//�ٽ� d.x�� ���� ����Ǿ����� Ȯ���ϱ� ���ؼ�
		System.out.println(data.x);
		//����غ���.
		
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change�� x����"+x);
	}
}

class Data{int x;}