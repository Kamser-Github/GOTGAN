package day3;

public class ObjectReferenceType {
	
	public static void main(String[] args) {
		
		Data3 data3 = new Data3();
		data3.x=10;
		System.out.println("���� data3.x�� ����"+data3.x);
		
		Data3 d3 = copy(data3);
		System.out.println("���� d3.x�� ����"+d3.x);
		
		//���⼭ ������ �ϴ°� �ż��� �ȿ� �ִ�
		//�������� lv�� ������⶧����
		//������ ������ �����ؼ� �ν��Ͻ� �ּҸ� ���ڷι޾Ƽ�
		//���� ���Թ����ڿ�
		//d3�� �� �ּҸ� �����ߴ�.
		//d3�� new ������ ���� DataŸ���� data3�� ���� �����Ӵ�.
	}
	
	static Data3 copy(Data3 data3) {
		Data3 tmp = new Data3();
		tmp.x=data3.x;
		return tmp;
	}
}
class Data3{
	int x;
}