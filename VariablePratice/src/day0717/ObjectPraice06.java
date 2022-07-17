package day0717;

public class ObjectPraice06 {
	public static void main(String[] args) {
		Point2[] p = {
				new Point2(100,100),
				new Point2(140,50),
				new Point2(200,100),
		};
		Triangle2 t = new Triangle2(p);
		Circle2 c = new Circle2(p[0],50);
		
		t.draw();
		c.draw();
	}
}

//���� Ŭ����
class Shape2{
	String color = "black";
	//�⺻�� ������ ĳ������ �Ұ��
	//����Ÿ�� ���� ���󰣴� �����Ұ�.
	//�ż���� �������̵��Ȱ� ����.
	void draw() {
		System.out.printf("[color=%s]%n",color);
	}
}

class Point2{
	int x;
	int y;
	
	//������ 
	Point2(int x,int y){
		this.x = x;
		this.y = y;
		//��ǥ ���
		//this�� �ڱ� �ڽ� ���������� ����Ų��.
	}
	Point2(){
		this(0,0);
		//this()
		//Ŭ���� ���� �� �ٸ� �����ڸ� ȣ���� �Ѵ�.
	}
	//��ǥ�� ��� �ż���,�����̳� ����� �ص� ����Ҽ��մ�.
	String getXY() {
		return "("+x+","+y+")"; 
	}
}
//���
//����� ��쿡 ���� Ŭ���� 
//�����ڿ� �ʱ�ȭ ���� ����� ���� �ʴ´�

class Circle2 extends Shape2{
	Point2 center;
	//����Ʈ ��ü�� �����ߴ�.�����ڸ� �ҷ�����ȴ�.
	int r;
	
	Circle2(){
		this(new Point2(0,0),100);
	}
	Circle2(Point2 center,int r){
		this.center = center;
		this.r = r;
		//�Ű��������� new�� ���̰� �ִ� �ʿ����� ��� �����ϴ�.
		//������ �޾ƸԴ°�.
	}
	//�������̵�
	//��ȯŸ�� �̸� �Ű����� ��� ����
	//���빰�� �ٸ���
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
	
}

class Triangle2 extends Shape2{
	Point2[] p = new Point2[3];
	
	Triangle2(Point2[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}